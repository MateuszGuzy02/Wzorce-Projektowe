package Fabryka.MetodaFabrykujaca;

public class WloskaPizzaStore extends PizzaStore {
     protected Pizza createPizza(String item) {
        if(item.equals("wegetarianska")) {
            return new WloskaWegetarianskaPizza();
        }
        else {
            return null;
        }
    }
}
