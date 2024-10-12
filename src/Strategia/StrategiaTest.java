package Strategia;

public class StrategiaTest {
    public static void main(String[] args) {

        Pies dzikiPies = new DzikiPies();
        dzikiPies.wyswietl();
        dzikiPies.dajGlos();
        dzikiPies.biegnij();

        System.out.println();

        Pies gumowyPies = new GumowyPies();
        gumowyPies.wyswietl();
        gumowyPies.dajGlos();
        gumowyPies.biegnij();

        System.out.println();

        dzikiPies.ustawBieganieInterface(new NieBiegnę());
        dzikiPies.biegnij();

        gumowyPies.ustawSzczekanieInterface(new Szczekaj());
        gumowyPies.dajGlos();
    }
}