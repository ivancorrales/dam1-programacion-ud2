package utilidades;

public class Alumno {
    private String nombre;
    private int edad;

    // Constructor por defecto
    public Alumno() {
        this.nombre = "Desconocido";
        this.edad = 0;
    }

    // Constructor parametrizado
    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Constructor que reutiliza otro con this()
    public Alumno(String nombre) {
        this(nombre, 18); // por defecto si no dan edad → 18
    }

    public void mostrarInfo() {
        System.out.println("Alumno: " + nombre + ", edad: " + edad);
    }
}
