/*
EJERCICIO VOID
Crea un método void que reciba un objeto tipo persona como parámetro y utilice el get para
mostrar sus atributos. Llama ese método desde el main.
 */
package Principal;

import Entidades.Persona;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        // Crear objeto Persona
        
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        
        cargarPersona(persona1);
        cargarPersona(persona2);
        
        mostrarPersona(persona1);
        mostrarPersona(persona2);
    }
    
    public static void cargarPersona(Persona persona){
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
        
        System.out.print("Ingrese el nombre de la persona: ");
        persona.setNombre(leer.next());
        
        System.out.print("Ingrese el apellido de "+ persona.getNombre() +": ");
        persona.setApellido(leer.next());
        
        System.out.print("Ingrese el dni de "+ persona.getNombre() +" "+ persona.getApellido() +": ");
        persona.setDni(leer.nextLong());
        
        System.out.print("Ingrese la edad de "+ persona.getNombre() +" "+ persona.getApellido() +": ");
        persona.setEdad(leer.nextInt());
        
        System.out.print("Ingrese la direccion de "+ persona.getNombre() +" "+ persona.getApellido() +": ");
        persona.setDireccion(leer.next());
        
        System.out.print("Ingrese el numero de celular de "+ persona.getNombre() +" "+ persona.getApellido() +": ");
        persona.setNumeroCelular(leer.nextLong());
    }
    
    public static void mostrarPersona(Persona persona){
        
        System.out.println("Persona: "+ persona.toString());
    }
}