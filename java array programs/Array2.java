import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int[] arr = new int[4];
            int i = 0;
            System.out.println("Enter array:");
            while (i<4){
                arr[i] = sc.nextInt();
                i++;
            }

            i=0;
            while (i<4) {
                System.out.println(arr[i]);
                i++;
            }
        }
    }

