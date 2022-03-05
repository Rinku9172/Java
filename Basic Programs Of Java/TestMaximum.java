class Maximum{
    int num1,num2,num3;
    void set(int a,int b,int c){
     num1=a;
     num2=b;
     num3=c;
    }
    void display(){
        if(num1>num2 && num1>num3) {
            System.out.println("a is Maximum:" + num1);
        }
        else if(num2>num1 && num2>num3) {
            System.out.println("b is Maximum:" + num2);
        }
        else {
            System.out.println("c is Maximum:" + num3);
        }
    }
}
public class TestMaximum {
    public static void main(String[] args) {
        Maximum m1=new Maximum();
        m1.set(20,25,15);
        m1.display();
    }
}
