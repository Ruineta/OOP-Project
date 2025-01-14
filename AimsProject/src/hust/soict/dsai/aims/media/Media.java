package hust.soict.dsai.aims.media;

import java.time.Duration;
import java.util.Comparator;

import hust.soict.dsai.aims.exception.PlayerException;

public abstract class Media implements Comparable<Media> {

    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    
    private static int nbMedia = 0;
    private int id;

    private String title;
    private String category;
    private float cost;

    // Constructor 
    public Media(String title) {
        this.title = title;
		this.id = ++nbMedia;
    }
    public Media(String title, String category) {
        this.title = title;
        this.category = category;
        this.id = ++nbMedia;
    }
    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = ++nbMedia;
    }
    
    // Getter method
    public int getId_hacd() {
        return id;
    }
    public String getTitle_hacd() {
        return title;
    }
    public String getCategory_hacd() {
        return category;
    }
    public float getCost_hacd() {
        return cost;
    }

    // Setter method
    public void setTitle_hacd(String title) {
        this.title = title;
    }
    
    // Check is title match
    public boolean isMatch_hacd(String title) {
        return this.getTitle_hacd().toLowerCase().contains(title.toLowerCase());
    }

    public void play_hacd() {
        System.out.println("Playing media");
    }
    
    public String playGUI_hacd() throws PlayerException {
        return "Playing media";
    }

    public String formatDuration_hacd(int durationInSeconds) {
        Duration duration = Duration.ofSeconds(durationInSeconds);
        return String.format("%02d:%02d", duration.toMinutes(), duration.minusMinutes(duration.toMinutes()).getSeconds());
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Media)) {
            return false;
        }
        return ((Media)obj).getTitle_hacd() == this.getTitle_hacd();
    }

    @Override
    public String toString() {
        return "Media: " + this.getTitle_hacd() +
                " - Category: " + this.getCategory_hacd() +
                " - Cost: " + this.getCost_hacd() + "$";
    }

    // Answer for the second question
    @Override
    public int compareTo(Media other) {
        int titleComparison = this.getTitle_hacd().compareTo(other.getTitle_hacd());
        if (titleComparison != 0) {
            return titleComparison;
        } else {
            return Double.compare(this.getCost_hacd(), other.getCost_hacd());
        }
    }
}