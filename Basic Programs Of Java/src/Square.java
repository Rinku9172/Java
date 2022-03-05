import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        int a,square;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        a=sc.nextInt();
        square=a*a;
        System.out.println("Square is"+square);
    }
}
