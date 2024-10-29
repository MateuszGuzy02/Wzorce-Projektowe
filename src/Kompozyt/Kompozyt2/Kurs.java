package Kompozyt.Kompozyt2;

public abstract class Kurs {

    public abstract String getNazwa();
    public abstract void print();
    public abstract double getCena();

    public void add(Kurs kurs) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    public void remove(Kurs kurs) {
        throw new UnsupportedOperationException("Operation not supported");
    }
}
