import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cateto 1: ");
        double a = sc.nextDouble();

        System.out.print("Cateto 2: ");
        double b = sc.nextDouble();

        double h = Math.sqrt(a*a + b*b);
        System.out.println("Hipotenusa: " + h);
    }
}
