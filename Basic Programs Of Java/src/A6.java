import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class A6 {
    public static void main(String[] args) throws Exception{
        FileInputStream fin;
        FileOutputStream fout;
        fin=new FileInputStream("C:/Users/hp/Documents/Nisarga.txt");
        BufferedInputStream bin;
        bin=new BufferedInputStream(fin);
        fout=new FileOutputStream("C:/Users/hp/Documents/Nisarga1.txt");
        BufferedOutputStream bout;
        bout=new BufferedOutputStream(fout);
        int x;
        do {
            x = bin.read();
            if (x != -1) {
                bout.write(x);
            }
        }while (x!=-1);
            bout.flush();
            bin.close();
            bout.close();
        }

    }

