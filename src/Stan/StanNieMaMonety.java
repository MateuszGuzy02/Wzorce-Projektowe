package Stan;

public class StanNieMaMonety implements Stan{
    AutomatSprzedajacy automatSprzedajacy;

    public StanNieMaMonety(AutomatSprzedajacy automatSprzedajacy) {
        this.automatSprzedajacy = automatSprzedajacy;
    }

    @Override
    public void wlozMonete() {
        System.out.println("Włożyłeś monetę");
    }

    @Override
    public void zwrocMonete() {
        System.out.println("Nie włożyłeś monety");
    }

    @Override
    public void przekrecGalke() {
        System.out.println("Przekręciłęś gałkę do wydania gumy ale nie włożyłęś monety");
    }

    @Override
    public void wydaj() {
        System.out.println("Błąd - Musisz najpierw zapłacić");
    }

}
