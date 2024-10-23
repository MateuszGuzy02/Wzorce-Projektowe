package Adapter.Adapter1;

public class ZwyklyKrolik implements  Krolik {

    @Override
    public void skacz() {
        System.out.println("Królik skacze!");
    }

    @Override
    public void jedzMarchewke() {
        System.out.println("Królik je marchewkę!");
    }
}
