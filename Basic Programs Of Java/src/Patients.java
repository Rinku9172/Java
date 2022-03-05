class Patient {
    String name;
    double weight, height;
    void newPatient(String n,double w,double h){
        name=n;
        weight=w;
        height=h;
    }
    void BMI() {
        double BMI =  ( weight  / ( height ) )*703 ;
        System.out.println(name);
        System.out.println(BMI);

    }
}
public class Patients {
    public static void main(String[] args) {
        Patient p = new Patient();
        p.newPatient("ABC",60.6,56.2);
        p.BMI();
    }
}