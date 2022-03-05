class Rectangle5 {
    int length;
    int width;

    void set(int l, int w) {
        length = l;
        width = w;
    }

    public void calculateArea() {
        System.out.println(length * width);
    }
}
    public class TestRectangle {
        public static void main(String[] args) {
            Rectangle5 r1 = new Rectangle5();
            Rectangle5 r2 = new Rectangle5();
            r1.set(5, 10);
            r2.set(2, 3);
            r1.calculateArea();
            r2.calculateArea();
        }
    }
