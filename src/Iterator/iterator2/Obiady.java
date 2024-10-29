package Iterator.iterator2;

import java.util.ArrayList;
import java.util.Iterator;

public class Obiady implements Menu {
    private ArrayList<MenuItem> menuItems;

    public Obiady() {
        menuItems = new ArrayList<>();
        addItem("Obiad1", "Opis", 10.0);
        addItem("Obiad2", "Opis", 20.0);
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
