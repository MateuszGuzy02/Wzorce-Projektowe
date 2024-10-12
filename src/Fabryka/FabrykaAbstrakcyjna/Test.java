package Fabryka.FabrykaAbstrakcyjna;

public class Test {
    public static void main(String[] args) {
        PizzaStore wloskaPizzeria = new WloskaPizzaStore();
        PizzaStore amerykanskaPizzeria = new AmerykanskaPizzaStore();

        Pizza pizza = wloskaPizzeria.createPizza("wegetarianska");
        System.out.println(pizza);

        pizza = amerykanskaPizzeria.createPizza("serowa");
        System.out.println(pizza);
    }
}
