package Polecenie.undo;

public class BrakPolecenia implements Polecenie {

    @Override
    public void wykonaj() {
        System.out.println("Brak polecenia przypisanego do tego przycisku.");
    }

    @Override
    public void wycofaj() { System.out.println("Brak polecenia przypisanego do tego przycisku."); }
}
