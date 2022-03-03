import java.io.*;
public class A2 {
    public static void main(String[] args) {
        FileInputStream fin;
        FileOutputStream fout;
        try{
            fin=new FileInputStream("C:\\Users\\hp\\Documents\\Demo.txt");
            fout=new FileOutputStream("C:\\Users\\hp\\Documents\\Demo2.txt");
            System.out.println(fin.available());
            int x;
            do{
                x=fin.read();
                if(x!=-1){
                    fout.write(x);
                }
            }while(x!=-1);
            fout.close();
            fin.close();
            System.out.println("File Copied!!");
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }catch(IOException e){
            System.out.println("Not able to read length");
        }
    }
}