public class MobilePhone {
    public int Capacity;
    public int TotalContact;
    public int[] ContactNum;
    public String[] ContactName;
    public void setContactCapacity(int a){
        Capacity = a;
        ContactNum = new int[a];
        ContactName = new String[a];
    }
    public void details(){
        System.out.println("Total Contacts: "+TotalContact);
        System.out.println("Contact List:");        
        if(TotalContact!=0){
            for(int i=0;i<TotalContact;i++){
                System.out.println(ContactName[i]+":"+ContactNum[i]);
            }
        }
    }
    public void addContact(String b,int c){
        if(TotalContact<Capacity){
            ContactName[TotalContact]=b;
            ContactNum[TotalContact]=c;
            TotalContact++;
            System.out.println("The Contact of "+b+" is added.");
        }
        else{
            System.out.println("Storage Full!!");
        }
    }
    public void makeCall(int d) {
        boolean found = false;
        for (int i = 0; i < TotalContact; i++) {
            if (ContactNum[i] == d) {
                System.out.println("Calling " + ContactName[i] + " . . .");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Calling " + d + " . . .");
        }
}
}