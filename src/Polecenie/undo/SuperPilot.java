package Polecenie.undo;

public class SuperPilot {

    private Polecenie[] polecenieWylacz;
    private Polecenie[] polecenieWlacz;
    private Polecenie polecenieWycofaj;

    public SuperPilot() {
        polecenieWlacz = new Polecenie[7];
        polecenieWylacz = new Polecenie[7];

        Polecenie brakPolecenia = new BrakPolecenia();
        for (int i = 0; i < 7; i++) {
            polecenieWlacz[i] = brakPolecenia;
            polecenieWylacz[i] = brakPolecenia;
        }
        polecenieWycofaj = brakPolecenia;
    }
    public void ustawPolecenie(int slot, Polecenie wlacz, Polecenie wylacz) {
        polecenieWlacz[slot] = wlacz;
        polecenieWylacz[slot] = wylacz;
    }

    public void wcisnietoPrzyciskWlacz(int slot) {
        polecenieWlacz[slot].wykonaj();
        polecenieWycofaj = polecenieWlacz[slot];
    }
    public void wcisnietoPrzyciskWylacz(int slot) {
        polecenieWylacz[slot].wykonaj();
        polecenieWycofaj = polecenieWylacz[slot];
    }
    public void wcisnietoPrzyciskWycofaj() {

        if (polecenieWycofaj != null) {
            polecenieWycofaj.wycofaj();
            polecenieWycofaj = null;
        } else {
            System.out.println("Brak polecenia do wycofania.");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n----- Pilot -----\n");
        for (int i = 0; i < polecenieWlacz.length; i++) {
            sb.append("[slot " + i + "] " + polecenieWlacz[i].getClass().getName() + "    " + polecenieWylacz[i].getClass().getName() + "\n");
        }
        return sb.toString();
    }
}
