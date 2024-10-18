package MetodaSzablonowa.Haczyk;

public class Test {
    public static void main(String[] args) {

        NapojZKofeina herbata = new Herbata();
        NapojZKofeina kawa = new Kawa();

        System.out.println("Robienie herbaty...");
        herbata.recepturaParzenia();

        System.out.println("\nRobienie kawy...");
        kawa.recepturaParzenia();
    }
}
