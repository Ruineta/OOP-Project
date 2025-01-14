package hust.soict.dsai.aims.screen;

import javax.swing.*;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.store.Store;

import java.awt.*;
import java.util.*;
import java.awt.event.*;


public class StoreScreen extends JFrame {
    private static Store store = new Store();
    private static Cart cart = new Cart();

    public static void initSetup() {

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Aller", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Alladin", "Animation", null,0, 18.99f);

        Book book1 = new Book("Sherlock Holmes", "Thriller", 21.89f);
        Book book2 = new Book("One Thousand and One Nights", "Adventure", 25.99f);
        Book book3 = new Book("Robin Hood", "Novel", 18.89f);

        CompactDisc cd1 = new CompactDisc("Tobu Best Songs Collection", "Music", "Tobu", 45.99f);
        Track track1CD1 = new Track("Color", 5);
        Track track2CD1 = new Track("Life", 5);
        Track track3CD1 = new Track("High", 4);

        CompactDisc cd2 = new CompactDisc("Lé Miserablé", "Music", "Variable Artists",35.99f);
        Track track1CD2 = new Track("I Dreamed a Dream", 5);
        Track track2CD2 = new Track("Look Down", 2);
        Track track3CD2 = new Track("Stars", 3);

        CompactDisc cd3 = new CompactDisc("Katie Perrie", "Music", "Katy Perry", 63.99f);
        Track track1CD3 = new Track("Roar", 6);
        Track track2CD3 = new Track("Firework", 5);
        Track track3CD3 = new Track("Dark Horse", 5);

        cd1.addTrack_hacd(track1CD1);
        cd1.addTrack_hacd(track2CD1);
        cd1.addTrack_hacd(track3CD1);

        cd2.addTrack_hacd(track1CD2);
        cd2.addTrack_hacd(track2CD2);
        cd2.addTrack_hacd(track3CD2);

        cd2.addTrack_hacd(track1CD3);
        cd2.addTrack_hacd(track2CD3);
        cd2.addTrack_hacd(track3CD3);

        store.addMedia_hacd(dvd1);
        store.addMedia_hacd(dvd2);
        store.addMedia_hacd(dvd3);
        store.addMedia_hacd(book1);
        store.addMedia_hacd(book2);
        store.addMedia_hacd(book3);
        store.addMedia_hacd(cd1);
        store.addMedia_hacd(cd2);
        store.addMedia_hacd(cd3);
        

    }
    
    public static void main(String[] args) {
        initSetup();
		new StoreScreen(store);
	}


    public StoreScreen(Store store) {
        StoreScreen.store = store;
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);
        
        setTitle("Store");
		setSize(1024, 768);
		setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }   

    JPanel createNorth() {
		JPanel north = new JPanel();
		north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
		north.add(createMenuBar());
		north.add(createHeader());
		return north;
	}

    JMenuBar createMenuBar() {

        JMenu menu = new JMenu("Options");

        JMenu smUpdateStore = new JMenu("Update Store");
        JMenuItem smAddBook = new JMenuItem("Add Book");
        JMenuItem smAddCD = new JMenuItem("Add CD");
        JMenuItem smAddDVD = new JMenuItem("Add DVD");
        smUpdateStore.add(smAddBook);
        smUpdateStore.add(smAddCD);
        smUpdateStore.add(smAddDVD);        

        smAddBook.addActionListener(new btnMenuListener());
        smAddCD.addActionListener(new btnMenuListener());
        smAddDVD.addActionListener(new btnMenuListener());

        menu.add(smUpdateStore);

        JMenuItem viewStoreMenu = new JMenuItem("View store");
        JMenuItem viewCartMenu = new JMenuItem("View cart");
        menu.add(viewStoreMenu);
        menu.add(viewCartMenu);
        viewStoreMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new StoreScreen(store);
            }
        });
        viewCartMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CartScreen(cart);
            }
        });

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);

        return menuBar;
    }

    private class btnMenuListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			if (command.equals("Add Book")) {
				new AddBookToStoreScreen(store);
			} else if (command.equals("Add CD")) {
				new AddCompactDiscToStoreScreen(store);
			} else if (command.equals("Add DVD")) {
				new AddDigitalVideoDiscToStoreScreen(store);
			} 
		}
	}

    JPanel createHeader() {

        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.CYAN);
    
        JButton cartBtn = new JButton("View cart");
        cartBtn.setPreferredSize(new Dimension(100, 50));
        cartBtn.setMaximumSize(new Dimension(100, 50));
        cartBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CartScreen(cart);
            }
        });
        


        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(cartBtn);
        header.add(Box.createRigidArea(new Dimension(10, 10)));

        return header;
    }

    JPanel createCenter() {

        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3, 3, 2, 2));


        ArrayList<Media> mediaInStore = store.getItemsInStore();
        for (int i = 0; i < mediaInStore.size(); i++) {
            MediaStore cell = new MediaStore(mediaInStore.get(i), cart);
            center.add(cell);
        }
        
        return center;
    }

}
