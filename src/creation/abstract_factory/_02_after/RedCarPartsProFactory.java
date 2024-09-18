package creation.abstract_factory._02_after;

public class RedCarPartsProFactory implements CarPartsFactory{
    @Override
    public Handle createHandle() {
        return new RedCarHandlePro();
    }

    @Override
    public Wheel createWheel() {
        return new RedCarWheelPro();
    }
}
