import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Sueldo base: ");
        double sueldo = sc.nextDouble();

        System.out.print("Venta 1: ");
        double v1 = sc.nextDouble();
        System.out.print("Venta 2: ");
        double v2 = sc.nextDouble();
        System.out.print("Venta 3: ");
        double v3 = sc.nextDouble();

        double comision = (v1 + v2 + v3) * 0.10;
        System.out.println("Comision: " + comision);
        System.out.println("Total: " + (sueldo + comision));
    }
}
