package Fabryka.MetodaFabrykujaca;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
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
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
