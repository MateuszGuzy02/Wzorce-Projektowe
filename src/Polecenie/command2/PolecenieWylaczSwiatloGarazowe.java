package Polecenie.command2;

public class PolecenieWylaczSwiatloGarazowe implements Polecenie {
    private DrzwiGarazowe drzwiGarazowe;

    public PolecenieWylaczSwiatloGarazowe(DrzwiGarazowe drzwiGarazowe) {
        this.drzwiGarazowe = drzwiGarazowe;
    }

    @Override
    public void wykonaj() {
        drzwiGarazowe.wylaczSwiatlo();
    }
}
