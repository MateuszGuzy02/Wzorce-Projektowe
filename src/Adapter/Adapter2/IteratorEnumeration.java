package Adapter.Adapter2;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorEnumeration<T> implements Enumeration<T> {
    private Iterator<T> iterator;

    public IteratorEnumeration(Iterator<T> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public T nextElement() {
        if(!hasMoreElements()) {
            throw new NoSuchElementException();
        }
        return iterator.next();
    }


}
