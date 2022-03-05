import java.util.Scanner;

public class For4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int i, sum = 0;
        System.out.println("Enter array");
        for (i = 0; i < 5; i++)
            arr[i] = sc.nextInt();
        for (i = 0; i < 5; i++)
            sum = sum + arr[i];
        System.out.println("Addition is:"+sum);
    }
}
