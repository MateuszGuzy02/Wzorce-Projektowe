package MetodaSzablonowa.Haczyk2;

public class Zupa extends ZamowieniePosilku {

    @Override
    public void wybierzDanie() {
        System.out.println("Wybieranie zupy...");
    }

    @Override
    public void gotujDanie() {
        System.out.println("Gotowanie zupy na wolnym ogniu...");
    }

    @Override
    public void podajDanie() {
        System.out.println("Podawanie zupy do stolika.");
    }

    @Override
    public void zapakujNaWynos() {
        System.out.println("Pakowanie zupy na wynos.");
    }
}
