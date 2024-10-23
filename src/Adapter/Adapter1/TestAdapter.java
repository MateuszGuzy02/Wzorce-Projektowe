package Adapter.Adapter1;

import java.util.ArrayList;
import java.util.Arrays;

public class TestAdapter {
    public static void main(String[] args) {

        ZwyklyKrolik krolik = new ZwyklyKrolik();
        ZwyklyZajac zajac = new ZwyklyZajac();

        // Adapter Zająca, by udawał Królika
        Krolik zajacAdapter = new AdapterZajac(zajac);

        System.out.println("Królik:");
        krolik.skacz();
        krolik.jedzMarchewke();

        System.out.println("\nZając przez adapter:");
        zajacAdapter.skacz();
        zajacAdapter.jedzMarchewke();


        System.out.println("\n\nTest\n");
        ArrayList<Krolik> kroliki = new ArrayList<>(Arrays.asList(new ZwyklyKrolik(), new AdapterZajac(new ZwyklyZajac())));

        kroliki.forEach(TestAdapter::testKrolik);
    }

    public static void testKrolik(Krolik krolik) {
        krolik.skacz();
        krolik.jedzMarchewke();
    }
}
