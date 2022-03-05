class Demo6{
    int i,j;
    String name;
    Demo6(int i,String name){
        this.i=i;
        this.name=name;
        j=3;
    }
    void add(){
        System.out.println(i+" "+name);
        System.out.println(i+j);
    }
}
public class TestDemo6 {
    public static void main(String[] args) {
        Demo6 d1=new Demo6(4,"Abc");
        d1.add();
    }
}
