package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare(Media o1, Media o2) {
        // Compare by title
        int titleComparison = o1.getTitle_hacd().compareTo(o2.getTitle_hacd());
        if (titleComparison != 0) {
            return titleComparison;
        }
        // Compare by cost
        return Double.compare(o2.getCost_hacd(), o1.getCost_hacd());
    }


        
}
