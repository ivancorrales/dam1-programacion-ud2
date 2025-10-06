package utilidades;

public class Tienda {
    // Atributo de instancia → propio de cada objeto
    private String nombre;

    // Atributo estático → compartido por todas las tiendas
    private static int totalTiendas = 0;

    // Constante → valor fijo que no cambia nunca
    public static final double IVA = 0.21;

    // Constructor (cuando creo una tienda, aumenta el contador)
    public Tienda(String nombre) {
        this.nombre = nombre;
        totalTiendas++;
    }

    // Método de instancia → depende de cada objeto
    public void saludar() {
        System.out.println("Bienvenido a la tienda " + nombre);
    }

    // Método estático → no depende de ningún objeto
    public static double aplicarIVA(double precio) {
        return precio * (1 + IVA);
    }

    // Método estático → muestra cuántas tiendas se han creado
    public static int getTotalTiendas() {
        return totalTiendas;
    }
}
