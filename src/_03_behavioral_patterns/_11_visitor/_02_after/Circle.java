package _03_behavioral_patterns._11_visitor._02_after;

public class Circle implements Shape {

    @Override
    public void printTo(Phone device) {
        System.out.println("print Circle to phone");
    }

    @Override
    public void printTo(Watch device) {
        System.out.println("print Circle to watch");
    }
}
