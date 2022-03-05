public class Average {
    public static void main(String[] arr) {
        int a, b, c, d, e, f;
        if (arr.length == 2) {
            a = Integer.parseInt(arr[0]);
            b = Integer.parseInt(arr[1]);
            c = a + b;
//            c=Integer.parseInt(arr[2]);
//            d=Integer.parseInt(arr[3]);
//            e=Integer.parseInt(arr[4]);
//            f=a+b+c+d+e;

            System.out.println(c);
        } else {
            System.out.println("Enter 2 numbers:");
        }
    }
}