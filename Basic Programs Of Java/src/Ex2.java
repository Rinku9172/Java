import java.util.Scanner;
    public class Ex2
    {
        public static void main(String[] Strings)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value of x: ");
            double x = sc.nextDouble();
            System.out.print("Enter the value of y: ");
            double y = sc.nextDouble();
            System.out.print("Enter the value of z: ");
            double z = sc.nextDouble();
            double d= y * y - 4.0 * x * z;
            if (d> 0.0)
            {
                double a = (-y + Math.pow(d, 0.5)) / (2.0 * x);
                double b = (-y - Math.pow(d, 0.5)) / (2.0 * x);
                System.out.println("The roots are " + a + " and " + b);
            }
            else if (d == 0.0)
            {
                double a = -y / (2.0 * x);
                System.out.println("The root is " + a);
            }
            else
            {
                System.out.println("Roots are not real.");
            }
        }
    }

