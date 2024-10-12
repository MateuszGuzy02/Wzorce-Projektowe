package Fabryka.FabrykaAbstrakcyjna;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    Ciasto dough;
    Sos sauce;
    ArrayList<String> toppings = new ArrayList<>();

    public String getName() { return name; }
    public void prepare() {
        System.out.println("Przygotowanie pizzy: " + name);
    }

    public void bake() {
        System.out.println("Pieczenie");
    }

    public void cut() {
        System.out.println("Cięcie");
    }

    public void box() { System.out.println("Pakowanie"); }

    @Override
    public String toString() {
        return "Pizza{" +
                "nazwa='" + name + '\'' +
                ", ciasto='" + dough + '\'' +
                ", sos='" + sauce + '\'' +
                ", składniki=" + toppings +
                '}';
    }
}
