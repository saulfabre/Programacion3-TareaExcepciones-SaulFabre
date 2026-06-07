import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

        int opcion;

        do {

            opcion = mostrarMenu();

            switch (opcion) {
                case 1:

                    try {

                        registrarUsuario();
                    }

                    catch (Exception e) {

                        System.out.println(e.getMessage());
                    }

                    finally {

                        System.out.println("Proceso finalizado. ");
                    }

                    break;
            }

    } while (opcion != 2);
}

    public static int mostrarMenu() {

        int opcion;

        System.out.println("=========================");
        System.out.println("REGISTRO DE USUARIOS");
        System.out.println("=========================\n");

        System.out.println("1. Registrar usuario ");
        System.out.println("2. Salir\n");

        System.out.print("Opcion: ");

        opcion = scanner.nextInt();
        scanner.nextLine();

        return opcion;
    }

    public static void registrarUsuario() throws Exception {

        ArrayList<Usuario> usuarios = new ArrayList<>();

        int edad;
        double salarioMensual;

        System.out.print("\nNombre: ");
        String nombre = scanner.nextLine();

        try {

        System.out.print("Edad: ");
        edad = scanner.nextInt();
        scanner.nextLine();

        } 

        catch (InputMismatchException e) {

            System.out.println("\nError: Debe ingresar un número válido. ");
            scanner.nextLine();
            return;
        }

        System.out.print("Correo electrónico: ");
        String correoElectronico = scanner.nextLine();

        try {

        System.out.print("Salario mensual: ");
        salarioMensual = scanner.nextDouble();

        }

        catch (InputMismatchException e) {

            System.out.println("\nError: Debe ingresar un número válido. ");
            scanner.nextLine();
            return;

        }

        UsuarioService.validarUsuario(nombre, edad, correoElectronico, salarioMensual);

        Usuario usuario = new Usuario(nombre, edad, correoElectronico, salarioMensual);

        usuarios.add(usuario);

        System.out.println("\nUsuario registrado correctamente. ");
    }
}
