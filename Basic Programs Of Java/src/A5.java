import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
public class A5 {
    public static void main(String[] args) throws Exception {
String s1="Hello World";
//Convert string to Byte array
        byte[]arr=s1.getBytes();
        ByteArrayOutputStream bout;
        bout=new ByteArrayOutputStream();
        //Write to byte array
        bout.write(arr);
        FileOutputStream fout;
        fout=new FileOutputStream("C:/Users/hp/Documents/Nisarga.txt");
        bout.writeTo(fout);
        fout.close();

    }
}