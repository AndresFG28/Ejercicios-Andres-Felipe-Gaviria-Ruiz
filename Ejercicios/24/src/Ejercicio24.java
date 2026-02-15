import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número de alumnos: ");
        int alumnos = sc.nextInt();
        double total, porAlumno;

        if (alumnos >= 100) porAlumno = 65;
        else if (alumnos >= 50) porAlumno = 70;
        else if (alumnos >= 30) porAlumno = 95;
        else {
            total = 4000;
            System.out.println("Total: " + total);
            System.out.println("Por alumno: " + total / alumnos);
            return;
        }

        total = alumnos * porAlumno;
        System.out.println("Total: " + total);
        System.out.println("Por alumno: " + porAlumno);
    }
}
