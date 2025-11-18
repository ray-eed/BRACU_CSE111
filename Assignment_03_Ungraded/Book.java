public class Book {
    public String title;
    public String author="unknown";
    public String genre;
    public String pages;
    public void createBook(String a){
        title=a;
        genre=a;
        pages=a;
    }
    public void createBook(String a,String b){
        genre=a;
        pages=a;
        title=a;
        author=b;
    }
    public void createBook(String a,String b,String c){
        title=a;
        author=b;
        pages=a;
        genre=c;
    }
    public void customizeGenre(String a){
        char ch='"';
        System.out.println("Updated genre of "+ch+genre+ch+" to "+a);
        genre=a;
    }
    public void customizePages(int p){
        String temp=String.valueOf(p);
        char ch='"';
        System.out.println("Updated pages of "+ch+pages+ch+" to "+temp+" pages ");
        pages=temp;
    }
    public void displayDetails(){
        String s= "Title: "+title+", Author: "+ author+", Genre: "+genre+", Pages: "+pages;
        System.out.println(s);
    }
}