package Polecenie.undo;

public class PolecenieWlaczSwiatlo  implements Polecenie {
    private Swiatlo swiatlo;
    private boolean poprzedniStan;

    PolecenieWlaczSwiatlo(Swiatlo swiatlo) {
        this.swiatlo = swiatlo;
    }

    @Override
    public void wykonaj() {
        poprzedniStan = swiatlo.czyWlaczone();
        swiatlo.wlacz();
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
