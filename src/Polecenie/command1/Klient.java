package Polecenie.command1;

public class Klient {
    public static void main(String[] args) {

        Swiatlo swiatlo = new Swiatlo();
        Polecenie wlaczSwiatlo = new PolecenieWlaczSwiatlo(swiatlo);

        Pilot pilot = new Pilot();
        pilot.ustawPolecenie(wlaczSwiatlo);
        pilot.wcisnietoPrzycisk();
    }
}
