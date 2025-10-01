package utilidades;

public class Usuario {

    // Atributos
    private String nombre;
    private int edad;
    private String correo;

    // Constructor
    public Usuario(String nombre, int edad, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }

    public Usuario() {
    }

    // Métodos no estáticos (necesitan un objeto para ser llamados)

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Correo: " + correo);
    }

    public void actualizarCorreo(String nuevoCorreo) {
        this.correo = nuevoCorreo;
    }

    public void cumplirAnios() {
        this.edad++;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }

}
