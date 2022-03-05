import java.util.Scanner;

public class Excep4 {
    public static void main(String[] args) {
        int a, b, c;
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        try {
            arr[a] = 100;
            c = a / b;
            System.out.println("Division is " + c);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            if (e instanceof ArithmeticException) {
                System.out.println("Cannot divisible by 0");
                System.out.println(e);
            } else if (e instanceof ArrayIndexOutOfBoundsException) {
                System.out.println(e instanceof ArrayIndexOutOfBoundsException);
                System.out.println("Index is not valid");
            }


        }
        System.out.println("End");
    }
}