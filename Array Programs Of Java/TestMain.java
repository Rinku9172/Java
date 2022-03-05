import java.util.Scanner;
public class TestMain
{
    public static void main(String[] args)
    {
        int countP=0, countN=0, countZ=0, i;
        int[] arr = new int[10];//declaring array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ten Numbers: ");//Taking inputs
        for(i=0; i<10; i++)
            arr[i] = sc.nextInt();
        for(i=0; i<10; i++)
        {
            if(arr[i]<0)
                countN++;
            else if(arr[i]>0)
                countP++;
            else
                countZ++;
        }
        //Printing number of negative,positive and zero statements
        System.out.println("\nTotal Positive Numbers are: " +countP);
        System.out.println("Total Negative Numbers are: " +countN);
        System.out.println("Total Zeros are: " +countZ);
    }
}