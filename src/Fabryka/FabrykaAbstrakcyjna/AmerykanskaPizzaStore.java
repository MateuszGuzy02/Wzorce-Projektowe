package Fabryka.FabrykaAbstrakcyjna;


public class AmerykanskaPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {

        Pizza pizza = null;
        FabrykaSkladnikowPizzy fabryka = new AmerykanskaFabrykaSkladnikowPizzy();

        if (item.equals("wegetarianska")) {
            pizza =  new VeggiePizza(fabryka);
        }
        if(item.equals("serowa")) {
            pizza = new CheesePizza(fabryka);
        }
         return pizza;
    }
}
