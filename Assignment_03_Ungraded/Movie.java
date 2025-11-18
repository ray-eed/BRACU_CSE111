public class Movie {
   public String title;
   public String director;
   public double rate;
   public String[] arr=new String[3];
   public int count=0;
    public void setMovieDetails(String a,String b,double c){
        title=a;
        director=b;
        rate=c;
    }
    public void setMovieDetails(String a,String b){
        title=a;
        director=b;
    }
    public void updateRating(double a){
        rate=a;
        char ch='"';
        System.out.println("Updated Rating of "+ch+title+ch+" to "+rate);

    }
    public void addActors(String a){
        arr[count]=a;
        char ch='"';
        System.out.println("Added actor "+ch+a+ch+" to "+ch+title+ch+".");
        count++;
    }
    public void addActors(String a,String b){
        addActors(a);
        addActors(b);
    }
    public void addActors(String a, String b,String c){
        addActors(a);
        addActors(b);
        addActors(c);
    }
    public void showInfo(){
        String s= "Title: "+title+"\n"+"Director: "+director+"\n"+"Rating: "+String.valueOf(rate)+"\n"+"Actors: ";
        for(int i=0;i<count;i++){
            if(i!=count-1){
            s+=arr[i]+", ";
            }
            else{
                s+=arr[i];
            }
        }
        System.out.println(s);
    }
}
