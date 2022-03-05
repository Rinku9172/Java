import java.util.Scanner;
class Experiment {
    int n1,n2;
    void Arithmetic(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers:");
        n1=sc.nextInt();
        n2=sc.nextInt();
        System.out.println("Arithmetic Operations are:");
        System.out.println("Addition is:"+(n1+n2));
        System.out.println("Subtraction is:"+(n1-n2));
        System.out.println("Multiplication is:"+(n1*n2));
        System.out.println("Division is:"+(n1/n2));
        System.out.println("Modulus is:"+(n1%n2));
    }
    void Relational(){
        System.out.println("Relational operations are:");
        System.out.println("a="+n1+"b="+n2);
        System.out.println("a is greater than b:"+(n1>n2));
        System.out.println("a is less than b:"+(n1<n2));
        System.out.println("a is greater than or equal to b:"+(n1>=n2));
        System.out.println("a is less than or equal to b: "+(n1<=n2));
        System.out.println("a is equal to b:"+(n1==n2));
    }
    void Bitwise(){
        //initial values
       int a=5;//5=0101(in binary)
       int b=7;//7=0111(in binary)
        System.out.println("Bitwise Operations are:");
        //bitwise and
        // 0101 & 0111=0101=5
        System.out.println("a&b="+(a&b));
        //bitwise or
        //0101 | 0111=0111=7
        System.out.println("a|b="+(a|b));
        //bitwise xor
        //0101 ^ 0111=0010=2
        System.out.println("a^b="+(a^b));
        //bitwise not
        //~0101=1010
        System.out.println("~a="+(~a));
    }
    void Logical(){
        System.out.println("Logical Operations are:");
        //&& Operator
        System.out.println((4>2)&&(2<3));
        System.out.println((2>3)&&(5<7));
        //|| Operator
        System.out.println((4>5)||(3<5));
        System.out.println((4>5)||(2<1));
        //! Operator
        System.out.println(!(1==2));
        System.out.println(!(2==2));
    }
}
class Experiment1 {
    public static void main(String[] args){
        Experiment e=new Experiment();
        e.Arithmetic();
        e.Relational();
        e.Bitwise();
        e.Logical();
    }
}

