public class MultiplicationMatrix {
        public static void main(String args[]){
//creating two matrices
            int a[][]={{2,4,1},{5,9,2},{3,1,3}};
            int b[][]={{7,1,3},{5,1,2},{7,3,3}};
            int c[][]=new int[3][3]; //3 rows and 3 columns
//multiplying and printing multiplication
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    c[i][j]=0;
                    for(int k=0;k<3;k++)
                    {
                        c[i][j]+=a[i][k]*b[k][j];
                    }
                    System.out.print(c[i][j]+" "); //printing matrix element
                }
                System.out.println();
            }
        }
}

