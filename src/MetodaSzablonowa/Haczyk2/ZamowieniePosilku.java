package MetodaSzablonowa.Haczyk2;

import java.util.Scanner;

public abstract class ZamowieniePosilku {

    public final void przygotujZamowienie() {
        wybierzDanie();
        gotujDanie();

        if (czyKlientChceNaWynos()) {
            zapakujNaWynos();
        }
        else {
            podajDanie();
        }
    }

    public abstract void wybierzDanie();
    public abstract void gotujDanie();
    public abstract void podajDanie();

    public boolean czyKlientChceNaWynos() {
        String odpowiedz = pobierzOdpowiedzKlienta();
        return odpowiedz.toLowerCase().startsWith("t");
    }

    private String pobierzOdpowiedzKlienta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Czy chcesz wziąć zamówienie na wynos? (T/N)");
        return scanner.nextLine();
    }

    public void zapakujNaWynos() {
        System.out.println("Pakowanie dania na wynos.");
    }
}
