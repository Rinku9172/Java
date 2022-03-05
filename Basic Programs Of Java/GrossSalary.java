import java.util.Scanner;
public class GrossSalary
{
    public static void main(String[] args)
    {
        double bs, da, hra, GrossSalary;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic Salary:");
        bs = sc.nextDouble();
        da = 0.2 * bs;
        hra = 0.4 * bs;
        GrossSalary = bs + da + hra;
        System.out.println("Gross Salary is:" + GrossSalary);
    }
}

