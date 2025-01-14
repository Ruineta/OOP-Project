package hust.soict.dsai.test.disc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args) {
        //To-do Auto-generated method stub
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        swap_hacd(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle_hacd());
        System.out.println("Cinderella dvd title: " + cinderellaDVD.getTitle_hacd());

        newswap_hacd(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle_hacd());
        System.out.println("Cinderella dvd title: " + cinderellaDVD.getTitle_hacd());

        changeTitle_hacd(jungleDVD, cinderellaDVD.getTitle_hacd());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle_hacd());

    }

    public static void swap_hacd(Object o1, Object o2){
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    public static void newswap_hacd(DigitalVideoDisc disc1, DigitalVideoDisc disc2){
        DigitalVideoDisc tmp = new DigitalVideoDisc(disc1.getTitle_hacd(), disc1.getCategory_hacd(), disc1.getDirector_hacd(), disc1.getLength_hacd(), disc1.getCost_hacd());
        
        disc1.setTitle_hacd(disc2.getTitle_hacd());
        disc1.setCategory_hacd(disc2.getCategory_hacd());
        disc1.setDirector_hacd(disc2.getDirector_hacd());
        disc1.setLength_hacd(disc2.getLength_hacd());
        disc1.setCost_hacd(disc2.getCost_hacd());

        disc2.setTitle_hacd(tmp.getTitle_hacd());
        disc2.setCategory_hacd(tmp.getCategory_hacd());
        disc2.setDirector_hacd(tmp.getDirector_hacd());
        disc2.setLength_hacd(tmp.getLength_hacd());
        disc2.setCost_hacd(tmp.getCost_hacd());
    }

    public static void changeTitle_hacd(DigitalVideoDisc dvd, String title){
        String oldTitle = dvd.getTitle_hacd();
        dvd.setTitle_hacd(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}
