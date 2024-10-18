package Polecenie.command2;

public class PolecenieOtworzDrzwiGarazowe implements Polecenie {
    private DrzwiGarazowe drzwiGarazowe;

    public PolecenieOtworzDrzwiGarazowe(DrzwiGarazowe drzwiGarazowe) {
        this.drzwiGarazowe = drzwiGarazowe;
    }

    @Override
    public void wykonaj() {
        drzwiGarazowe.otworz();
    }
}
