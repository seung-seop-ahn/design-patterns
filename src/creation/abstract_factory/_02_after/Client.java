package creation.abstract_factory._02_after;

public class Client {

    public static void main(String[] args) {
        Car redCar = new RedCarFactory(new RedCarPartsFactory()).orderCar("redCar", "user@example.com");
        System.out.println(redCar);

        Car redCarPro = new RedCarFactory(new RedCarPartsProFactory()).orderCar("redCar", "user@example.com");
        System.out.println(redCarPro);
    }
}
