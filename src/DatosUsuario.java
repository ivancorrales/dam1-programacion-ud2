/*
 * Este programa recoge los datos del usuario y si el email es válido los muestra
 */
import java.util.Scanner;

import utilidades.ProcesadorTexto;
import utilidades.Usuario;

public class DatosUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce tu email: ");
        String email = sc.nextLine();
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        //Después de pedir los datos comprobamos si el email es válido
        boolean emailValido = ProcesadorTexto.esEmailValido(email); //utiliza un metodo estático de la clase ProcesadorTexto
        if(emailValido){
            Usuario usuario = new Usuario(nombre, edad, email); //crea un objeto (variable) nuevo de la clase Usuario
            usuario.mostrarInformacion();
        }else{
            System.out.println("El usuario no puede ser creado porque el email introducido no es válido");
        }
        sc.close();
    }
}
