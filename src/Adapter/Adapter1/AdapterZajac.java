package Adapter.Adapter1;

public class AdapterZajac implements Krolik {
    private Zajac zajac;

    public AdapterZajac(Zajac zajac) {
        this.zajac = zajac;
    }

    @Override
    public void skacz() {
        System.out.println("Tak skacze Zajac udajacy Krolika");
        zajac.biegnij();
    }

    @Override
    public void jedzMarchewke() {
        System.out.println("Tak je Zajac udajacy Krolika");
        zajac.jedzTrawe();
    }

}
