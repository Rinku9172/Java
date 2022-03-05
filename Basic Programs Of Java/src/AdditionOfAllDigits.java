import java.util.Scanner;

public class AdditionOfAllDigits {
    public static void main(String[] args)
    {
        int a,b,c,add;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        add=a+b+c;
        System.out.println("Addition of all three digits is:"+add);
    }
}