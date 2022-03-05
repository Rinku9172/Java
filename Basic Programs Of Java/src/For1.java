import java.util.Scanner;

public class For1 {
    public static void main(String[] args) {
        int i, j;
        for (i = 65; i <= 68; i++) {
            for (j = 65; j <= i; j++) {
                System.out.print((char)j);
            }
            System.out.println(" ");
        }
    }
}
