package Fasada;

public class TestFasada {

    public static void main(String[] args) {

        Wzmacniacz wzmacniacz = new Wzmacniacz();
        Projektor projektor = new Projektor();
        OdtwarzaczDVD odtwarzaczDVD = new OdtwarzaczDVD();
        OdtwarzaczCD odtwarzaczCD = new OdtwarzaczCD();

        FasadaKinaDomowego fasadaKinaDomowego = new FasadaKinaDomowego(wzmacniacz, odtwarzaczDVD, odtwarzaczCD, projektor);

        fasadaKinaDomowego.odtwarzanieFilmu();
        fasadaKinaDomowego.koniecFilmu();

        fasadaKinaDomowego.odtwarzanieCD();
        fasadaKinaDomowego.koniecOdtwarzaniaCD();

        fasadaKinaDomowego.odtwarzanieDVD();
        fasadaKinaDomowego.koniecOdtwarzaniaDVD();
    }
}
