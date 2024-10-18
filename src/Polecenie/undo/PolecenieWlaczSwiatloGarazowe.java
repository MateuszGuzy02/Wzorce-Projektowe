package Polecenie.undo;

public class PolecenieWlaczSwiatloGarazowe implements Polecenie {
    private Swiatlo swiatlo;
    private DrzwiGarazowe drzwiGarazowe;
    private boolean poprzedniStan;

    public PolecenieWlaczSwiatloGarazowe(Swiatlo swiatlo, DrzwiGarazowe drzwiGarazowe) {
        this.swiatlo = swiatlo;
        this.drzwiGarazowe = drzwiGarazowe;
    }

    @Override
    public void wykonaj() {
        poprzedniStan = swiatlo.czyWlaczone();
        drzwiGarazowe.wlaczSwiatlo();
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
