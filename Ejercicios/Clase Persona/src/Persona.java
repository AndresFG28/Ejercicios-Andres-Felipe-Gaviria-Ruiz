public class Persona {

    String nombre;
    String apellido;
    String documento;
    int anioNacimiento;
    String paisNacimiento;
    char genero; // 'H' o 'M'

    // Constructor
    public Persona(String nombre, String apellido, String documento, 
                   int anioNacimiento, String paisNacimiento, char genero) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.anioNacimiento = anioNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
    }

    // Método para imprimir información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Documento: " + documento);
        System.out.println("Año de nacimiento: " + anioNacimiento);
        System.out.println("País: " + paisNacimiento);
        System.out.println("Género: " + genero);
        System.out.println("-------------------------");
    }

    // Método principal
    public static void main(String[] args) {

        Persona p1 = new Persona("Andres", "Gaviria", "123456", 2007, "Colombia", 'H');
        Persona p2 = new Persona("Laura", "Martinez", "987654", 2005, "Colombia", 'M');

        p1.mostrarInformacion();
        p2.mostrarInformacion();
    }
}
