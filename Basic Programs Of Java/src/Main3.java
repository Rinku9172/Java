import java.util.Scanner;
    class main2{
        public static void main(String[] args) {
            class Shape
            {
                int dim1,dim2;
                void area()
                {
                    System.out.println("Area of the shape");
                }
            }
            class Circle extends Shape
            {
                void area1()
                {
                    dim1=6;
                    System.out.println("area of the Circle");
                    double a;
                    a=3.14*dim1*dim1;
                    System.out.println(a);
                }
            }
            class Rectangle extends Shape
            {
                void area2()
                {
                    dim1=6;
                    dim2=5;
                    System.out.println("area of the rectangle");
                    double a;
                    a=dim1*dim2;
                    System.out.println(a);
                }

            }
            class TestShape
            {
                public static void main(String[] args) {
                    Shape s1=new Shape();
                    s1.area();
                    Circle c1=new Circle();
                    c1.area();
                    Rectangle r1=new Rectangle();
                    r1.area();
                }
            }

        }
    }






