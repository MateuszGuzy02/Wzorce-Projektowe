package Polecenie.undo;

public class PolecenieStopDrzwiGarazowe implements Polecenie {
    private DrzwiGarazowe drzwiGarazowe;
    private boolean poprzedniStan;
    public PolecenieStopDrzwiGarazowe(DrzwiGarazowe drzwiGarazowe) {
        this.drzwiGarazowe = drzwiGarazowe;
    }

    @Override
    public void wykonaj() {
        poprzedniStan = drzwiGarazowe.czyOtwarte();
        drzwiGarazowe.stop();
    }

    @Override
    public void wycofaj() {
        if (poprzedniStan) {
            drzwiGarazowe.otworz();
        } else {
            drzwiGarazowe.zamknij();
        }
    }
}
