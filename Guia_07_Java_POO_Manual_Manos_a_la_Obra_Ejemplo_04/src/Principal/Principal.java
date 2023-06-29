/*
EJERCICIO PERSONA - GET Y SET
Continuaremos con nuestra clase Persona y vamos a primero crear los getter y setter y después
invocarlos desde el Main con alguno de los objetos que instanciaste.
 */
package Principal;

import Entidades.Persona;

public class Principal {

    public static void main(String[] args) {

        // Crear objeto Persona
        
        Persona persona1 = new Persona("Tomas", "Pasarelli Goltz", 4, 23, "Rivadavia 895", 29);
        Persona persona2 = new Persona("Nicolas", "Celis", 32, 35, "Wichi 123", 9521);
        
        System.out.println("Persona 1: "+ persona1.toString());
        System.out.println("Persona 2: "+ persona2.toString());
    }

}
