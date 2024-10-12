package Fabryka.FabrykaAbstrakcyjna;

public class CheesePizza extends Pizza {
    FabrykaSkladnikowPizzy fabryka;

    public CheesePizza(FabrykaSkladnikowPizzy fabryka) {
        this.fabryka = fabryka;
        name = "Pizza serowa";
    }

    public void prepare() {
        System.out.println("Przygotowanie " + name);
        dough = fabryka.utworzCiasto();
        sauce = fabryka.utworzSos();
    }
}
