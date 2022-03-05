import java.util.Scanner;

public class Excep1 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        try{
            c=a/b;
            System.out.println("Division is "+c);
        }catch(ArithmeticException e){
            System.out.println("Cannot divisible by 0");
            System.out.println(e);
        }
        System.out.println("End");
    }
}



