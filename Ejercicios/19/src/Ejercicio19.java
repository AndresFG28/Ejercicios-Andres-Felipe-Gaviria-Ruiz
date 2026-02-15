import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A: ");
        int a = sc.nextInt();
        System.out.println("B: ");
        int b = sc.nextInt();
        System.out.println("C: ");
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
