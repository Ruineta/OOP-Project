package hust.soict.dsai.aims.media;

import java.time.Duration;

import hust.soict.dsai.aims.exception.PlayerException;

public class Track implements Playable {
    
    private String title;
    private int length;

    // Constructor 
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    // Play method
    public void play_hacd() {
        System.out.println("Playing track: " + this.getTitle_hacd());
        System.out.println("Track length: " + this.getLength_hacd());
    }
    public String playGUI_hacd() throws PlayerException {
        if (this.getLength_hacd() > 0) {
            return "Playing track: " + this.getTitle_hacd() + "\n" + 
                "Track length: " + formatDuration_hacd(this.getLength_hacd());
        } else {
            throw new PlayerException("ERROR: Track length is non-positive!");
        }
    
        
    }
    public String formatDuration_hacd(int durationInSeconds) {
        Duration duration = Duration.ofSeconds(durationInSeconds);
        return String.format("%02d:%02d", duration.toMinutes(), duration.minusMinutes(duration.toMinutes()).getSeconds());
    }
    // Getter method
    public String getTitle_hacd() {
        return title;
    }
    public int getLength_hacd() {
        return length;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {  
            return true;
        }
        if (!(obj instanceof Track)) {
            return false;
        }
        return ((Track)obj).getTitle_hacd() == this.getTitle_hacd() && ((Track)obj).getLength_hacd() == this.getLength_hacd();
    }
}
