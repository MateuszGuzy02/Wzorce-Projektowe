package Adapter.Adapter1;

public class ZwyklyZajac implements Zajac {
    @Override
    public void biegnij() {
        System.out.println("Zając biegnie szybko!");
    }

    @Override
    public void jedzTrawe() {
        System.out.println("Zając je trawkę!");
    }

}
