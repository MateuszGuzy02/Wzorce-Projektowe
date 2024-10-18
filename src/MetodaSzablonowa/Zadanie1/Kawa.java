package MetodaSzablonowa.Zadanie1;

public class Kawa extends NapojZKofeina {

    @Override
    public void zaparzenie() {
        System.out.println("Zaparzenie kawy");
    }

    @Override
    public void domieszanieDodatkow() {
        System.out.println("Dodanie cukru i mleka");
    }

}
