public class Calculator {
    public int resi;
    public String ress="";
    public void add(int a,int b){
        resi=a+b;
        System.out.println(resi);
    }
    public void add(int a,int b,int c){
        resi=a+b+c;
        System.out.println(resi);
    }
    public void multiply(int a,int b){
        resi=a*b;
        System.out.println(resi);
    }
    public void multiply(int a,int b,int c){
        resi=a*b*c;
        System.out.println(resi);
    }
    public void multiply(String a,int b){
        char ch ='-';
        for (int i=0;i<b;i++) {
            if(i<b-1) {
                ress += a + ch;
            }
            else {
                ress += a;
            }
        }
        System.out.println(ress);
        ress="";
    }
}
