package Fabryka.FabrykaAbstrakcyjna;


public class WloskaPizzaStore extends PizzaStore {

    Pizza pizza = null;
    FabrykaSkladnikowPizzy fabryka = new WloskaFabrykaSkladnikowPizzy();
     protected Pizza createPizza(String item) {
        if(item.equals("wegetarianska")) {
            pizza = new VeggiePizza(fabryka);
        }
         if(item.equals("serowa")) {
            pizza = new CheesePizza(fabryka);
         }
        return pizza;
    }
}
