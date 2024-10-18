package MetodaSzablonowa.Haczyk;

import java.util.Scanner;

public abstract class NapojZKofeina {

    public final void recepturaParzenia() {
        gotowanieWody();
        zaparzenie();
        nalewanieDoFilizanki();

        if (czyKlientChceDodatki()) {
            domieszanieDodatkow();
        }
    }

    public abstract void zaparzenie();
    public abstract void domieszanieDodatkow();

    public void gotowanieWody() {
        System.out.println("Gotowanie wody");
    }
    public void nalewanieDoFilizanki() {
        System.out.println("Nalewanie do filizanki");
    }

    public boolean czyKlientChceDodatki() {
        String odpowiedz = pobierzOdpowiedzOdUzytkownika();
        return odpowiedz.toLowerCase().startsWith("t");
    }

    private String pobierzOdpowiedzOdUzytkownika() {
        System.out.println("Czy chcesz dodatki? (T/N): ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
