package _03_behavioral_patterns._11_visitor._02_after;

public interface Device {
    void print(Circle circle);

    void print(Rectangle rectangle);

    void print(Triangle triangle);
}
