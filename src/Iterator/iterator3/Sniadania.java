package Iterator.iterator3;

import java.util.ArrayList;
import java.util.Iterator;

public class Sniadania implements Menu {

    private ArrayList<MenuItem> menuItems;

    public Sniadania() {
        menuItems = new ArrayList<>();
        addItem("Sniadanie1", "Opis", 10.0);
        addItem("Sniadanie2", "Opis", 20.0);
    }

    public void addItem(String nazwa, String opis, double cena) {
        MenuItem menuItem = new MenuItem(nazwa, opis, cena);
        menuItems.add(menuItem);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
