import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N: ");
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            double horas = sc.nextDouble();
            double pago = sc.nextDouble();
            total += horas * pago;
        }

        System.out.println("Total pagado: " + total);
    }
}
