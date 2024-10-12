package Fabryka.ProstaFabryka;

public class PizzaTestDriver {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);


        Pizza pizza = store.orderPizza("Cheese");
        System.out.println("Ordered a " + pizza);

        pizza = store.orderPizza("Veggie");
        System.out.println("Ordered a " + pizza);
    }
}
