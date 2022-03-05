import java.util.InputMismatchException;
import java.util.Scanner;

public class Excep2 {
    public static void main(String[] args) {
        int a,b,c;
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        try{
            arr[a]=100;
            c=a/b;
            System.out.println("Division is "+c);
        }catch(ArithmeticException e){
            System.out.println("Cannot divisible by 0");
            System.out.println(e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index is not valid");
            System.out.println(e);
        }catch(InputMismatchException e){
            System.out.println("Not matching");
            System.out.println(e);
        }

        System.out.println("End");

    }
}
