package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media>{

    @Override
    public int compare(Media o1, Media o2) {
        // Compare by cost
        int costComparison = Double.compare(o2.getCost_hacd(), o1.getCost_hacd());
        if (costComparison != 0) {
            return costComparison;
        }
        // Compare by title
        return o1.getTitle_hacd().compareTo(o2.getTitle_hacd());        
    }
}
