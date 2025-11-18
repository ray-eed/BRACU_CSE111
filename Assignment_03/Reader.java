public class Reader {
    public int capacity=2;
    public String name="New User";
    public String[] books;
    public int count=0;
    
    public Reader(String a) {
        name = a;
        books = new String[capacity];
        System.out.println("A new reader is created!");
    }
    public Reader(String a, int b) {
        name = a;
        books = new String[b];
        capacity = b;
        System.out.println("A new reader is created!");
    }
    public void addBook(String a) {
        if (count < books.length) {
        books[count] = a;
        count++;
        }
        else {
        System.out.println("No more capacity");
        }
    }
    
    public void updateCapacity(int a) {
        if (a > books.length) {
        String[] newBooks = new String[a];
        for (int i = 0; i < count; i++) {
            newBooks[i] = books[i];
        }
        books = newBooks;
        capacity = a;
        System.out.println("Capacity has changed to: " + a);
        }
    }
    public void readerInfo() {
        System.out.println("Name: " + name);
        System.out.println("Capacity: " + capacity);
        System.out.println("Books: ");
        if(count>0){
        for (int i = 0; i < count; i++) {
        System.out.println("Book" + (i+1) + ": " + books[i]);
        }   
        }else{
        System.out.println("No books added yet");
        }
    }
}