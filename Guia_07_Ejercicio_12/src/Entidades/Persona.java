/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vac�o, constructor parametrizado, get y set. Y los siguientes
m�todos:
    - Agregar un m�todo de creaci�n del objeto que respete la siguiente firma:
      crearPersona(). Este m�todo rellena el objeto mediante un Scanner y le pregunta al
      usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
      fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
    - Escribir un m�todo calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
      en cuenta que para conocer la edad de la persona tambi�n se debe conocer la fecha
      actual.
    - Agregar a la clase el m�todo menorQue(int edad) que recibe como par�metro otra
      edad y retorna true en caso de que el receptor tenga menor edad que la persona que
      se recibe como par�metro, o false en caso contrario.
    - Metodo mostrarPersona(): este m�todo muestra la persona creada en el m�todo
      anterior.
 */
package Entidades;

import java.time.LocalDate;

// Implemente la clase Persona
public class Persona {
    
    // Una persona tiene un nombre y una fecha de nacimiento (Tipo Date).
    private String nombre;
    private LocalDate fechaNacimiento;

    // Constructor vac�o
    public Persona() {
    }
    
    // Constructor parametrizado
    public Persona(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    // Get y Set.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
