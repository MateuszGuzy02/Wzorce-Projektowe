package Iterator.iterator3;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {

    private MenuItem[] items;
    int position = 0;


    public DinerMenuIterator(MenuItem[] list) {
        this.items = list;
    }

    @Override
    public boolean hasNext() {
            return position < items.length && items[position] != null;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("Nie możesz usunąć elementu, dopóki nie wykonasz co najmniej jednego next()");
        }
        if (items[position - 1] != null) {
            for (int i = position - 1; i < (items.length - 1); i++) {
                items[i] = items[i +1];
            }
            items[items.length - 1] = null;
        }
    }
}