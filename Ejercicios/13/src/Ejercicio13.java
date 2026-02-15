import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("d ");
        double d = sc.nextDouble();
        System.out.println("v1 ");
        double v1 = sc.nextDouble();
        System.out.println("v2 ");
        double v2 = sc.nextDouble();

        double tiempo = d / (v2 - v1);
        System.out.println("Tiempo (horas): " + tiempo * 60);
    }
}
