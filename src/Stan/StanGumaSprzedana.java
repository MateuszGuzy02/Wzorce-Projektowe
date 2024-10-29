package Stan;


public class StanGumaSprzedana implements Stan{
    AutomatSprzedajacy automatSprzedajacy;

    public StanGumaSprzedana(AutomatSprzedajacy automatSprzedajacy) {
        this.automatSprzedajacy = automatSprzedajacy;
    }

    @Override
    public void wlozMonete() {
        System.out.println("Proszę czekać na zakończenie poprzedniej operacji czyli wydania gumy");
    }

    @Override
    public void zwrocMonete() {
        System.out.println();
    }

    @Override
    public void przekrecGalke() { System.out.println("Przekręciłeś gałkę i otrzymujesz gumę"); }

    @Override
    public void wydaj() {
        System.out.println("Wydawanie gumy...");
        automatSprzedajacy.zmniejszLiczbeGum();
        if (automatSprzedajacy.getLiczbaGum() > 0) {
            automatSprzedajacy.zmienStan(automatSprzedajacy.getNieMaMonety());
        } else {
            System.out.println("Ups, brak gum!");
            automatSprzedajacy.zmienStan(automatSprzedajacy.getBrakGumy());
        }
    }
}
