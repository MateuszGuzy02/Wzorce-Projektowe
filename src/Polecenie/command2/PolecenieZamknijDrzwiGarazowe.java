package Polecenie.command2;

public class PolecenieZamknijDrzwiGarazowe implements Polecenie {
    private DrzwiGarazowe drzwiGarazowe;

    public PolecenieZamknijDrzwiGarazowe(DrzwiGarazowe drzwiGarazowe) {
        this.drzwiGarazowe = drzwiGarazowe;
    }

    @Override
    public void wykonaj() {
        drzwiGarazowe.zamknij();
    }
}
