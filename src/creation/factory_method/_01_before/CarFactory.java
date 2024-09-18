package creation.factory_method._01_before;

public class CarFactory {

    public static Car orderCar(String name, String email) {
        // validate
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Car name:");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Contact:");
        }

        prepareFor(name);

        Car car = new Car();
        car.setName(name);

        // Customizing for specific name
        if (name.equalsIgnoreCase("redCar")) {
            car.setLogo("red");
        } else if (name.equalsIgnoreCase("blueCar")) {
            car.setLogo("blue");
        }

        // coloring
        if (name.equalsIgnoreCase("redCar")) {
            car.setColor("red");
        } else if (name.equalsIgnoreCase("blueCar")) {
            car.setColor("blue");
        }

        // notify
        sendEmailTo(email, car);

        return car;
    }

    private static void prepareFor(String name) {
        System.out.println(name + " waiting...");
    }

    private static void sendEmailTo(String email, Car car) {
        System.out.println(car.getName() + " completed.");
    }

}
