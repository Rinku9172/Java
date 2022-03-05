abstract class ShapeT {

    abstract void calculateArea();
}

class Rectangle extends ShapeT {

    float l, b;

    Rectangle(float l, float b) {
        this.l = l;
        this.b = b;
    }

    @Override
    void calculateArea() {

        System.out.println("Area of Rectangle is : " + (l * b));
    }

}

class Circle extends ShapeT {

    float r;

    Circle(float r) {
        this.r = r;
    }

    @Override
    void calculateArea() {
        System.out.println("Area of Circle is:" + (3.14 * r * r));
    }

}


public class Demo12 {

    public static void main(String[] args) {

        Rectangle R = new Rectangle(5.3f, 4.1f);
        Circle ob1 = new Circle(2.5f);
        ob1.calculateArea();
        R.calculateArea();

    }

}




