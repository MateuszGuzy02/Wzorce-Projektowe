package Polecenie.command2;

public class PolecenieWylaczSwiatlo implements Polecenie {
    private Swiatlo swiatlo;

    PolecenieWylaczSwiatlo(Swiatlo swiatlo) {
        this.swiatlo = swiatlo;
    }

    @Override
    public void wykonaj() {
        swiatlo.wylacz();
    }
}
