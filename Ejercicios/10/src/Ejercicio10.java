import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("N1: ");
        double p1 = sc.nextDouble();
        System.out.println("N2: ");
        double p2 = sc.nextDouble();
        System.out.println("N3: ");
        double p3 = sc.nextDouble();
        System.out.println("N4: ");
        double examen = sc.nextDouble();
        System.out.println("N5: ");
        double trabajo = sc.nextDouble();

        double promedio = (p1 + p2 + p3) / 3;
        double nota = promedio * 0.55 + examen * 0.30 + trabajo * 0.15;

        System.out.println("Nota final: " + nota);
    }
}
