/*
EJERCICIO PERSONA ? GET Y SET
Continuaremos con nuestra clase Persona y vamos a primero crear los getter y setter y después
invocarlos desde el Main con alguno de los objetos que instanciaste.
 */
package Entidades;

public class Persona {
    
    public String nombre;
    public String apellido;
    public int dni;
    public int edad;
    public String direccion;
    public int numeroCelular;    

    public Persona() {
    }

    public Persona(String nombre, String apellido, int dni, int edad, String direccion, int numeroCelular) {
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
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

    public int getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", edad=" + edad + ", direccion=" + direccion + ", numeroCelular=" + numeroCelular + '}';
    }
}
