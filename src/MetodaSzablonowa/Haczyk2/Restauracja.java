package MetodaSzablonowa.Haczyk2;

public class Restauracja {
    public static void main(String[] args) {

        ZamowieniePosilku pizza = new Pizza();
        System.out.println("Składanie zamówienia na pizzę...");
        pizza.przygotujZamowienie();

        ZamowieniePosilku zupa = new Zupa();
        System.out.println("\nSkładanie zamówienia na zupę...");
        zupa.przygotujZamowienie();
    }
}
