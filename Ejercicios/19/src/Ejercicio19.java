import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println(a);
            System.out.println(Math.max(b,c));
            System.out.println(Math.min(b,c));
        } else if (b >= a && b >= c) {
            System.out.println(b);
            System.out.println(Math.max(a,c));
            System.out.println(Math.min(a,c));
        } else {
            System.out.println(c);
            System.out.println(Math.max(a,b));
            System.out.println(Math.min(a,b));
        }
    }
}
