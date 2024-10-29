package Dekorator.kawiarnia;

public class Expresso extends Napoj {

    public Expresso() {
        this.opis = "Expresso ";
    }

    @Override
    public double koszt() {
        return 5.00;
    }
}
