import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A ");
        double a = sc.nextDouble();
        System.out.println("B ");
        double b = sc.nextDouble();
        System.out.println("C ");
        double c = sc.nextDouble();

        System.out.println("Media: " + (a + b + c) / 3);
    }
}
