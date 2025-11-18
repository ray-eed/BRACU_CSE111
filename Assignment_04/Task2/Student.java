public class Student {
public int id;
public double cgpa;
public String[] courses = new String[4];
public int count=0;
public boolean flag=false;
public Student(int id) {
    this.id = id;
    System.out.println("A student with ID " + id + " has been created.");
}
public Student(int id, double cgpa) {
    this.id = id;
    this.cgpa = cgpa;
    flag=true;
    System.out.println("A student with ID " + id + " and cgpa " + cgpa + " has been created.");
}
public void storeID(int id) {
    this.id = id;
}
public void storeCG(double cgpa) {
    this.cgpa = cgpa;
    flag=true;
}
public void addCourse(String course) {
    if(flag){
    if(cgpa>3.0){
    if (count < courses.length) {
        courses[count] = course;
        count++;
    } 
    else {
        System.out.println("Failed to add " + course + "\nMaximum 4 courses allowed.");
    }
} else{
    if (count < courses.length-1) {
        courses[count] = course;
        count++;
    } 
    else {
        System.out.println("Failed to add " + course);
        System.out.println("CG is low. Can't add more than 3 courses.");
    }
}
}else{
    System.out.println("Failed to add "+course+".\nSet CG first.");
}
}
public void showAdvisee(){
    System.out.println("Student ID:"+id+", CGPA:"+cgpa);
    if(count==0){
        System.out.println("No courses added.");
    } else{
        System.out.println("Added courses are: ");
        for(int i=0;i<count;i++){
            System.out.print(courses[i]+" ");
        }
        System.out.println();
    }
}
public void addCourse(String[] courseList) {
    for(int i = 0; i < courseList.length; i++) {
        addCourse(courseList[i]);
    }
}
public void removeAllCourse() {
    for(int i=0;i<count;i++){
        courses[i]=null;
    }
    count=0;
}
}