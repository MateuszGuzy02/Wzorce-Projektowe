package Stan;


public class StanJestMoneta implements Stan{
    AutomatSprzedajacy automatSprzedajacy;

    public StanJestMoneta(AutomatSprzedajacy automatSprzedajacy) {
        this.automatSprzedajacy = automatSprzedajacy;
    }

    @Override
    public void wlozMonete() {
        System.out.println("Nie możesz włożyć kolejnej monety");
    }

    @Override
    public void zwrocMonete() {
        System.out.println("Moneta zwrócona");
    }

    @Override
    public void przekrecGalke() {
        System.out.println("Przekręciłeś gałkę i otrzymujesz gumę");
    }

    @Override
    public void wydaj() {
        System.out.println("Błąd - Nie wydano gumy do żucia");
    }
}
