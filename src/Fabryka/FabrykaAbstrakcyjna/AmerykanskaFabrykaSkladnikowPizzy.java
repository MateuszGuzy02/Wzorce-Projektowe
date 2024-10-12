package Fabryka.FabrykaAbstrakcyjna;

public class AmerykanskaFabrykaSkladnikowPizzy implements FabrykaSkladnikowPizzy {
    public Ciasto utworzCiasto() {
        return new GrubeChrupkieCiasto();
    }

    public Sos utworzSos() {
        return new SosBBQ();
    }
}
