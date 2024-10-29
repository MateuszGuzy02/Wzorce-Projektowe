package Kompozyt.Kompozyt1;

public abstract class Kompozyt {

    public abstract String getNazwa();
    public abstract double getCena();
    public abstract void print();

    public void add(Kompozyt kompozyt) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    public void remove(Kompozyt kompozyt) {
        throw new UnsupportedOperationException("Operation not supported");
    }
}
