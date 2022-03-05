import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr=new int[5];
        int i,sub;
        sub=0;
        System.out.println("Enter Array:");
        for(i=0;i<5;i++) {
            arr[i] = sc.nextInt();
        }
        for(int j: arr) {
                sub=sub-j;
            }
        System.out.println("Substraction is "+sub);

        }
    }

