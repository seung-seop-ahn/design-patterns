package _01_creational_patterns._03_abstract_factory_method._02_after;

public class RedCarFactory implements CarFactory {

    private CarPartsFactory carPartsFactory;

    public RedCarFactory(CarPartsFactory carPartsFactory) {
        this.carPartsFactory = carPartsFactory;
    }

    @Override
    public Car createCar() {
        Car car = new RedCar();
        car.setHandle(this.carPartsFactory.createHandle());
        car.setWheel(this.carPartsFactory.createWheel());

        return car;
    }
}
