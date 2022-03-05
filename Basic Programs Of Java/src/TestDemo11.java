import java.util.Scanner;
public class TestDemo11 {
    public static void main(String[] args) {
        int num, a, b = 0, sum = 0;//Variable declaration
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:");//Taking input
        num = sc.nextInt();
        do
        {
            a = num % 10;
            b = b * 10 + a;
            sum = sum + a;
            num = num / 10;
        }
        while( num> 0);
        System.out.println("Number in Reverse Order:"+b);
        System.out.println("Sum of digits:"+sum);
        }
    }
