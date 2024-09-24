package _03_behavioral_patterns._11_visitor._02_after;

public class Watch implements Device {
    @Override
    public void print(Circle circle) {
        System.out.println("print Circle to watch");
    }

    @Override
    public void print(Rectangle rectangle) {
        System.out.println("print Rectangle to watch");
    }

    @Override
    public void print(Triangle triangle) {
        System.out.println("print Triangle to watch");
    }
}
