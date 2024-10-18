package MetodaSzablonowa.Haczyk2;

public class Pizza extends ZamowieniePosilku {

    @Override
    public void wybierzDanie() {
        System.out.println("Wybieranie pizzy...");
    }

    @Override
    public void gotujDanie() {
        System.out.println("Pieczenie pizzy w piecu...");
    }

    @Override
    public void podajDanie() {
        System.out.println("Podawanie pizzy do stolika.");
    }

    @Override
    public void zapakujNaWynos() {
        System.out.println("Pakowanie pizzy na wynos.");
    }
}
