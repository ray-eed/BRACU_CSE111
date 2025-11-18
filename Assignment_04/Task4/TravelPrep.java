package Task4;

public class TravelPrep {
    public String t_name;
    public int budget;
    public TravelPrep[] destinations = new TravelPrep[3]; 
    public int destCount = 0; 
    public String type;
    public String name;
    public int cost;
    public TravelPrep() {
        this.t_name = "Unknown package";
        this.budget = 1250;
        System.out.println(this.t_name + " would cost at most " + this.budget + " yen");
    }
    public TravelPrep(String t_name, int budget) {
        this.t_name = t_name;
        this.budget = budget;
        System.out.println(this.t_name + " would cost at most " + this.budget + " yen");
    }
    public TravelPrep(String name, String type) {
        this.type = type;
        this.name = name;
        this.cost = 300;
        System.out.println(this.name + " " + this.type + " costs " + this.cost + " yen");
    }
    public TravelPrep(String type, String name, int cost) {
        this.type = type;
        this.name = name;
        this.cost = cost;
        System.out.println(this.name + " " + this.type + " costs " + this.cost + " yen");
    }
    public void add_to_itinerary(TravelPrep dest1) {
        int totalCost = getCurrentTotalCost();
        boolean overBudget = false;
        if (destCount < destinations.length) {
            if (totalCost + dest1.cost <= budget) {
                destinations[destCount] = dest1;
                destCount++;
            } else {
                overBudget = true;
            }
        }
        if (overBudget) {
            System.out.println("Budget going overboard");
        }
    }
    public void add_to_itinerary(TravelPrep dest1, TravelPrep dest2) {
        if(destCount<destinations.length -1) {
            add_to_itinerary(dest1);
        }
            add_to_itinerary(dest2);
    }
    public void show_itinerary() {
        System.out.println("Itinerary for " + t_name);
        int total = getCurrentTotalCost();
        for (int i = 0; i < destCount; i++) {
            TravelPrep d = destinations[i];
            System.out.println((i + 1) + ". " + d.name + " " + d.type + " - " + d.cost + " yen");
        }
        System.out.println("Total cost of " + destCount + " destinations: " + total + " yen");
    }

    public String updateCost(int newCost) {
        this.cost = cost+newCost;
        return "Cost of " + this.name + " " + this.type + " updated to " + this.cost;
    }

    public int getCurrentTotalCost() {
        int sum = 0;
        for (int i = 0; i < destCount; i++) {
            sum += destinations[i].cost;
        }
        return sum;
    }
}
