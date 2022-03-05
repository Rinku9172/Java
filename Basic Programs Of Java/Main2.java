class Lamp{
    boolean ison;
    void turnOn(){
        ison=true;
        System.out.println("Light on?"+ison);
    }
    void turnOff(){
        ison=false;
        System.out.println("Light on?"+ison);
    }
}
public class Main2 {
    public static void main(String[] args) {
        Lamp l1=new Lamp();
        Lamp l2=new Lamp();
        l1.turnOn();
        l2.turnOff();
    }
}
