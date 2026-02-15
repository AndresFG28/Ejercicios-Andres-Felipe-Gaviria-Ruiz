import java.util.Scanner;

public class Ejercicio17 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Usuario: ");
        String u = sc.nextLine();
        System.out.print("Contraseña: ");
        String c = sc.nextLine();

        if (u.equals("admin") && c.equals("1234"))
            System.out.println("Has entrado al sistema");
        else
            System.out.println("Error");
    }
}
