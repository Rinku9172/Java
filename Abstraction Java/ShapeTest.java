abstract class Shape5 {
    int x, y;

    abstract void printArea();
}

class Rectangle8 extends Shape5 {

    @Override
    void printArea() {
        x = 4;
        y = 8;
        System.out.println("Area of Rectangle is:" + x * y);
    }

}

class Triangle8 extends Shape5 {

    @Override
    void printArea() {
        x = 2;
        y = 3;
        System.out.println("Area of Triangle is:" + (1 / 2f) * x * y);
    }
}

class Circle8 extends Shape5{
    @Override
    void printArea() {
        int a = 5;
        System.out.println("Area of Circle is:" + (a * a));
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle8 r1 = new Rectangle8();
        r1.printArea();
        Triangle8 t1 = new Triangle8();
        t1.printArea();
        Circle8 c1 = new Circle8();
        c1.printArea();
    }
}
