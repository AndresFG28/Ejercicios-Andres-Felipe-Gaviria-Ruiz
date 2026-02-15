import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Minutos: ");
        int minutos = sc.nextInt();
        System.out.println("Dia: ");
        String dia = sc.next();
        System.out.println("Turno (mañana/tarde/noche): ");
        String turno = sc.next();

        double costo = 0;

        if (minutos <= 5) costo = 1;
        else if (minutos <= 8) costo = 1 + (minutos - 5) * 0.80;
        else if (minutos <= 10) costo = 1 + 3 * 0.80 + (minutos - 8) * 0.70;
        else costo = 1 + 3 * 0.80 + 2 * 0.70 + (minutos - 10) * 0.50;

        if (dia.equals("domingo")) costo *= 1.03;
        else if (turno.equals("mañana")) costo *= 1.15;
        else costo *= 1.10;

        System.out.println("Total a pagar: " + costo);
    }
}
