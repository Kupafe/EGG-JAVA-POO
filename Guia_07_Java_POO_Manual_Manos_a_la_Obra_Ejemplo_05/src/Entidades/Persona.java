/*
EJERCICIO VOID
Crea un método void que reciba un objeto tipo persona como parámetro y utilice el get para
mostrar sus atributos. Llama ese método desde el main.
 */
package Entidades;

public class Persona {
    
    public String nombre;
    public String apellido;
    public long dni;
    public int edad;
    public String direccion;
    public long numeroCelular;    

    public Persona() {
    }

    public Persona(String nombre, String apellido, long dni, int edad, String direccion, long numeroCelular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.direccion = direccion;
        this.numeroCelular = numeroCelular;
    }    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(long numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", edad=" + edad + ", direccion=" + direccion + ", numeroCelular=" + numeroCelular + '}';
    }
}
