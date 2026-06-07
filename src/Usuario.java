public class Usuario {

    private String nombre;
    private int edad;
    private String correoElectronico;
    private double salarioMensual;

    public Usuario(String nombre, int edad, String correoElectronico, double salarioMensual) {
        
        setNombre(nombre);
        setEdad(edad);
        setCorreoElectronico(correoElectronico);
        setSalarioMensual(salarioMensual);
    }

    public String getNombre() {

        return nombre;
    }

    public int getEdad() {

        return edad;
    }

    public String getCorreoElectronico() {

        return correoElectronico;
    }

    public double getSalarioMensual() {

        return salarioMensual;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public void setEdad(int edad) {

        this.edad = edad;
    }

    public void setCorreoElectronico(String correoElectronico) {

        this.correoElectronico = correoElectronico;
    }

    public void setSalarioMensual(double salarioMensual) {

        this.salarioMensual = salarioMensual;
    }  
}
