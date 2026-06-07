import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

    }

    public static int mostrarMenu() {

        int opcion;

        System.out.println("=========================");
        System.out.println("REGISTRO DE USUARIOS");
        System.out.println("=========================\n");

        System.out.println("1. Registrar usuario ");
        System.out.println("Salir \n");

        System.out.print("Opcion: ");

        opcion = scanner.nextInt();

        return opcion;
    }

    public static void registrarUsuario() {

        ArrayList<Usuario> usuarios = new ArrayList<>();

        int edad;
        double salarioMensual;

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        try {

        System.out.print("Edad: ");
        edad = scanner.nextInt();
        scanner.nextLine();
        
        } 

        catch (InputMismatchException e) {

            System.out.println("Error: Debe ingresar un número válido. ");
            return;
        }

        System.out.print("Correo electrónico: ");
        String correoElectronico = scanner.nextLine();

        try {

        System.out.print("Salario mensual: ");
        salarioMensual = scanner.nextDouble();

        }

        catch (InputMismatchException e) {

            System.out.println("Error: Debe ingresar un número válido. ");
            return;

        }

        Usuario usuario = new Usuario(nombre, edad, correoElectronico, salarioMensual);

        usuarios.add(usuario);
    }
}
