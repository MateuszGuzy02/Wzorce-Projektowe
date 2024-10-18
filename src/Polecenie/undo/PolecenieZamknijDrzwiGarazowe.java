package Polecenie.undo;

public class PolecenieZamknijDrzwiGarazowe implements Polecenie {
    private DrzwiGarazowe drzwiGarazowe;
    private boolean poprzedniStan;
    public PolecenieZamknijDrzwiGarazowe(DrzwiGarazowe drzwiGarazowe) {
        this.drzwiGarazowe = drzwiGarazowe;
    }

    @Override
    public void wykonaj() {
        poprzedniStan = drzwiGarazowe.czyOtwarte();
        drzwiGarazowe.zamknij();
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
