class Demo1{
    int num1;
    void set(int a){
        num1=a;
    }
    void display(){
        if(num1 % 5==0  && num1 % 11==0){
            System.out.println("Divisible");
        }
        else
            System.out.println("Not divisible");
    }
}
public class TestDemo1 {
    public static void main(String[] args) {
        Demo1 d1=new Demo1();
        d1.set(55);
        d1.display();
    }
}

