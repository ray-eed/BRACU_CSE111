public class Cart {
    int CartNum;
    public String[] item = new String[3];
    public double[] price = new double[3];
    public double[] Dprice = new double[3];
    public int count=0;
    double discount=0.0;
    public void create_cart(int a) {
        CartNum=a;
    }
    public void addItem(String a, double b) {
        if(count<3) {
            item[count]=a;
            price[count]=b;
            count++;
            System.out.println(item[count-1] + " added to cart " + CartNum + ".");
            System.out.println("You have " + count + " item(s) in your cart now.");
        }
        else {
            System.out.println("You already have 3 items on your cart");
        }
    }
    public void addItem(double a, String b) {
        addItem(b, a);
    }
    public void giveDiscount(double p) {
        discount = p;
    }
    public void cartDetails() {
        System.out.println("Your cart(c" + CartNum + ") : ");
        double total = 0.0;
        if(discount > 0) {
            for (int i = 0; i < count; i++) {
                System.out.println(item[i] + " - " + price[i]);
                total+= price[i] - (price[i] * discount / 100);
            }
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println(item[i] + " - " + price[i]);
                total += price[i];
            }
        }
        System.out.println("Discount Applied: " + discount + "%");
        System.out.println("Total price: " + total);
    }
}
