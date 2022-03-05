import java.util.Scanner;
public class SquareOfNumber
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
        int Square=n*n;
        System.out.println("Square of "+n+ " is:"+Square);
    }
}
