package _03_behavioral_patterns._11_visitor._02_after;

public class Triangle implements Shape {

    @Override
    public void printTo(Phone device) {
        System.out.println("print Triangle to Phone");
    }

    @Override
    public void printTo(Watch device) {
        System.out.println("print Triangle to Watch");
    }
}
