package Polecenie.command2;

public class BrakPolecenia implements Polecenie {

    @Override
    public void wykonaj() {
        System.out.println("Brak polecenia przypisanego do tego przycisku.");
    }
}
