package creation.factory_method._02_after;

public class Client {

    public static void main(String[] args) {
        Car redCar = new RedCarFactory().orderCar("redCar", "user@example.com");
        System.out.println(redCar);

        Car blueCar = new BlueCarFactory().orderCar("blueCar", "user@example.com");
        System.out.println(blueCar);
    }
}
