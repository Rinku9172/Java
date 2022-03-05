//Program to check input number is even or odd
import java.util.Scanner;
public class evenodd {
    public static void main(String [] args)
    {
        int a;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    a=sc.nextInt();
    if(a%2==0)
        System.out.println("Even");
    else
        System.out.println("Odd");
    }
}
