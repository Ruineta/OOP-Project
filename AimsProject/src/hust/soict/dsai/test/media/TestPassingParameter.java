package hust.soict.dsai.test.media;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class TestPassingParameter {
    
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        DigitalVideoDiscWrapper wjungleDVD = new DigitalVideoDiscWrapper(jungleDVD);
        DigitalVideoDiscWrapper wcinderellaDVD = new DigitalVideoDiscWrapper(cinderellaDVD);

        // Wrong swap() function
        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle_hacd());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle_hacd());

        // changeTitle(jungleDVD, cinderellaDVD.getTitle());
        // System.out.println("jungle dvd title: " + jungleDVD.getTitle());

        // Correct swap() function
        swap(wjungleDVD, wcinderellaDVD);
        System.out.println("Correct swapped jungle dvd title: " + wjungleDVD.dvd.getTitle_hacd());
        System.out.println("Correct swapped cinderella dvd title: " + wcinderellaDVD.dvd.getTitle_hacd());
    }
    // Wrong swap() function
    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    // Correct swap() function
    public static void swap(DigitalVideoDiscWrapper o1, DigitalVideoDiscWrapper o2) {
        DigitalVideoDisc tmp = o1.dvd;
        o1.dvd = o2.dvd;
        o2.dvd = tmp;
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle_hacd();
        dvd.setTitle_hacd(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }

    
}