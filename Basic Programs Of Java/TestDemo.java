import java.util.Scanner;
class Demo{
    int number;
    void set(int n){
        number=n;
    }
    void display(){
        if(number>0) {
            System.out.println("Positive");
        }
        else if(number<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Demo d=new Demo();
        System.out.println("Enter any number");
        Scanner ob=new Scanner(System.in);
        int n = ob.nextInt();
        d.set(6);
        d.display();
    }
}
