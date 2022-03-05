import java.util.Scanner;

public class Excep6 {
    public static void main(String[] args) {
        int a, b, c;
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        try {
            if(b<4){
                ArithmeticException ob = new ArithmeticException();
                throw ob;
            }
            arr[b]=100;
            c = a / b;
            System.out.println("Division is " + c);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is not valid");
            System.out.println(e);
        }

        System.out.println("End");
    }
}
