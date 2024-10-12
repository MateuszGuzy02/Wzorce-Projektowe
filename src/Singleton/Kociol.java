package Singleton;

public class Kociol {

    private static Kociol uniqueInstance;
    private boolean pusty;
    private boolean ugotowany;

    private Kociol() {
        pusty= true;
        ugotowany= false;
    }

    public static Kociol getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Kociol();
        }
        return uniqueInstance;
    }

    public void wypelnij() {
        if (jestPusty()) {
            pusty= false; ugotowany= false;
            //napełnić kocioł mieszanką mleczno-czekoladową
            System.out.println("wypełniamy kocioł");
        }
    }
    public void wylej() {

        if (!jestPusty() && jestUgotowany()) {
            //wylej ugotowane mleko i czekoladę
            pusty= true;
            System.out.println("opróżniamy kocioł");
        }
    }

    public void ugotuj() {
        if (!jestPusty() && !jestUgotowany()) {
            //doprowadzić zawartość do wrzenia
            ugotowany= true;
            System.out.println("gotujemy zawartość kotła");
        }
    }

    public boolean jestPusty() { return pusty; }
    public boolean jestUgotowany() { return ugotowany; }

}