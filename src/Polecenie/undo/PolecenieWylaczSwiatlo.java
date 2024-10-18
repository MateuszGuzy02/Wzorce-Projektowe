package Polecenie.undo;

public class PolecenieWylaczSwiatlo implements Polecenie {
    private Swiatlo swiatlo;
    private boolean poprzedniStan;
    PolecenieWylaczSwiatlo(Swiatlo swiatlo) {
        this.swiatlo = swiatlo;
    }

    @Override
    public void wykonaj() {
        poprzedniStan = swiatlo.czyWlaczone();
        swiatlo.wylacz();
    }

    @Override
    public void wycofaj() {
        if (poprzedniStan) {
            swiatlo.wlacz();
        } else {
            swiatlo.wylacz();
        }
    }
}
