package Dekorator.kawiarnia;

public abstract class Napoj {

    protected String opis;

    public String pobierzOpis() {
        return opis;
    }
    public abstract double koszt();

}
