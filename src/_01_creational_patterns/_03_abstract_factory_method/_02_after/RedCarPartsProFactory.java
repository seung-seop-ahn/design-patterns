package _01_creational_patterns._03_abstract_factory_method._02_after;

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
