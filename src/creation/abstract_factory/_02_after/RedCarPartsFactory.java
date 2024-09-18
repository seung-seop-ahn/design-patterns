package creation.abstract_factory._02_after;

public class RedCarPartsFactory implements CarPartsFactory {
    @Override
    public Handle createHandle() {
        return new RedCarHandle();
    }

    @Override
    public Wheel createWheel() {
        return new RedCarWheel();
    }
}
