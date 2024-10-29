package Stan;

public class Demo {
    public static void main(String[] args) {
        AutomatSprzedajacy maszyna = new AutomatSprzedajacy(5);

        // Wyświetlamy stan automatu
        System.out.println(maszyna);

        // Wrzucamy monetę i przekręcamy gałkę
        maszyna.wkladanieMonety();
        maszyna.przekrecenieGalki();

        // Wyświetlamy stan automatu po wydaniu gumy
        System.out.println(maszyna);

        // Wrzucamy monetę, a potem żądamy zwrotu monety
        maszyna.wkladanieMonety();
        maszyna.zwrocMonete();

        // Przekręcamy gałkę bez monety - nie powinniśmy dostać gumy
        maszyna.przekrecenieGalki();

        // Wyświetlamy stan automatu po tej operacji
        System.out.println(maszyna);

        // Wrzucamy monetę i przekręcamy gałkę
        maszyna.wkladanieMonety();
        maszyna.przekrecenieGalki();

        // Powtarzamy proces, wrzucamy monetę i przekręcamy gałkę
        maszyna.wkladanieMonety();
        maszyna.przekrecenieGalki();

        // Żądamy zwrotu monety, której nie włożyliśmy
        maszyna.zwrocMonete();

        // Wyświetlamy stan automatu
        System.out.println(maszyna);

        // Test wytrzymałościowy - wrzucamy 2 monety i przekręcamy gałkę
        maszyna.wkladanieMonety();
        maszyna.wkladanieMonety();
        maszyna.przekrecenieGalki();

        // Wrzucamy monetę, przekręcamy gałkę - wypadnie ostatnia guma
        maszyna.wkladanieMonety();
        maszyna.przekrecenieGalki();

        // Próbujemy wrzucić monetę, gdy automat jest pusty
        maszyna.wkladanieMonety();
        maszyna.przekrecenieGalki();

        // Wyświetlamy stan automatu na końcu
        System.out.println(maszyna);
    }

}
