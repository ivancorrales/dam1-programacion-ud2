package utilidades;

public class Pago {

    // Pagar en efectivo
    public void pagar(double cantidad) {
        System.out.println("Pagaste " + cantidad + "€ en efectivo.");
    }

    // Pagar con tarjeta (necesita pin)
    public void pagar(double cantidad, String pin) {
        System.out.println("Pagaste " + cantidad + "€ con tarjeta usando pin: " + pin);
    }

    // Pagar con Bizum (necesita teléfono)
    public void pagar(double cantidad, int telefono) {
        System.out.println("Pagaste " + cantidad + "€ con Bizum al número: " + telefono);
    }
}