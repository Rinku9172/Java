//program for constructor overloading
class TestShape1 {
    int length, breadth, side, area;

    TestShape1(int l, int b) {
        length = l;
        breadth = b;
        area = length * breadth;
        System.out.println("Area of rectangle is:" + area);
    }

    TestShape1(int s) {
        side = s;
        area = side * side;
        System.out.println("Area of square is:" + area);
    }
}
public class Shape1 {
    public static void main(String[] args) {
        TestShape1 t1=new TestShape1(3,7);
        TestShape1 t2=new TestShape1(9);
    }
}

