import java.util.Scanner;
class Demo5{
    int i;
    String name;
    Demo5(){
        i=0;
        name=null;
    }
    void display(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        i=sc.nextInt();
        System.out.println("Enter a name");
        name=sc.next();
        System.out.println(i+"\n"+name);
    }
}
public class TestDemo5 {
    public static void main(String[] args) {
        Demo5 d1=new Demo5();
        d1.display();
    }
}
