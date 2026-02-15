public class Rectangulo {

    double ancho;
    double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double calcularArea() {
        return ancho * alto;
    }

    public double calcularPerimetro() {
        return 2 * (ancho + alto);
    }

    public static void main(String[] args) {

        Rectangulo r1 = new Rectangulo(5, 3);

        System.out.println("Área: " + r1.calcularArea());
        System.out.println("Perímetro: " + r1.calcularPerimetro());
    }
}
