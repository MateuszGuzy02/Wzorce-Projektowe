package Iterator.iterator2;

import java.util.ArrayList;
import java.util.Iterator;


public class PancakeHouseMenu implements Menu {
    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addItem("Pancakes", "Pancakes with syrup", 2.99);
        addItem("Waffles", "Waffles with blueberries", 3.59);
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
