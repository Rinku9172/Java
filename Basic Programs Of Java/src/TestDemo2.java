import java.sql.SQLOutput;
import java.util.Scanner;
class Demo2{
    int n;
    void set(int n){
        this.n=n;
    }
    void display(){
        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        Demo2 d2=new Demo2();
        d2.set(n);
        d2.display();
    }
}
