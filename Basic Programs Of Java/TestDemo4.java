import java.util.Scanner;
class Demo4{
    int i,j;
    void set(int i,int j){
        this.i=i;
        this.j=j;
    }
    void display(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        i=sc.nextInt();
       j=sc.nextInt();
        System.out.println(i+j);
    }
}
public class TestDemo4 {
    public static void main(String[] args) {
        Demo4 d1=new Demo4();
        Demo4 d2=new Demo4();
        d1.display();
        d2.display();
    }
}
