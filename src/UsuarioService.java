public class UsuarioService {

    public static void validarUsuario(String nombre, int edad, String correo, double salario) throws Exception {

        validarNombre(nombre);
        validarEdad(edad);
        validarCorreo(correo);
        validarSalario(salario);
    }

    public static void validarNombre(String nombre) throws NombreInvalidoException {

        if (nombre.isBlank()) {
            throw new NombreInvalidoException("No puede estar vacío. ");
        }

        else if (nombre.length() < 3) {
            throw new NombreInvalidoException("Debe tener al menos 3 caracteres. ");
        }
    }

    public static void validarEdad(int edad) throws EdadInvalidaException {

        if (edad < 18) {
            throw new EdadInvalidaException("Debe ser mayor o igual a 18 años.  ");
        }

        else if (edad > 100) {
            throw new EdadInvalidaException("Debe ser menor o igual a 100 años. ");
        }
    }

    public static void validarCorreo(String correo) throws CorreoInvalidoException {

        if (correo.contains("@") == false) {
            throw new CorreoInvalidoException("El correo debe contener: @ ");
        }

        else if (correo.contains(".") == false) {
            throw new CorreoInvalidoException("El correo debe contener: . ");
        }
    }

    public static void validarSalario(double salario) throws SalarioInvalidoException {

        if (salario <= 0) {
            throw new SalarioInvalidoException("El salario debe ser mayor que: 0  ");
        }
    }
}
