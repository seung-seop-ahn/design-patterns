package creation.factory._02_after;

public class RedCarFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new RedCar();
    }
}
