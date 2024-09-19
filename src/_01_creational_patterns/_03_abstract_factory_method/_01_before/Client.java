package _01_creational_patterns._03_abstract_factory_method._01_before;

public class Client {

    public static void main(String[] args) {
        Car redCar = new RedCarFactory().orderCar("redCar", "user@example.com");
        System.out.println(redCar);
    }
}
