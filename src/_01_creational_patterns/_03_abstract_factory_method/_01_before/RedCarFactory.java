package _01_creational_patterns._03_abstract_factory_method._01_before;

public class RedCarFactory implements CarFactory {

    @Override
    public Car createCar() {
        Car car = new RedCar();
        car.setHandle(new RedCarHandle());
        car.setWheel(new RedCarWheel());

        return car;
    }
}
