package _01_creational_patterns._02_factory_method._01_before;

public class Client {

    public static void main(String[] args) {
        Car redCar = CarFactory.orderCar("redCar", "user@example.com");
        System.out.println(redCar);

        Car blueCar = CarFactory.orderCar("blueCar", "user@example.com");
        System.out.println(blueCar);
    }
}
