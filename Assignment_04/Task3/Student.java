package Task3;

public class Student {
    public String name;
    public int id;  
    public String department;
    public String email="null";
    public String password="null";
    public boolean login = false;
    public String[] courses;
    public Student(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
        System.out.println("Student object is created");
    }
}

