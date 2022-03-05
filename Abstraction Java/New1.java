abstract class Shape {
    int length, breadth,radius;
    abstract void printArea();
}

class Rectangle7 extends Shape {

    Rectangle7(int l, int b) {
       length=l;
       breadth=b;
    }


    @Override
    void printArea() {
        System.out.println("Area of Rectangle is:"+length*breadth);
    }
}

class Triangle7 extends Shape{
    Triangle7(int base, int height) {
        length=base;
        breadth=height;
    }

    @Override
    void printArea() {
        System.out.println("Area of Triangle is:" + ( length * breadth)/2);
    }
}

class Circle7 extends Shape {

    Circle7(int r) {
       radius=r;
    }

    @Override
    void printArea() {

        System.out.println("Area of Circle is:" + (radius * radius));
    }
}

public class New1 {
    public static void main(String[] args) {
        Rectangle7 r1 = new Rectangle7(3, 4);
        r1.printArea();
        Triangle7 t1 = new Triangle7(4, 4);
        t1.printArea();
        Circle7 c1 = new Circle7(5);
        c1.printArea();
    }
}
