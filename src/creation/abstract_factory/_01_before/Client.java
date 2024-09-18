package creation.abstract_factory._01_before;

public class Client {

    public static void main(String[] args) {
        Car redCar = new RedCarFactory().orderCar("redCar", "user@example.com");
        System.out.println(redCar);
    }
}
