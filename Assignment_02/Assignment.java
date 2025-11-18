public class Assignment {
   int tasks;
   String difficulty; 
   boolean submission;
   public void printDetails(){
   System.out.println("Number of Tasks:"+tasks);
   System.out.println("Difficulty Level:"+difficulty);
   System.out.println("Submission Required:"+submission);
   }
   public String makeOptional(){
      if(submission){
         submission = false;
         return "Assignment will not require";
      }
      else{
         return "Submission is already not required";
      }
   }
}