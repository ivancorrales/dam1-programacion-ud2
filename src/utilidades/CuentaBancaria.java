package utilidades;

public class CuentaBancaria {
    // Atributo privado → solo accesible dentro de la clase
    private double saldo;

    // Método público → disponible para todos
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            registrarOperacion("Depósito", cantidad);
        }
    }

    // Método público → disponible para todos
    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            registrarOperacion("Retirada", cantidad);
        } else {
            System.out.println("No tienes suficiente saldo.");
        }
    }

    // Método público → consultar saldo
    public double getSaldo() {
        return saldo;
    }

    // Método privado → solo lo usa la propia clase
    private void registrarOperacion(String tipo, double cantidad) {
        System.out.println("Operación interna: " + tipo + " de " + cantidad + "€");
    }
}
