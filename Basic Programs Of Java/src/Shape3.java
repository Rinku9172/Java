//program for method overloading

class TestShape2 {
    int length, breadth, side, area;

    void Area(int l, int b) {
        length = l;
        breadth = b;
        area = length * breadth;
        System.out.println("Area of rectangle is:" + area);
    }

    void Area(int s) {
        side = s;
        area = side * side;
        System.out.println("Area of square is:" + area);
    }
}
public class Shape3 {
    public static void main(String[] args) {
        TestShape2 t1=new TestShape2();
        t1.Area(2,5);
        t1.Area(4);
    }
}

