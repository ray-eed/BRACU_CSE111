public class MoneyTracker {
    public String name;
    public double balance = 0.0;
    public double lastIncome = 0.0;
    public double lastExpense = 0.0;
    public MoneyTracker() {
        System.out.println("A new money tracker has been launched.");
    }
    public void createTracker(String a) {
        name = a;
        balance = 1.0;
    }
    public String info() {
        return "Name: " + name + "\nCurrent Balance: " + balance;
    }
    public void income(double b) {
        balance += b;
        lastIncome = b;
        System.out.println("Balance Updated!");
    }
    public void expense(double c) {
        if (c > balance) {
            System.out.println("Not enough balance.");
        } else {
            balance -= c;
            lastExpense = c;
            if (balance == 0) {
                System.out.println("You're broke!");
            } 
            else {
                System.out.println("Balance Updated.");
            }
        }
    }
    public void showHistory() {
        System.out.println("Last added: " + lastIncome);
        System.out.println("Last spent: " + lastExpense);
    }
}

