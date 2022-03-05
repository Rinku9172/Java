import java.util.Scanner;
class GradeBook1 {
    public void displayMessage(String courseName) {
        System.out.println("Welcome to the GradeBook for " + courseName);
    }
}
    public class GradeBook2 {
        public static void main(String[] args) {;
            Scanner sc=new Scanner(System.in);
            GradeBook1 myGradeBook=new GradeBook1();
            System.out.println("Plz Enter course name:");
            String nameOfCourse=sc.nextLine();
            System.out.println();
            myGradeBook.displayMessage(nameOfCourse);
        }
    }

