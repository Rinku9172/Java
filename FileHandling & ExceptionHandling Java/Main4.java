import java.util.InputMismatchException;
import java.util.Scanner;
class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        int[] arr = new int[5];
        System.out.println("Enter 2 numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        try {
            arr[b] = 100;
            c = a / b;
            System.out.println("Div is " + c);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is not valid");
        }catch(InputMismatchException e){
            System.out.println("Input Mismatch Exception");
        }
        finally{
            System.out.println("End of the program");
        }
    }
}