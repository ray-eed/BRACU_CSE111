package Task3;

public class Connect {
    public int totalAdvisee=0;
    public Student[] arr = new Student[5];
    public Connect() {
        System.out.println("Connect is ready to use!");
    }
    public void login(Student student) {
        if(!student.email.equals("null") || !student.password.equals("null")) {
            student.login = true;
        }
        if(!student.login) {
            System.out.println("Email and Password need to be set.");
        } else {
            System.out.println("Login successful");
        }
    }
    public void advising(Student student) {
        if(!student.login) {
            System.out.println("Please login to advise courses!");
        } else {
            System.out.println("You haven't selected any courses.");
        }
    }
    public void advising(Student student, String c1, String c2, String c3) {
        if(!student.login) {
            System.out.println("You haven't selected any courses.");
        } else {
            student.courses = new String[3];
            student.courses[0] = c1;
            student.courses[1] = c2;
            student.courses[2] = c3;
            arr[totalAdvisee++] = student;
            System.out.println("Advising Successful!");
        }
    }
         public void advising(Student student, String c1, String c2, String c3,String c4) {
            System.out.println("You need special approval to take more than 3 courses.");
    }
    public void allAdviseeInfo() {
        System.out.println("Total Advisee: " + totalAdvisee);
        for(int i=0; i<totalAdvisee; i++) {
            System.out.println("Name: " + arr[i].name+" "+"ID: " + arr[i].id);
            System.out.println("Department: " + arr[i].department);
            System.out.print("Courses: ");
            for(int j=0; j<arr[i].courses.length; j++) {
                System.out.print(arr[i].courses[j] + " ");
            }
            System.out.println();
            System.out.println("==============");
        }
    }
}
