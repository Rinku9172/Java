import java.util.Scanner;
public class classExceptionTest {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("Enter num 1:");
            num1=sc.nextInt();
            System.out.println("Enter num 2:");
            num2=sc.nextInt();
            float div;
            div=num1/num2;
            System.out.println("Division="+div);
        }
        catch(Exception e)
        {
            System.out.println("Can not divide by zero \n");
            System.out.println(e.toString());
        }
        System.out.println("End of the program");
    }
}