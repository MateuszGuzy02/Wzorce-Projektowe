package Polecenie.command1;

public class PolecenieWlaczSwiatlo implements Polecenie {
    private Swiatlo swiatlo;

    public PolecenieWlaczSwiatlo(Swiatlo swiatlo) {
        this.swiatlo = swiatlo;
    }

    @Override
    public void wykonaj() {
        swiatlo.wlacz();
    }
}
