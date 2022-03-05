import java.util.Scanner;

class planets{
    String name;
    double dis,gravity;

    void getData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of the planet,its distance and gravity:");
        name=sc.nextLine();
        dis=sc.nextDouble();
        gravity=sc.nextDouble();
    }
    void display(){
        System.out.println("Name of the planet is:"+name);
        System.out.println("Distance is:"+dis);
        System.out.println("Gravity is:"+gravity);
    }

}
public class NewClass5 {
    public static void main(String[] args) {
        planets p=new planets();
        planets p1=new planets();
        p.getData();
        p.display();
        p1.getData();
        p1.display();

    }
}
