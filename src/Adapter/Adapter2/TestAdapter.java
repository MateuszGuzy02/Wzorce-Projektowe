package Adapter.Adapter2;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class TestAdapter {
    public static void main(String[] args) {

        Vector v = new Vector(Arrays.asList("1: Dawid", "2: Mateusz", "3: Krzysztof"));

        Iterator iterator = new EnumerationIterator(v.elements());

        while(iterator.hasNext()) {
            System.out.println(iterator.next());

            Enumeration enumeration = v.elements();

            while(enumeration.hasMoreElements()) {
                System.out.println(enumeration.nextElement());
            }
        }
    }
}
