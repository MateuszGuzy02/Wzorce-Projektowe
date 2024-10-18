package Polecenie.command2;

public class PolecenieWlaczSwiatlo  implements Polecenie {
    private Swiatlo swiatlo;

    PolecenieWlaczSwiatlo(Swiatlo swiatlo) {
        this.swiatlo = swiatlo;
    }

    @Override
    public void wykonaj() {
        swiatlo.wlacz();
    }
}
