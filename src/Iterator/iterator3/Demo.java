package Iterator.iterator3;


public class Demo {
    public static void main(String[] args) {

        Sniadania sniadania = new Sniadania();
        Obiady obiady = new Obiady();

        Kelnerka kelnerka = new Kelnerka();
        kelnerka.addMenu(sniadania);
        kelnerka.addMenu(obiady);

        kelnerka.serwujMenu();
    }
}
