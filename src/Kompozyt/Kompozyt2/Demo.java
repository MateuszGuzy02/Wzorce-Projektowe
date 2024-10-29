package Kompozyt.Kompozyt2;

public class Demo {
    public static void main(String[] args) {

        KursKonkretne kurs1 = new KursKonkretne("Java dla początkujących", 200.0);
        KursKonkretne kurs2 = new KursKonkretne("Python w praktyce", 250.0);
        KursKonkretne kurs3 = new KursKonkretne("Zarządzanie projektami", 300.0);


        KategoriaKursow kategoriaIT = new KategoriaKursow("Technologie informacyjne");
        kategoriaIT.add(kurs1);
        kategoriaIT.add(kurs2);

        KategoriaKursow kategoriaZarzadzanie = new KategoriaKursow("Zarządzanie");
        kategoriaZarzadzanie.add(kurs3);

        KategoriaKursow glownaKategoria = new KategoriaKursow("Kursy edukacyjne");
        glownaKategoria.add(kategoriaIT);
        glownaKategoria.add(kategoriaZarzadzanie);

        System.out.println("Struktura kursów: \n");
        glownaKategoria.print();
    }
}
