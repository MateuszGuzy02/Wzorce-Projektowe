package Obserwator;

public class WarunkiBiezaceWyswietl implements Obserwator {
    private double temperatura;
    private double wilgotnosc;
    private double cisnienie;

    @Override
    public void aktualizacja(double temperatura, double wilgotnosc, double cisnienie) {
        this.temperatura = temperatura;
        this.wilgotnosc = wilgotnosc;
        this.cisnienie = cisnienie;
    }

    public void wyswietl() {
        System.out.println("Temperatura: " + temperatura + " Wilgotność: " + wilgotnosc + " Ciśnienie: " + cisnienie);
    }
}
