package utilidades;

public class Cancion {
    String titulo;
    String artista;

    // Constructor por defecto
    public Cancion() {
        this.titulo = "Desconocida";
        this.artista = "Desconocido";
    }

    // Constructor parametrizado
    public Cancion(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    @Override
    public String toString() {
        return titulo + " - " + artista;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Cancion other = (Cancion) obj;
        return this.titulo.equals(other.titulo) && this.artista.equals(other.artista);
    }
}