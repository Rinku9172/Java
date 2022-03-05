class Employee {
    String name;
    int id;
    float salary;

    Employee() {

    }

    Employee(String n, int i, float s) {
        name = n;
        id = i;
        salary = s;
    }

    void display() {
        System.out.println(name + "\n" + id + "\n" + salary);
    }
}

public class ShowEmployee {
    public static void main(String[] args) {
        Employee e = new Employee("Rinku", 254, 60000);

        e.display();
    }
}

