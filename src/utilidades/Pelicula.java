package utilidades;

public class Pelicula {
    String titulo;
    int anio;

    // Constructor por defecto
    public Pelicula() {
        this.titulo = "Sin título";
        this.anio = 0;
    }

    // Constructor parametrizado
    public Pelicula(String titulo, int anio) {
        this.titulo = titulo;
        this.anio = anio;
    }

    @Override
    public String toString() {
        return titulo + " (" + anio + ")";
    }
}
