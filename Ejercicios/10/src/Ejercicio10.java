import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p1 = sc.nextDouble();
        double p2 = sc.nextDouble();
        double p3 = sc.nextDouble();
        double examen = sc.nextDouble();
        double trabajo = sc.nextDouble();

        double promedio = (p1 + p2 + p3) / 3;
        double nota = promedio * 0.55 + examen * 0.30 + trabajo * 0.15;

        System.out.println("Nota final: " + nota);
    }
}
