class Employee2 {
    String name;
    int id;
    float salary;

    Employee2() {
        System.out.println();
    }

    Employee2(String n, int i, float s) {
        name = n;
        id = i;
        salary = s;
    }

    void display() {
        System.out.println(name + " " + id + " " + salary);
    }

}

public class ShowThisEmployee {
    public static void main(String[] Strings) {
        Employee2 e = new Employee2("Rinku", 254, 50000);
        e.display();


    }
}
