public class Libro {

    String titulo;
    String autor;
    int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + anioPublicacion);
        System.out.println("----------------------");
    }

    public void modificarAnio(int nuevoAnio) {
        this.anioPublicacion = nuevoAnio;
    }

    public static void main(String[] args) {

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);

        libro1.mostrarInformacion();

        libro1.modificarAnio(1970);

        System.out.println("Después de modificar el año:");
        libro1.mostrarInformacion();
    }
}
