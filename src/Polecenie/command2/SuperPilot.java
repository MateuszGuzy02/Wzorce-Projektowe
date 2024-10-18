package Polecenie.command2;

public class SuperPilot {
    private Polecenie[] polecenieWylacz;
    private Polecenie[] polecenieWlacz;

    public SuperPilot() {
        polecenieWlacz = new Polecenie[7];
        polecenieWylacz = new Polecenie[7];

        Polecenie brakPolecenia = new BrakPolecenia();
        for (int i = 0; i < 7; i++) {
            polecenieWlacz[i] = brakPolecenia;
            polecenieWylacz[i] = brakPolecenia;
        }
    }
    public void ustawPolecenie(int slot, Polecenie wlacz, Polecenie wylacz) {
        polecenieWlacz[slot] = wlacz;
        polecenieWylacz[slot] = wylacz;
    }

    public void wcisnietoPrzyciskWlacz(int slot) { polecenieWlacz[slot].wykonaj(); }
    public void wcisnietoPrzyciskWylacz(int slot) { polecenieWylacz[slot].wykonaj(); }

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
