class Box1{
    double set(double h,double w,double d){
        double v;
        v=h*w*d;
        return(v);
    }
}
public class TextBox1 {
    public static void main(String[] arr) {
        double x;
        Box1 b=new Box1();
        x=b.set(2,3,4);
        System.out.println(x);
    }
}
