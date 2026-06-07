import java.util.ArrayList;
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

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Edad: ");
        int edad = scanner.nextInt();

        System.out.print("Correo electrónico: ");
        String correoElectronico = scanner.nextLine();

        System.out.print("Salario mensual: ");
        double salarioMensual = scanner.nextDouble();

        Usuario usuario = new Usuario(nombre, edad, correoElectronico, salarioMensual);
        
        usuarios.add(usuario);
    }
}
