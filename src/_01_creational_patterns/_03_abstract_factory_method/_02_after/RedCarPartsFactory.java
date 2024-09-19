package _01_creational_patterns._03_abstract_factory_method._02_after;

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
