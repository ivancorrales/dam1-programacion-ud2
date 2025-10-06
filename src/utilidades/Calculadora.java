package utilidades;

public class Calculadora {

    // Método void (no devuelve nada)
    public void saludar() {
        System.out.println("Bienvenido a la calculadora!");
    }

    // Método que devuelve un valor entero
    public int sumar(int a, int b) {
        return a + b;
    }

    // Método que devuelve un texto
    public String presentar(String nombre) {
        return "Hola, " + nombre;
    }

    // Método para probar paso por valor con primitivos
    public void incrementar(int x) {
        x++;
        System.out.println("Dentro del método: " + x);
    }

    // Método para probar paso por referencia con objetos
    public void cambiarTitulo(Cancion c) {
        c.setTitutlo("Canción modificada");
    }
}
