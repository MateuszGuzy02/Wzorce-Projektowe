package Polecenie.undo;

public class PolecenieWylaczSwiatloGarazowe implements Polecenie {
    private Swiatlo swiatlo;
    private DrzwiGarazowe drzwiGarazowe;
    private boolean poprzedniStan;

    public PolecenieWylaczSwiatloGarazowe(Swiatlo swiatlo, DrzwiGarazowe drzwiGarazowe) {
        this.swiatlo = swiatlo;
        this.drzwiGarazowe = drzwiGarazowe;
    }

    @Override
    public void wykonaj() {
        poprzedniStan = swiatlo.czyWlaczone();
        drzwiGarazowe.wylaczSwiatlo();
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
