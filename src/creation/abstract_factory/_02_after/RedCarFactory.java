package creation.abstract_factory._02_after;

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
