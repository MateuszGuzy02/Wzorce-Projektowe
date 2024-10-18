package Polecenie.undo;

public class PolecenieOtworzDrzwiGarazowe implements Polecenie {
    private DrzwiGarazowe drzwiGarazowe;
    private boolean poprzedniStan;

    public PolecenieOtworzDrzwiGarazowe(DrzwiGarazowe drzwiGarazowe) {
        this.drzwiGarazowe = drzwiGarazowe;
    }

    @Override
    public void wykonaj() {
        poprzedniStan = drzwiGarazowe.czyOtwarte();
        drzwiGarazowe.otworz();
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
