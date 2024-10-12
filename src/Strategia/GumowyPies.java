package Strategia;

public class GumowyPies extends Pies {

    public GumowyPies() {
        biegnijInterface = new NieBiegnę();
        szczekanieInterface = new NieSzczekaj();
    }

    @Override
    public void wyswietl() {
        System.out.println("Jestem gumowym psem");
    }


}
