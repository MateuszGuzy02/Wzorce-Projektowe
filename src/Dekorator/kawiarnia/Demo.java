package Dekorator.kawiarnia;

public class Demo {
    public static void main(String[] args) {

        Napoj napoj = new BezKofeiny();
        System.out.println(napoj.pobierzOpis() + napoj.koszt());

        Napoj napoj2 = new Mleczko(new MocnoPalona());
        System.out.println(napoj2.pobierzOpis() + napoj2.koszt());

    }
}
