package Kompozyt.Kompozyt1;

public class Demo {

    public static void main(String[] args) {
        Lisc lisc1 = new Lisc("Lisc1", 10.0);
        Lisc lisc2 = new Lisc("Lisc2", 5.0);
        Lisc lisc3 = new Lisc("Lisc3", 7.0);


        Wezel wezel1 = new Wezel("Wezel1");
        wezel1.add(lisc1);
        wezel1.add(lisc2);
        wezel1.print();

        Wezel wezel2 = new Wezel("Wezel2");
        wezel2.add(lisc3);
        wezel2.print();

        Wezel glownyWezel = new Wezel("Glowny Wezel");
        glownyWezel.add(wezel1);
        glownyWezel.add(wezel2);
        glownyWezel.print();
    }
}
