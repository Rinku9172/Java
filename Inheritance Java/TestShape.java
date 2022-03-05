class Shape4 {
    void draw() {
        System.out.println("This is the base class");
    }
}

class Rectangle3 extends Shape4 {
    void draw(float l, float b) {
        System.out.println("This is Rectangle class");
    }
}

class Circle1 extends Shape4{
    void draw(int r) {
        System.out.println("This is Circle class ");
    }
}

class Triangle extends Shape4 {
    void draw(int b, int h) {

    }
}

public class TestShape {
    public static void main(String[] args) {
        Shape4 s = new Shape4();
        s.draw();
        Rectangle3 r = new Rectangle3();
        r.draw(3.4f, 5.6f);
        Circle1 c = new Circle1();
        c.draw(4);
        Triangle t = new Triangle();
        t.draw(5, 3);
    }
}
