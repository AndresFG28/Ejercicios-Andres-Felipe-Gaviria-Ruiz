import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N: ");
        int n = sc.nextInt();
        int pos = 0, neg = 0, cero = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x > 0) pos++;
            else if (x < 0) neg++;
            else cero++;
        }

        System.out.println("Positivos: " + pos);
        System.out.println("Negativos: " + neg);
        System.out.println("Ceros: " + cero);
    }
}
