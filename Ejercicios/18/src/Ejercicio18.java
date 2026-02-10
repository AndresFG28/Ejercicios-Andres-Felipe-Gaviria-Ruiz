import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base = sc.nextDouble();
        int exp = sc.nextInt();
        double res = 1;

        if (exp > 0) {
            for (int i = 0; i < exp; i++) res *= base;
        } else if (exp < 0) {
            for (int i = 0; i < -exp; i++) res *= base;
            res = 1 / res;
        }

        System.out.println(res);
    }
}
