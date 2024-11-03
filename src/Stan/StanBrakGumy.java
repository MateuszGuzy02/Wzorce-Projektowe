package Stan;

public class StanBrakGumy implements Stan {
    AutomatSprzedajacy automatSprzedajacy;

    public StanBrakGumy(AutomatSprzedajacy automatSprzedajacy) {
        this.automatSprzedajacy = automatSprzedajacy;
    }

    @Override
    public void wlozMonete() {
        System.out.println("Nie możesz włożyć monety, maszyna jest pusta - brak gum");
    }

    @Override
    public void zwrocMonete() {
        System.out.println("Nie możesz zwrócić monety której nie włożyłeś");
    }

    @Override
    public void przekrecGalke() {
        System.out.println("Przekręciłeś gałkę, ale w automacie brak kulek gumowych");
    }

    @Override
    public void wydaj() {
        System.out.println("Błąd - Nie wydano gumy do żucia");
    }
    
}
