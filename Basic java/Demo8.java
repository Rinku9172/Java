abstract class A {
    //abstract method
    abstract void add(int x, int y);

    void show() {
        System.out.println("In A");
    }
}

    class B extends A{

        @Override
        void add(int x, int y) {
            System.out.println(x+y);
        }
    }
    public class Demo8 {
        public static void main(String[] args){
            B ob=new B();
            ob.show();
            ob.add(3,4);
        }

}
