package Iterator.iterator2;

import java.util.Iterator;

public class DinerMenu implements Menu {
    private static final int MAX_ITEMS = 6;
    private int numberOfItem = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Schab", "Bardzo dobry", 2.0);
    }

    public void addItem(String nazwa, String opis, double cena) {
        if(numberOfItem >= MAX_ITEMS) {
            System.out.println("Menu jest pełne");
        }
        else {
            menuItems[numberOfItem] = new MenuItem(nazwa, opis, cena);
            numberOfItem++;
        }
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
