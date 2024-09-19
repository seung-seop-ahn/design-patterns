package _01_creational_patterns._02_factory_method._02_after;

public class BlueCarFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new BlueCar();
    }
}
