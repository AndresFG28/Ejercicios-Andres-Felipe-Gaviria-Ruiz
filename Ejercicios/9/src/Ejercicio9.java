import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Total compra: ");
        double total = sc.nextDouble();

        double pagar = total * 0.85;
        System.out.println("Total a pagar: " + pagar);
    }
}
