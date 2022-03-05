import java.util.Scanner;

public class AreaOfRectangle
{
    public static void main(String[] args) {
        int l, b, a, p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        l = sc.nextInt();
        System.out.println("Enter breadth");
        b = sc.nextInt();
        a = l * b;
        p = 2 *(l + b);
        System.out.println("Area of Rectangle is:" + a);
        System.out.println("Perimeter of Rectangle is:" + p);
    }
    }
