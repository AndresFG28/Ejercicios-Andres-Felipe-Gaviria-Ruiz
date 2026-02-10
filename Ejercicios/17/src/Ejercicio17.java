import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String user = sc.next();
        String pass = sc.next();

        if (user.equals("admin") && pass.equals("1234"))
            System.out.println("Has entrado al sistema");
        else
            System.out.println("Error");
    }
}
