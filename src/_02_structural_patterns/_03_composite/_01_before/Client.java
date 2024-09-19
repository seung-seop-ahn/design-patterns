package _02_structural_patterns._03_composite._01_before;

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

    private void printPrice(Item item) {
        System.out.println(item.getPrice());
    }

    private void printPrice(Bag bag) {
        int sum = bag.getItems().stream().mapToInt(Item::getPrice).sum();
        System.out.println(sum);
    }
}
