import java.util.Scanner;
public class Demo10 {
    public static void main(String[] Strings){
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
        try {
            c=a/b;
            System.out.println("Div is"+c);
        }catch (ArithmeticException e ){
            System.out.println("Can not divide by zero");
            System.out.println(e);
        }
        System.out.println("End!");
    }
}
