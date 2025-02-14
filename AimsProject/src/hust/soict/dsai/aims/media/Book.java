package hust.soict.dsai.aims.media;

import java.util.*;

public class Book extends Media {
    
    private List<String> authors = new ArrayList<String>();
    
    // Constructor 
    public Book(String title) {
        super(title);
    }
    public Book(String title, String category) {
        super(title, category);
    }
    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }

    // Add and remove author 
    public void addAuthor_hacd(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
        } else {
            System.out.println("This author has already been in the list!");
        }
    }

    public void removeAuthor_hacd(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
        } else {
            System.out.println("No author has been found to remove!");
        }
    }

    @Override
    public String toString() {
        return this.getId_hacd() + " - Book: " + this.getTitle_hacd() +
                " - Category: " + this.getCategory_hacd() +
                " - Cost: " + this.getCost_hacd() + "$";
    }
}
