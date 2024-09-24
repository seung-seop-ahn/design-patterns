package _03_behavioral_patterns._11_visitor._02_after;

public class Rectangle implements Shape {
    @Override
    public void accept(Device device) {
        device.print(this);
    }
}
