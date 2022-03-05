class Student3{
    int RollNo;
    String Name;
    int Class;
    String Division;

    Student3(String N,int C,String D){
        Name=N;
        Class=C;
        Division=D;
        RollNo=1;
    }
  void show(){
      System.out.println(RollNo+"\n"+Name+"\n"+Class+"\n"+Division+"\n");
  }
    void showNextRollNo(){
        RollNo++;
        System.out.println("Next student RollNo is"+RollNo);
    }

}

public class TestStudent {
    public static void main(String[] args){
        Student3 s=new Student3("Rinku",2,"SYB");
        s.show();
        s.showNextRollNo();
    }
}
