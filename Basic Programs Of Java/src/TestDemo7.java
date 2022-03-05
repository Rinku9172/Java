class Demo7 {
    int i, j;
    String name;
    Demo7(int x, int y) {
        i = x;
        j = y;
    }
    Demo7(int x, String n) {
        i=x;
name=n;
    }
    void display(){
        System.out.println(i+j);
        System.out.println(i+name);
    }
}
public class TestDemo7 {
    public static void main(String[] args) {

    }
}
