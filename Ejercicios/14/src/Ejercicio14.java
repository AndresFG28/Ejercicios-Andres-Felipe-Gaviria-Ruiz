import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A: ");
        int a = sc.nextInt();
        System.out.println("B: ");
        int b = sc.nextInt();

        if (a > b)
            System.out.println("El primero es mayor");
        else
            System.out.println("El segundo es mayor");
    }
}
