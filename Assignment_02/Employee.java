public class Employee {
    public String Name;
    public double Salary = 30000.0;
    public String Designation = "junior";
    public double Tax;
    public void displayInfo(){
       System.out.println("Employee Name: "+Name); 
       System.out.println("Employee Salary: "+Salary+" Tk"); 
       System.out.println("Employee Designation: "+Designation); 
    }
    public void newEmployee(String b){
        Name=b;
    }
    public void calculateTax(){
        if(Salary>50000.0){
            Tax=(Salary*0.3);
            System.out.println(Name+ " Tax Amount: "+Tax+" Tk");
        }
        else if(Salary<=50000.0 && Salary>30000.0){
            Tax=(Salary*0.1);
            System.out.println(Name+ " Tax Amount: "+Tax+" Tk");
        }
        else if(Salary<=30000.0){
            System.out.println("No need to pay tax.");
        }
    }
    public String promoteEmployee(String a){
         if (a.equalsIgnoreCase("senior")) {
            this.Salary += 25000.0;
            this.Designation = "senior";
        } else if (a.equalsIgnoreCase("lead")) {
            this.Salary += 50000.0;
            this.Designation = "lead";
        } else if (a.equalsIgnoreCase("manager")) {
            this.Salary += 75000.0;
            this.Designation = "manager";
        }
        System.out.println(Name+" has been promoted to "+Designation);
        System.out.println("New Salary:"+Salary+" Tk");
        return a;
    }
}
