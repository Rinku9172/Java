class Student4 {
    //Attributes
    int id;
    String name;
    float per;
    //Function
    void set(int a, String b, float c) {
        id = a;
        name = b;
        per = c;
    }
    void ShowStudent() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(per);
    }
}
class NewClass {
    public static void main(String[] args) {
        Student4 s1 = new Student4();
        Student4 s2 = new Student4();
        Student4 s3 = new Student4();
        s1.set(100, "ABC", 90);
        s2.set(200, "PQR", 80);
        s3.set(300, "XY", 70);
        s1.ShowStudent();
        s2.ShowStudent();
        s3.ShowStudent();
    }
}