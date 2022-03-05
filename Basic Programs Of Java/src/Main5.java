import java.util.Scanner;

class MyException3 extends Exception {
    @Override
    public String toString() {
        return ("Id is not Valid..");
    }
}

class Student {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        try {
            if (id < 1) {
                MyException ob = new MyException();
                throw ob;
            }
            this.id = id;
        } catch (MyException e) {
            System.out.println(e);
        }
    }
}

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID :");
        int x = sc.nextInt();
        Student s1 = new Student();
        s1.setId(x);
    }
}

