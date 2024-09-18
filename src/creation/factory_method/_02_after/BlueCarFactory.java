package creation.factory_method._02_after;

public class BlueCarFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new BlueCar();
    }
}
