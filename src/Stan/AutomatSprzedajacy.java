package Stan;

public class AutomatSprzedajacy {

    Stan brakGumy;
    Stan nieMaMonety;
    Stan gumaSprzedana;
    Stan jestMoneta;
    Stan stan ;
    int liczbaGum = 0;


    public AutomatSprzedajacy(int liczbaGum) {

        this.brakGumy = new StanBrakGumy(this);
        this.nieMaMonety = new StanNieMaMonety(this);
        this.gumaSprzedana = new StanGumaSprzedana(this);
        this.jestMoneta = new StanJestMoneta(this);

        this.liczbaGum = liczbaGum;

        if (liczbaGum > 0) {
            stan = nieMaMonety;
        }
        else {
            stan = jestMoneta;
        }
    }

    public Stan getBrakGumy() {
        return brakGumy;
    }

    public Stan getNieMaMonety() {
        return nieMaMonety;
    }

    public Stan getGumaSprzedana() {
        return gumaSprzedana;
    }

    public Stan getJestMoneta() {
        return jestMoneta;
    }

    public int getLiczbaGum() {
        return liczbaGum;
    }

    public void zmniejszLiczbeGum() {
        if (liczbaGum > 0) {
            liczbaGum--;
        }
    }

    public void zmienStan(Stan stan) {
        this.stan = stan;
    }
    public void wkladanieMonety() { stan.wlozMonete();}
    public void zwrocMonete() {
        stan.zwrocMonete();
    }
    public void przekrecenieGalki() {
        stan.przekrecGalke();
    }
    public void wydanieGumy() {
        stan.wydaj();
    }

    @Override
    public String toString() {
        return "Maszyna{ " +
                "liczba gum: " + liczbaGum +
                ", obecny stan: " + stan.getClass().getSimpleName() +
                " }";
    }

}
