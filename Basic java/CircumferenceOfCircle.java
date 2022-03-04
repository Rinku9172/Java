import java.util.Scanner;

public class CircumferenceOfCircle
{
    public static void main(String[] args)
    {
        double r,a,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of Circle:");
        r=sc.nextDouble();
        a=3.14*r*r;
        c = 2 * 3.14 * r;
        System.out.println("Area of Circle is:"+a);
        System.out.println("Circumference is:"+c);
    }
}
