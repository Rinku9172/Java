class Student5 {
    String FirstName, LastName;
    String ClassYear;

    Student5(String f, String l, String c) {
        FirstName = f;
        LastName = l;
        ClassYear = c;
        System.out.println(FirstName + " " + LastName + " " + ClassYear);
    }
}

public class NewClass1 {
    public static void main(String[] args) {
        Student5 s1 = new Student5("Rinku", "Jat", "2nd year");
        Student5 s2 = new Student5("Rohit", "Jat", "8th");

    }
}
