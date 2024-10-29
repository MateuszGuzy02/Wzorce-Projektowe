package Dekorator.kawiarnia;

public class BezKofeiny extends Napoj {

    public BezKofeiny() {
        this.opis = "Kawa Bezkofeiny ";
    }

    @Override
    public double koszt() {
        return 5.00;
    }
}
