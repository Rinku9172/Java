import java.util.Scanner;

class MyException extends Exception {
    @Override
    public String toString() {
        return "Number is not divisible by 5:";
    }
}

public class Demo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter number divisible by 5");
            int x = sc.nextInt();
            if (x % 5 != 0) {
                MyException ob = new MyException();
                throw ob;
            }
            System.out.println("Correct number");
        } catch (MyException e) {
            System.out.println(e);

        }
    }
}
