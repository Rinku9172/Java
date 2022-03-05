import java.util.Scanner;

public class UniversalCatchBlock {
    public static void main(String[] Strings) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        int[] arr = new int[5];
        System.out.println("Enter two numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        try {
            arr[b] = 100;
            c = a / b;
            System.out.println("Div is" + c);
        } catch (Exception e) {
            if (e instanceof ArithmeticException) {
                System.out.println("Cannot divide by zero");
                System.out.println(e);
            } else if (e instanceof ArrayIndexOutOfBoundsException) {
                System.out.println("Invalid index");
                System.out.println(e);
            }
            System.out.println("End");
        }

    }

}
