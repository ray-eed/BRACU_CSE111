public class Toy {
    public String name;
    public int price;

    public Toy(String a, int b) {
        name = a;
        price = b;
        System.out.println("A new toy has been made!");
    }

    public void updatePrice(int a) {
        price = a;
    }

    public void updateName(String a) {
        System.out.println("Changing old name: "+ name);
        name = a;
        System.out.println("new name: "+ name);
    }

    public void showPrice() {
        System.out.println("Price: " + price);
    }
}