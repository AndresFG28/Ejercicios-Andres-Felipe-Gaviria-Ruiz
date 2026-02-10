import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double precio = sc.nextDouble();
        String tipo = sc.next();
        int tamaño = sc.nextInt();
        double kilos = sc.nextDouble();

        if (tipo.equals("A")) {
            if (tamaño == 1) precio += 0.20;
            else precio += 0.30;
        } else {
            if (tamaño == 1) precio -= 0.30;
            else precio -= 0.50;
        }

        System.out.println("Ganancia: " + precio * kilos);
    }
}
