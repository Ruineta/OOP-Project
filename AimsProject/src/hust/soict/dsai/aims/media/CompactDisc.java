package hust.soict.dsai.aims.media;

import java.util.*;

import hust.soict.dsai.aims.exception.PlayerException;

public class CompactDisc extends Media implements Playable {

    private String artist;
    private List<Track> tracks = new ArrayList<Track>();; 

    // Getter method
    public String getArtist_hacd() {
        return artist;
    }

    // Constructor 
    public CompactDisc(String title) {
        super(title);
    }
    public CompactDisc(String title, String category, String artist, float cost) {
        super(title, category, cost);
        this.artist = artist;
    }

    // Add and remove track
    public void addTrack_hacd(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println("Track: " + track.getTitle_hacd() + " has been added to CD: " + this.getTitle_hacd());
        } else {
            System.out.println("Track already exists in CD.");
        }
    }

    public void removeTrack_hacd(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track: " +track.getTitle_hacd() + " has been removed from CD: " + this.getTitle_hacd());
        } else {
            System.out.println("Track does not exist in CD.");
        }
    }
    
    // Get length of the track
    public int getLength_hacd() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength_hacd();
        }
        return totalLength;
    }

    // Play method
    @Override
    public void play_hacd() {
        System.out.println("Playing CD: " + this.getTitle_hacd());
        System.out.println("CD length: " + this.getLength_hacd());
        for (Track track : tracks) {
            track.play_hacd();
        }
    }

    @Override
    public String toString() {
        return this.getId_hacd() + " - CD: " + this.getTitle_hacd() +
                " - Category: " + this.getCategory_hacd() +
                " - Artist" + this.getArtist_hacd() +
                " - Length: " + this.getLength_hacd() + " seconds" + 
                " - Cost: " + this.getCost_hacd() + "$";
    }


    public String playGUI_hacd() throws PlayerException {
        if(this.getLength_hacd() > 0) {
            String output =  "Playing CD: " + this.getTitle_hacd() + "\n" + 
                            "CD length: " + formatDuration_hacd(this.getLength_hacd()) + "\n"+ "\n";
            for (Track track : tracks) {
                try {
                    output += track.playGUI_hacd() + "\n";
                } catch (PlayerException e) {
                    output += track.getTitle_hacd() + "\n" + e.getMessage();
                }
            }
            return output;
            } else {
                throw new PlayerException("ERROR: CD length is non-positive!");
            }
    }
}
