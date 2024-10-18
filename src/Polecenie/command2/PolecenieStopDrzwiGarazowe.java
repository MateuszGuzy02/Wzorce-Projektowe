package Polecenie.command2;

public class PolecenieStopDrzwiGarazowe implements Polecenie {
    private DrzwiGarazowe drzwiGarazowe;

    public PolecenieStopDrzwiGarazowe(DrzwiGarazowe drzwiGarazowe) {
        this.drzwiGarazowe = drzwiGarazowe;
    }

    @Override
    public void wykonaj() {
        drzwiGarazowe.stop();
    }
}
