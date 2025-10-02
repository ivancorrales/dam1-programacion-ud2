/*
* Este programa recoge los datos del usuario y si el email es válido los muestra
*
* - Si edad es menor que 0 o mayor que 120 mostrar un mensaje de error.
* - Si el nombre tiene menos de 2 caracteres o mas de 20 mostrar un error
* - Normalizar el nombre: Primera letra mayuscula, resto en minúscula, eliminar espacios en blanco del nombre
 */
import java.util.Scanner;

import utilidades.ProcesadorTexto;
import utilidades.Usuario;

public class DatosUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        nombre = nombre.toUpperCase();
        nombre =(nombre.charAt(0) + nombre.substring(1).toLowerCase()).replace(" ", "");
        System.out.print("Introduce tu email: ");
        String email = sc.nextLine();
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        //Después de pedir los datos comprobamos si los datos son válidos
        boolean edadValida = edad>0 && edad<120;
        boolean nombreValido = nombre.length()>2 && nombre.length()<120;
        boolean emailValido = ProcesadorTexto.esEmailValido(email); //utiliza un metodo estático de la clase ProcesadorTexto
        if(emailValido && edadValida && nombreValido){
            Usuario usuario = new Usuario(nombre, edad, email); //crea un objeto (variable) nuevo de la clase Usuario
            usuario.mostrarInformacion();
        }else{
            if(!edadValida){
                System.out.println("Error: Edad no válida");
            }
            if (!emailValido) {
                System.out.println("El usuario no puede ser creado porque el email introducido no es válido");
            }
            if (!nombreValido) {
                System.out.println("Error: Nombre no válido");
            }
        }
        sc.close();
    }
}
