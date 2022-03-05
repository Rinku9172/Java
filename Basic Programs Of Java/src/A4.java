import java.io.ByteArrayInputStream;
public class A4 {
    public static void main(String[] args)throws Exception{
        String s1="Hello World";
        // Convert String to byte array
        byte [] arr=s1.getBytes();
        ByteArrayInputStream ob;
        ob=new ByteArrayInputStream(arr);
        int x;
        System.out.println(ob.markSupported());
        x=ob.read();
        System.out.println((char)x);
        ob.mark(5);
        x=ob.read();
        System.out.println((char)x);
        x=ob.read();
        System.out.println((char)x);
        x=ob.read();
        System.out.println((char)x);
        System.out.println("After mark");
        ob.reset();
        x=ob.read();
        System.out.println((char)x);
    }
}
