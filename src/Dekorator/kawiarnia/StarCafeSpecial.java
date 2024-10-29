package Dekorator.kawiarnia;

public class StarCafeSpecial extends Napoj {

    public StarCafeSpecial() {
        this.opis = "StarCafeSpecial ";
        
    }

    @Override
    public double koszt() {
        return 5.00;
    }
}
