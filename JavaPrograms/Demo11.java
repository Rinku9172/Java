import java.sql.SQLOutput;
import java.util.Scanner;
public class Demo11 {
    public static void main(String[] Strings){
        int a,b,c;
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
        try {
            arr[b] = 100;
            c = a / b;
            System.out.println("Div is" + c);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index is not valid");
            System.out.println(e);
        }catch (ArithmeticException e){
            System.out.println("Can not divide by zero");
            System.out.println(e);
        }
    }
}
