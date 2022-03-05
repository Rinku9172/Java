import java.util.Scanner;
public class Newclass4 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int m, n;
            int mat1[][] = new int[3][3];
            int mat2[][] = new int[3][3];
            int add[][] = new int[3][3];
            int sub[][] = new int[3][3];

            System.out.println("Enter the elements of first matrix : ");
            for (m = 0; m < 3; m++) {
                for (n = 0; n < 3; n++) {
                    mat1[m][n] = in.nextInt();
                }

            }

            System.out.println("Enter the elements of second matrix : ");

            for (m = 0; m < 3; m++) {
                for (n = 0; n < 3; n++) {
                    mat2[m][n] = in.nextInt();
                }

            }

            System.out.println("Addition of Matrix : ");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    add[i][j] = mat1[i][j] + mat2[i][j];

                    System.out.print(add[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Substraction of matrix : ");
            for (int x = 0; x < 3; x++) {
                for (int y = 0; y < 3; y++) {
                    sub[x][y] = mat1[x][y] - mat2[x][y];

                    System.out.print(sub[x][y] + " ");
                }
                System.out.println();
            }
        }

    }

