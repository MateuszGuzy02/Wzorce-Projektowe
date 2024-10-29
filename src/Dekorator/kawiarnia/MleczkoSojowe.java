package Dekorator.kawiarnia;

public class MleczkoSojowe extends SkladnikDekorator {
    Napoj napoj;

    public MleczkoSojowe(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis() + "+ Mleczko Sojowe";
    }

    @Override
    public double koszt() {

        return napoj.koszt() + 5.00;
    }
}
