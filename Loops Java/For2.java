import java.util.Scanner;
public class For2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int i;
        System.out.println("Enter Array:");
        for(i = 0;i < 5;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Your Array");
        for(i = 0;i < 5;i++){
            System.out.println(arr[i]);
        }
        System.out.println("=========");
        for(int x:arr){
            System.out.println(x);
        }
        }

    }
