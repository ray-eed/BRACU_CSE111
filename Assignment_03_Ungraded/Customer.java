public class Customer {
    public String name;
    public int[] arri = new int[4];
    public String[] arrs = new String[4];
    public int count=0;
    public int sum;
    public void createCustomer(String a){
        name=a;
    }
    public void addItem(String a,int b){
        if(count<4) {
            arrs[count] = a;
            arri[count] = b;
            sum+=b;
            System.out.println(arrs[count]+" added to the cart");
            count++;
        }
        else {
            System.out.println("Cart is full");
        }
    }
    public void addItem(String a,int b,String c,int d){
        if (count<3){
            arrs[count] = a;
            arri[count] = b;
            sum+=b;
            count++;
            arrs[count] = c;
            arri[count] = d;
            sum+=d;
            count++;
            System.out.println(arrs[count-2]+" and "+arrs[count-1]+" added to the cart");
        } else if (count<4) {
            arrs[count] = a;
            arri[count] = b;
            sum+=b;
            System.out.println(arrs[count]+" added to the cart");
            count++;
            System.out.println("Cart is full");
        }
        else {
            System.out.println("Cart is full");
        }
    }
    public void calculatePrice(){
        System.out.println("Total: "+sum);
    }
    public void showCart(){
        System.out.println("Customer: "+name);
        for(int i=0;i<count;i++){
            System.out.println("Item: "+arrs[i]+" Price: "+arri[i]);
        }
    }
}
