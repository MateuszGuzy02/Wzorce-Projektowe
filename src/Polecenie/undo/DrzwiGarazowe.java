package Polecenie.undo;

public class DrzwiGarazowe {
    private boolean otwarte;
    public void otworz() {
        otwarte = true;
        System.out.println("Drzwi garażowe zostały otwarte");
    }
    public void zamknij() {
        otwarte = false;
        System.out.println("Drzwi garażowe zostały zamknięte");
    }
    public boolean czyOtwarte() {
        return otwarte;
    }
    public void stop() {
        System.out.println("Brama garazowa została wstrzymana");
    }
    public void wlaczSwiatlo() {
        System.out.println("Świeci się lampka w garażu");
    }
    public void wylaczSwiatlo() {
        System.out.println("Światło w garażu jest wyłączone");
    }
}
