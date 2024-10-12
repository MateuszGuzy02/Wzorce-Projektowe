package Obserwator;

import java.util.ArrayList;
import java.util.List;

public class DanePogodowe implements Podmiot {

    private List<Obserwator> obserwators = new ArrayList<Obserwator>();
    private double temperatura;
    private double wilgotnosc;
    private double cisnienie;

    @Override
    public void zarejestrujObserwatora(Obserwator obserwator) {
        obserwators.add(obserwator);
    }

    @Override
    public void usunObserwatora(Obserwator obserwator) {
        obserwators.remove(obserwator);
    }

    @Override
    public void powiadomObserwatorow() {

        for(Obserwator obs : obserwators) {
            obs.aktualizacja(this.temperatura, this.wilgotnosc, this.cisnienie);
        }
    }
    public void ustawOdczyty(double temperatura, double wilgotnosc, double cisnienie) {
        this.temperatura = temperatura;
        this.wilgotnosc = wilgotnosc;
        this.cisnienie = cisnienie;
        this.powiadomObserwatorow();
    }

}
