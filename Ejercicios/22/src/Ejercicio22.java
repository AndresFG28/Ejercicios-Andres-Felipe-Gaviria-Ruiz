import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mes: ");
        int mes = sc.nextInt();

        switch (mes) {
            case 1,3,5,7,8,10,12 -> System.out.println("31 dias");
            case 4,6,9,11 -> System.out.println("30 dias");
            case 2 -> System.out.println("28 dias");
            default -> System.out.println("Mes invalido");
        }
    }
}
