class Employee1{
    int id;
    String name;
   float salary;
   int age;
   void set(int i,String n,float s,int a){
       id=i;
       name=n;
       salary=s;
       age=a;
   }
   void ShowEmployee(){
       System.out.println(id+" "+name+" "+salary+" "+age);
    }
}
public class TestEmployee {
    public static void main(String[] args) {
        Employee1 e1=new Employee1();
        Employee1 e2=new Employee1();
        Employee1 e3=new Employee1();
        e1.set(1,"ABC",45000,19);
        e2.set(2,"PQR",55000,20);
        e3.set(3,"XYZ",60000,21);
        e1.ShowEmployee();
        e2.ShowEmployee();
        e2.ShowEmployee();
    }
}
