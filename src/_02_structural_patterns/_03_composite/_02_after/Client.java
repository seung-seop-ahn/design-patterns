package _02_structural_patterns._03_composite._02_after;

public class Client {

    public static void main(String[] args) {
        Item blade = new Item("blade", 450);
        Item potion = new Item("potion", 50);

        Bag bag = new Bag();
        bag.add(blade);
        bag.add(potion);

        Client client = new Client();
        client.printPrice(blade);
        client.printPrice(bag);
    }

    private void printPrice(Component component) {
        System.out.println(component.getPrice());
    }
}
