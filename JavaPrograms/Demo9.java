import java.util.Scanner;
abstract class Account1 {
    void getCustInfo() {
        int acc_no;
        System.out.println("Enter account number:");
        Scanner sc=new Scanner(System.in);
        acc_no=sc.nextInt();
        System.out.println("account number is "+acc_no);
    }
    abstract void calculateInterest();
}
    class saving extends Account1{
        @Override
        void calculateInterest() {
            System.out.println("Calculate interest of saving");
        }
    }
class Loan extends Account1 {
    @Override
    void calculateInterest() {
        System.out.println("Calculate interest of Loan");
    }
}
public class Demo9 {
    public static void main(String[] args){
        saving s=new saving();
        s.getCustInfo();
        s.calculateInterest();
        Loan l=new Loan();
        l.getCustInfo();
        l.calculateInterest();
    }
}
