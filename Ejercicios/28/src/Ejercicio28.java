import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int secreto = (int)(Math.random() * 100) + 1;
        int intentos = 10;

        while (intentos > 0) {
            int n = sc.nextInt();
            intentos--;

            if (n == secreto) {
                System.out.println("Correcto");
                return;
            } else if (n < secreto)
                System.out.println("Mayor");
            else
                System.out.println("Menor");
        }

        System.out.println("Perdiste. Numero era " + secreto);
    }
}
