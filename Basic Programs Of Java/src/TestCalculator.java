class Calculator {
    void add(int no1, int no2) {
        System.out.println(no1 + no2);
    }

    void add(float no1, float no2) {
        System.out.println(no1 + no2);
    }

    void sub(int no1, int no2) {
        System.out.println(no1 - no2);
    }

    void sub(float no1, float no2) {
        System.out.println(no1 - no2);
    }

    void mul(int no1, int no2) {
        System.out.println(no1 * no2);
    }

    void mul(float no1, float no2) {
        System.out.println(no1 * no2);
    }

    void div(int no1, int no2) {
        System.out.println(no1 / no2);
    }

    void div(float no1, float no2) {
        System.out.println(no1 / no2);
    }
}

public class TestCalculator {
    public static void main(String[] Strings) {
        Calculator c = new Calculator();
        c.add(4, 2);
        c.add(3.2f, 4.6f);
        c.sub(5, 3);
        c.sub(6.2f, 5.1f);
        c.mul(3, 2);
        c.mul(3.2f, 4.1f);
        c.div(6, 3);
        c.div(6.4f, 5.3f);
    }

}
