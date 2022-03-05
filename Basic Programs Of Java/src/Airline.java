import java.util.Scanner;
class AirlineTickets{
    String dep,arr;
    int fNo;
    String seatNo;
    void data(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter departure and arrival cities:");
        dep=sc.nextLine();
        arr=sc.nextLine();
        System.out.println("Enter flight number and seat number:");
        fNo=sc.nextInt();
        System.out.println();
        seatNo=sc.nextLine();
        System.out.println("Cities are:"+dep+" "+arr);
        System.out.println("Seat number and flight number are:"+fNo+" "+seatNo);
    }
}
public class Airline {
    public static void main(String[] args) {
        AirlineTickets a = new AirlineTickets();
        a.data();
    }
}
