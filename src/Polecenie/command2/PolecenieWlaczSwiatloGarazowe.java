package Polecenie.command2;

public class PolecenieWlaczSwiatloGarazowe implements Polecenie {
    private DrzwiGarazowe drzwiGarazowe;

    public PolecenieWlaczSwiatloGarazowe(DrzwiGarazowe drzwiGarazowe) {
        this.drzwiGarazowe = drzwiGarazowe;
    }

    @Override
    public void wykonaj() {
        drzwiGarazowe.wlaczSwiatlo();
    }
}
