package Iterator.iterator3;

public class MenuItem {
    private String nazwa;
    private String opis;
    private double cena;

    public MenuItem(String nazwa, String opis, double cena) {
        this.nazwa = nazwa;
        this.opis = opis;
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getOpis() {
        return opis;
    }

    public double getCena() {
        return cena;
    }
}
