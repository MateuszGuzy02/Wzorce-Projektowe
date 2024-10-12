package Singleton;

public class SingletonTest {
    public static void main(String[] args) {

        Kociol kociol = Kociol.getInstance();
        kociol.wypelnij();
        kociol.ugotuj();

        Kociol kociol2 = Kociol.getInstance();
        kociol.wypelnij();  //tego się nie da zrobić
        kociol2.wypelnij(); //ale to już tak bo mamy drugi punkt dostępu
        kociol.wylej();
    }
}