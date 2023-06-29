/*
EJERCICIO PERSONA ? CONSTRUCTORES
Volveremos a usar la clase Persona y vamos a crear objetos en tu Main utilizando los
constructores.
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
}
