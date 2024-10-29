package Fasada;

public class FasadaKinaDomowego {
    private Wzmacniacz wzmacniacz;
    private OdtwarzaczDVD dvd;
    private OdtwarzaczCD cd;
    private Projektor projektor;

    public FasadaKinaDomowego(Wzmacniacz wzmacniacz, OdtwarzaczDVD dvd, OdtwarzaczCD cd, Projektor projektor) {
        this.wzmacniacz = wzmacniacz;
        this.dvd = dvd;
        this.cd = cd;
        this.projektor = projektor;
    }

    public void odtwarzanieFilmu() {
        System.out.println("Przygotowanie do odtwarzania filmu...");
        projektor.wlacz();
        projektor.trybSzerokookonowy();
        wzmacniacz.wlacz();
        wzmacniacz.ustawOdtwarzaczDVD(dvd);
        wzmacniacz.ustawGlosnosc(5);
        dvd.wlacz();
        dvd.odtwarzaj();
    }

    public void koniecFilmu() {
        System.out.println("Zakończenie filmu...");
        projektor.wylacz();
        wzmacniacz.wylacz();
        dvd.zatrzymaj();
        dvd.wylacz();
    }

    public void odtwarzanieCD() {
        System.out.println("Przygotowanie do odtwarzania muzyki z CD...");
        wzmacniacz.wlacz();
        wzmacniacz.ustawOdtwarzaczCD(cd);
        wzmacniacz.ustawGlosnosc(3);
        cd.wlacz();
        cd.odtworzaj();
    }

    public void koniecOdtwarzaniaCD() {
        System.out.println("Zakończenie odtwarzania CD...");
        cd.zatrzymaj();
        cd.wylacz();
        wzmacniacz.wylacz();
    }

    public void odtwarzanieDVD() {
        System.out.println("Przygotowanie do odtwarzania muzyki z DVD...");
        wzmacniacz.wlacz();
        wzmacniacz.ustawOdtwarzaczDVD(dvd);
        wzmacniacz.ustawGlosnosc(3);
        dvd.wlacz();
        dvd.odtwarzaj();
    }

    public void koniecOdtwarzaniaDVD() {
        System.out.println("Zakończenie odtwarzania DVD...");
        dvd.zatrzymaj();
        dvd.wylacz();
        wzmacniacz.wylacz();
    }
}
