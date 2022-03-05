import java.util.Scanner;

public class temperature {
    public static void main(String[] args)
    {
     float Fah,cel;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit");
        Fah=sc.nextFloat();
        cel= (float) ((5.0f/9.0)*(Fah-32));
        System.out.println("Temperature is"+cel);
    }
}
