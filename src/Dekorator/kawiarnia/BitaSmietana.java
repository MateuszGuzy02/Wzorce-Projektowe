package Dekorator.kawiarnia;

public class BitaSmietana extends SkladnikDekorator {
    Napoj napoj;

    public BitaSmietana(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis() + "+ Bita śmietana";
    }
    @Override
    public double koszt() {

        return napoj.koszt() + 5.00;
    }
}
