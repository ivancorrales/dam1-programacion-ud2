package utilidades;

public class Videojuego {
    private String titulo;
    private String plataforma;

    public Videojuego(String titulo, String plataforma) {
        this.titulo = titulo;
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "Videojuego: " + titulo + " en " + plataforma;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Videojuego))
            return false;
        Videojuego otro = (Videojuego) obj;
        return this.titulo.equals(otro.titulo) && this.plataforma.equals(otro.plataforma);
    }
}