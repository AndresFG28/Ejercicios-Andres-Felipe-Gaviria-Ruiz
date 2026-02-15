import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Precio: ");   
        double precio = sc.nextDouble();
        System.out.println("Tipo (A/B): ");
        String tipo = sc.next();
        System.out.println("Tamaño (1/2): ");
        int tamaño = sc.nextInt();
        System.out.println("Kilos: ");
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
