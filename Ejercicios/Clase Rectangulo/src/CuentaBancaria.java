public class CuentaBancaria {

    String numeroCuenta;
    String titular;
    double saldo;

    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void consignar(double monto) {
        saldo += monto;
        System.out.println("Consignación exitosa.");
    }

    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro exitoso.");
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }

    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria("001", "Andres Gaviria", 1000);

        cuenta.consultarSaldo();
        cuenta.consignar(500);
        cuenta.consultarSaldo();
        cuenta.retirar(300);
        cuenta.consultarSaldo();
    }
}
