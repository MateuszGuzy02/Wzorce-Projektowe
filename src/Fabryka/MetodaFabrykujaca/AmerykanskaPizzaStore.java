package Fabryka.MetodaFabrykujaca;

public class AmerykanskaPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        if (item.equals("wegetarianska")) {
            return new AmerykanskaWegetarianksaPizza();
        }
        else {
            return null;
        }
    }
}
