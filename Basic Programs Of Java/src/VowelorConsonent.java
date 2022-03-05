import java.util.Scanner;

//Program to check input alphabet is vowel or Consonent
public class VowelorConsonent {
    public static void main(String [] args)
    {
        String s1;
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter char");
        s1=sc.next();
        ch=s1.charAt(0);
        if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
            System.out.println("Vowel");
        else
            System.out.println("Consonent");
    }
}
