import java.util.Scanner;
public class Switch1 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter operator(+,-,*,/):");
            String op = sc.next();
            System.out.println("Enter two numbers:");
            a = sc.nextInt();
            b = sc.nextInt();
        switch(op){
            case"+":
            c=a+b;
            System.out.println("Addition is:"+c);
            break;
            case"-":
            c=a-b;
            System.out.println("Substraction is:"+c);
            break;
            case"*":
            c=a*b;
            System.out.println("Multiplication is:"+c);
            break;
            case"/":
            c=a/b;
            System.out.println("Division is:"+c);
            break;
            default:
                System.out.println("Wrong choice");
    }
}
}
