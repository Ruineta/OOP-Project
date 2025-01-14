package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.PlayerException;

public class DigitalVideoDisc extends Disc implements Playable {
    
    // Constructor 
    public DigitalVideoDisc(String title) {
        super(title);
    }    
    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
    }
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title, category, director, cost);
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
    }


    @Override
    public String toString() {
        return this.getId_hacd() + " - DVD: " + this.getTitle_hacd() +
                " - Category: " + this.getCategory_hacd() +
                " - Director: " + this.getDirector_hacd() +
                " - DVD length: " + this.getLength_hacd() +
                " - Cost: " + this.getCost_hacd() + "$";
    }

    // Play method
    @Override
    public void play_hacd() {
        System.out.println("Playing DVD: " + this.getTitle_hacd());
        System.out.println("DVD length: " + this.getLength_hacd());
    }

    public String playGUI_hacd() throws PlayerException {
        if (this.getLength_hacd() > 0) {
                return "Playing DVD: " + this.getTitle_hacd() + "\n" + 
                    "DVD length: " + formatDuration_hacd(this.getLength_hacd());
            } else {
                throw new PlayerException("ERROR: DVD length is non-positive!");
            }
    }
}
