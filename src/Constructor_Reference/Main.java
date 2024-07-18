package Constructor_Reference;

public class Main {
    public static void main(String[] args) {
        System.out.println("Constructor Reference");

        /*
        Student_Interface stInter = () ->{
          return new Student();
        };
        */

        // Constructor Referencing
        // ClassName::new;
        Student_Interface stInter = Student::new;

         Student student = stInter.getStudent();
         student.display();
    }
}
