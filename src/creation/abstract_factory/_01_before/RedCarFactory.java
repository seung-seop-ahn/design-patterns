package creation.abstract_factory._01_before;

public class RedCarFactory implements CarFactory {

    @Override
    public Car createCar() {
        Car car = new RedCar();
        car.setHandle(new RedCarHandle());
        car.setWheel(new RedCarWheel());

        return car;
    }
}
