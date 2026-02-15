import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A: ");
        double a = sc.nextDouble();
        System.out.println("B: ");
        double b = sc.nextDouble();
        System.out.println("C: ");
        double c = sc.nextDouble();

        if (a == b && b == c)
            System.out.println("Equilatero");
        else if (a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a)
            System.out.println("Rectangulo");
        else if (a == b || a == c || b == c)
            System.out.println("Isosceles");
        else
            System.out.println("Escaleno");
    }
}
