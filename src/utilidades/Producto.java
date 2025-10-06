package utilidades;

public class Producto {
    private String nombre;
    private double precio;

    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        setPrecio(precio); // usamos el setter para validar
    }

    // Getter para nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para precio
    public double getPrecio() {
        return precio;
    }

    // Setter para precio con validación sencilla
    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio no puede ser negativo. Se mantiene el valor anterior.");
        }
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Producto: " + nombre + " | Precio: " + precio + "€");
    }
}
