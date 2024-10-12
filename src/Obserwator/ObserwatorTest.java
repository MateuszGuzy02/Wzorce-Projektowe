package Obserwator;

public class ObserwatorTest {
    public static void main(String[] args) {

        DanePogodowe danePogodowe = new DanePogodowe();

        WarunkiBiezaceWyswietl warunkiBiezaceWyswietl = new WarunkiBiezaceWyswietl();
        danePogodowe.zarejestrujObserwatora(warunkiBiezaceWyswietl);

        danePogodowe.ustawOdczyty(26.6, 65, 1100.1);
        danePogodowe.usunObserwatora(warunkiBiezaceWyswietl);
        warunkiBiezaceWyswietl.wyswietl();

    }
}