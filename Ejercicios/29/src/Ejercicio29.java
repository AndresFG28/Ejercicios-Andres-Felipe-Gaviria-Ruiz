import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, suma = 0, cont = 0;

        do {
            n = sc.nextInt();
            if (n != 0) {
                suma += n;
                cont++;
            }
        } while (n != 0);

        System.out.println("Suma: " + suma);
        System.out.println("Media: " + (double)suma / cont);
    }
}
