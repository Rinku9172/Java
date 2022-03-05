import java.io.*;
public class A1 {
    public static void main(String[] args) {
        FileInputStream fin;
        try {
            fin = new FileInputStream("\\C:\\Users\\hp\\Documents\\Nisarga.txt\\");
            System.out.println(fin.available());
            int x;
            do {
                x = fin.read();
                if (x != -1) {
                    System.out.println((char)x);
                }
            }
            while (x != -1);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println("Not able to read file");
        }
    }
}
