package Polecenie.undo;

public class ProgramowaniePilota {
    public static void main(String[] args) {

        SuperPilot pilot = new SuperPilot();

        Swiatlo swiatlo = new Swiatlo();
        DrzwiGarazowe drzwiGarazowe = new DrzwiGarazowe();

        Polecenie wlaczSwiatlo = new PolecenieWlaczSwiatlo(swiatlo);
        Polecenie wylaczSwiatlo = new PolecenieWylaczSwiatlo(swiatlo);
        Polecenie otworzDrzwiGarazowe = new PolecenieOtworzDrzwiGarazowe(drzwiGarazowe);
        Polecenie zamknijDrzwiGarazowe = new PolecenieZamknijDrzwiGarazowe(drzwiGarazowe);
        Polecenie wlaczSwiatloGarazowe = new PolecenieWlaczSwiatloGarazowe(swiatlo, drzwiGarazowe);
        Polecenie wylaczSwiatloGarazowe = new PolecenieWylaczSwiatloGarazowe(swiatlo, drzwiGarazowe);

        // Ustawienie slotów
        pilot.ustawPolecenie(0, wlaczSwiatlo, wylaczSwiatlo);
        pilot.ustawPolecenie(1, otworzDrzwiGarazowe, zamknijDrzwiGarazowe);
        pilot.ustawPolecenie(2, wlaczSwiatloGarazowe, wylaczSwiatloGarazowe);

        System.out.println(pilot);

        pilot.wcisnietoPrzyciskWlacz(0);
        pilot.wcisnietoPrzyciskWylacz(0);
        pilot.wcisnietoPrzyciskWlacz(1);
        pilot.wcisnietoPrzyciskWylacz(1);
        pilot.wcisnietoPrzyciskWlacz(2);
        pilot.wcisnietoPrzyciskWylacz(2);

        System.out.println("\nWycofanie polecenia");

        pilot.wcisnietoPrzyciskWycofaj();

        pilot.wcisnietoPrzyciskWlacz(1);
        pilot.wcisnietoPrzyciskWylacz(1);
        pilot.wcisnietoPrzyciskWycofaj();
        pilot.wcisnietoPrzyciskWycofaj();
    }
}
