package Fabryka.FabrykaAbstrakcyjna;

public class WloskaFabrykaSkladnikowPizzy implements FabrykaSkladnikowPizzy {
    public Ciasto utworzCiasto() {
        return new CienkieChrupkieCiasto();
    }

    public Sos utworzSos() {
        return new SosPomidorowy();
    }
}
