package Fabryka.MetodaFabrykujaca;

public class Test {
    public static void main(String[] args) {
        PizzaStore wloskaStore = new WloskaPizzaStore();
        PizzaStore amerykanskaStore = new AmerykanskaPizzaStore();

        Pizza pizza = wloskaStore.orderPizza("wegetarianska");
        System.out.println("Zamowiono " + pizza + "\n");

        pizza = amerykanskaStore.orderPizza("wegetarianska");
        System.out.println("Zamowiono " + pizza + "\n");
    }
}
