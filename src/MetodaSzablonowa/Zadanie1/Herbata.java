package MetodaSzablonowa.Zadanie1;

public class Herbata extends NapojZKofeina {

    @Override
    public void zaparzenie() {
        System.out.println("Wkładanie torebki herbaty do wrzątku");
    }

    @Override
    public void domieszanieDodatkow() {
        System.out.println("Dodanie cytryny");
    }

}
