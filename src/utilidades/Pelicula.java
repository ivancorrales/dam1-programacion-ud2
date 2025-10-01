package utilidades;

public class Pelicula {
    private String titulo;
    private int anio;

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

    public String getTitulo() {
        return this.titulo;
    }

    public int getAnio() {
        return this.anio;
    }

    @Override
    public String toString() {
        return titulo + " (" + anio + ")";
    }
}
