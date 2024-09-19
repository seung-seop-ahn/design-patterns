package _02_structural_patterns._03_composite._02_after;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Component {
    private List<Component> components = new ArrayList<>();

    public void add(Component item) {
        components.add(item);
    }

    public List<Component> getItems() {
        return components;
    }

    @Override
    public int getPrice() {
        return components.stream().mapToInt(Component::getPrice).sum();
    }
}
