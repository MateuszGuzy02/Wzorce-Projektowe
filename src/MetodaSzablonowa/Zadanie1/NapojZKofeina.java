package MetodaSzablonowa.Zadanie1;

public abstract class NapojZKofeina {

    public final void recepturaParzenia() {
        gotowanieWody();
        zaparzenie();
        nalewanieDoFilizanki();
        domieszanieDodatkow();
    }

    public abstract void zaparzenie();
    public abstract void domieszanieDodatkow();

    public void gotowanieWody() {
        System.out.println("Gotowanie wody");
    }

    public void nalewanieDoFilizanki() {
        System.out.println("Nalewanie do filizanki");
    }
}
