package creation.factory._01_before;

public class Client {

    public static void main(String[] args) {
        Car redCar = CarFactory.orderCar("redCar", "user@example.com");
        System.out.println(redCar);

        Car blueCar = CarFactory.orderCar("blueCar", "user@example.com");
        System.out.println(blueCar);
    }
}
