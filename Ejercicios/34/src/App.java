import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de trabajadores: ");
        int n = sc.nextInt();

        double total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Horas trabajadas: ");
            int horas = sc.nextInt();
            System.out.print("Pago por hora: ");
            double pago = sc.nextDouble();

            double sueldo = horas * pago;
            total += sueldo;
        }

        System.out.println("Total pagado: " + total);
    }
}
