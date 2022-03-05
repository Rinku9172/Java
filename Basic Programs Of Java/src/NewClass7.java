import java.util.Scanner;
class Customer{
    String FirstName,LastName;
    public void cust(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first and last name:");
        FirstName=sc.nextLine();
        LastName=sc.nextLine();
        System.out.println("FirstName of customer is:"+FirstName);
        System.out.println("LastName of customer is:"+LastName);
    }
}
class MyAccount {
    Customer cust;
    double bal1,bal2;
    void acc(Customer x){
        cust=x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter balance of account 1:");
        bal1= sc.nextDouble();
        System.out.println("Enter balance of account 2:");
        bal2= sc.nextDouble();
        System.out.println("Balance of account 1 is:"+bal1);

        System.out.println("Balance of account 2 is:"+bal2);
    }
}
public class NewClass7 {
    public static void main(String[] args) {
        Customer c=new Customer();
        c.cust();
        MyAccount m=new MyAccount();
        m.acc(c);


    }
}
