import java.util.Scanner;
class Demo3{
    char ch;
    void set(char c){
        ch=c;
    }
    void display(){
       char ch ='*';
        if((ch>='A' && ch<='Z')|| (ch>='a'&&ch<='z'))
        {
            System.out.println("Alphabet");
        }
        else{
            System.out.println("Not an Alphabet");
        }
    }

}
public class TestDemo3 {
    public static void main(String[] args) {
        Demo3 d3=new Demo3();
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:"); */
        //ch=sc.next().charAt(0);
        d3.set('*');
        d3.display();

    }
}
