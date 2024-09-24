package _03_behavioral_patterns._11_visitor._02_after;

public class Rectangle implements Shape {

    @Override
    public void printTo(Phone device) {
        System.out.println("print Rectangle to phone");
    }

    @Override
    public void printTo(Watch device) {
        System.out.println("print Rectangle to watch");
    }
}
