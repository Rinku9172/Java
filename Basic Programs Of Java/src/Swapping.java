import java.util.Scanner;
public class Swapping
{
    public static void main(String[] args)
    {
        int a=10,b=20;
        Scanner sc = new Scanner(System.in);
        System.out.println("Before Swapping");
        System.out.println("a="+a);
        System.out.println("b="+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
