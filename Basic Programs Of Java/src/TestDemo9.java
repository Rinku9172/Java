public class TestDemo9  {
    public static void main(String[] args) {
        int[][] x = {{2, 1, 3}, {5, 4, 6}, {4, 9, 6}};
        int[][] y = {{ 8, 6, 7}, {4, 9,10}, {2,3, 4}};
        int[][] multi = new int[3][3];
        int i, j;
        for(i = 0; i < x.length; i++)
        {
            for(j = 0; j < x[0].length; j++)
            {
                multi[i][j] = x[i][j] * y[i][j];
            }
        }
        System.out.println("The Multiplication of two Matrix:");
        for(i = 0; i < x.length; i++)
        {
            for(j = 0; j < x[0].length; j++)
            {
                System.out.format("%d \t", multi[i][j]);
            }
            System.out.println("");
        }
    }
}
