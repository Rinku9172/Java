//Program of calculating area of circle
import java.sql.SQLOutput;
import java.util.Scanner;
public class AreaOfCircle
{
    public static void main(String [] args)
    {
        double r, a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of Circle:");
        r = sc.nextDouble();
        a = 3.14 * r * r;
        System.out.println("Area of Circle is:"+a);
    }
    }







