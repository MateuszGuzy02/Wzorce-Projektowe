package Fabryka.FabrykaAbstrakcyjna;

public class VeggiePizza extends Pizza {
    FabrykaSkladnikowPizzy fabryka;

    public VeggiePizza(FabrykaSkladnikowPizzy fabryka) {
        this.fabryka = fabryka;
        name = "Pizza wege";
    }

    public void prepare() {
        System.out.println("Przygotowanie " + name);
        dough = fabryka.utworzCiasto();
        sauce = fabryka.utworzSos();
    }
}
