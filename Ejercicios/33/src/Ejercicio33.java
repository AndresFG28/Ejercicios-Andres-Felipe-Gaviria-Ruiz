import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean primo = true;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                primo = false;

        if (primo && n > 1)
            System.out.println("Es primo");
        else
            System.out.println("No es primo");
    }
}
