package Iterator.iterator3;

import java.util.ArrayList;
import java.util.Iterator;

public class Kelnerka {
    private ArrayList<Menu> menus;

    public Kelnerka() {
        menus = new ArrayList<>();
    }

    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    public void serwujMenu() {
        for (Menu menu : menus) {
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem.getNazwa() + ", " + menuItem.getCena() + " -- " + menuItem.getOpis());
        }
    }
}
