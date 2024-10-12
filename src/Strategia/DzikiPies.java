package Strategia;

public class DzikiPies extends Pies {

    public DzikiPies() {
        biegnijInterface = new BiegamBoMamNogi();
        szczekanieInterface = new Szczekaj();
    }

    @Override
    public void wyswietl() {
        System.out.println("Jestem dzikim psem");
    }

}
