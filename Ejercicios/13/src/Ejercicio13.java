import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double d = sc.nextDouble();
        double v1 = sc.nextDouble();
        double v2 = sc.nextDouble();

        double tiempo = d / (v2 - v1);
        System.out.println("Tiempo (horas): " + tiempo * 60);
    }
}
