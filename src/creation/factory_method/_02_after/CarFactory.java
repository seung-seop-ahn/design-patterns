package creation.factory_method._02_after;

public interface CarFactory {

    default Car orderCar(String name, String email) {
        this.validate(name, email);
        this.prepareFor(name);

        Car car = createCar();
        this.sendEmailTo(email, car);

        return car;
    }

    Car createCar();

    private void validate(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Car name:");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Contact:");
        }
    }

    private void prepareFor(String name) {
        System.out.println(name + " waiting...");
    }

    private void sendEmailTo(String email, Car car) {
        System.out.println(car.getName() + " completed.");
    }
}
