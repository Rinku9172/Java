import java.util.Scanner;
class Person1{
    Scanner sc=new Scanner(System.in);
    int age;
    String Name;
    String gender;
    void getDataP(){
        System.out.println("Enter age,name,gender");
        age =sc.nextInt();
        sc.nextLine();
        Name=sc.nextLine();
        gender =sc.nextLine();
    }
}
class Student6 extends Person1{
    int RollNo;
    double marks;
    String div;
    void getDataS(){
        System.out.println("Enter RollNo ,marks,division of student: ");
        RollNo =sc.nextInt();
        marks=sc.nextDouble();
        sc.nextLine();
        div =sc.nextLine();
    }
}
class Teacher extends Person1{
    int Salary;
    String Subject;
    void getDataT(){
        System.out.println("enter salary,subject of teacher");
        Salary =sc.nextInt();
        sc.nextLine();
        Subject=sc.nextLine();
    }
    void displayT(){
        System.out.println("Teacher details: ");
        System.out.println("Age of teacher is "+age);
        System.out.println("Name of teacher is "+Name);
        System.out.println("Gender of teacher is "+gender);
        System.out.println("Salary is"+Salary);
        System.out.println("Subject is "+Subject);
    }
}
class CollegeStudent extends Student6{
    String major;
    int CurrentYear;
    void getDataCS(){
        System.out.println("Enter major subject and Current year of college student: ");
        major=sc.nextLine();
        CurrentYear=sc.nextInt();
    }
    void displayCS(){
        System.out.println("Student details: ");
        System.out.println("Roll number is "+RollNo);
        System.out.println("Marks of student is "+marks);
        System.out.println("Division of student is "+div);
        System.out.println("Major subject is"+major);
        System.out.println("Current year is "+CurrentYear);
    }
}
public class NewClass3 {
    public static void main(String[] args){
        Teacher t=new Teacher();
        t.getDataP();
        t.getDataT();
        CollegeStudent s=new CollegeStudent();
        s.getDataS();
        s.getDataCS();
        t.displayT();
        System.out.println("______________________________");
        s.displayCS();
    }
}




