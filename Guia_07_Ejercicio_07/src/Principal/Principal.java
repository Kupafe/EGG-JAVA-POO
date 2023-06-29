/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea anadir algun otro
atributo, puede hacerlo. Los metodos que se implementaran son:
    - Un constructor por defecto.
    - Un constructor con todos los atributos como parametro.
    - Metodos getters y setters de cada atributo.
    - Metodo crearPersona(): el metodo crear persona, le pide los valores de los atributos
      al usuario y despues se le asignan a sus respectivos atributos para llenar el objeto
      Persona. Ademas, comprueba que el sexo introducido sea correcto, es decir, H, M o
      O. Si no es correcto se debera mostrar un mensaje
    - Metodo calcularIMC(): calculara si la persona esta en su peso ideal (peso en
      kg/(altura^2 en mt2)). Si esta formula da por resultado un valor menor que 20,
      significa que la persona esta por debajo de su peso ideal y la funcion devuelve un -1.
      Si la formula da por resultado un numero entre 20 y 25 (incluidos), significa que la
      persona esta en su peso ideal y la funcion devuelve un 0. Finalmente, si el resultado
      de la formula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
      funcion devuelve un 1.
    - Metodo esMayorDeEdad(): indica si la persona es mayor de edad. La funcion
      devuelve un booleano.
A continuacion, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuacion, llamaremos todos
los metodos para cada objeto, debera comprobar si la persona esta en su peso ideal,
tiene sobrepeso o esta por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por ultimo, guardaremos los resultados de los metodos calcularIMC y esMayorDeEdad en
distintas variables, para despues en el main, calcular un porcentaje de esas 4 personas
 */
package Principal;

import Servicios.PersonaServicio;

public class Principal {

    public static void main(String[] args) {
        
        Integer resultadoIMC;
        
        Boolean esMayor;
        
        PersonaServicio ps = new PersonaServicio();
        
        System.out.println("");        
        
        ps.crearPersona("Jaquelin Mendoza", 45, "m", 70.5, 1.55);
        resultadoIMC = ps.calcularIMC();
        ps.informacionResultadoIMC(resultadoIMC);
        esMayor = ps.esMayorDeEdad();
        ps.informarResultadoMayor(esMayor);
        
        System.out.println("\n-----------------------------------------------\n");
        
        ps.crearPersona("Jazmin Kugler Mendoza", 16, "g", 55.44, 1.65);
        resultadoIMC = ps.calcularIMC();
        ps.informacionResultadoIMC(resultadoIMC);
        esMayor = ps.esMayorDeEdad();
        ps.informarResultadoMayor(esMayor);
        
        System.out.println("\n-----------------------------------------------\n");
        
        ps.crearPersona("Federico Pablo Kugler", 48, "h", 96.8, 1.71);
        resultadoIMC = ps.calcularIMC();
        ps.informacionResultadoIMC(resultadoIMC);
        esMayor = ps.esMayorDeEdad();
        ps.informarResultadoMayor(esMayor);
        
        System.out.println("\n-----------------------------------------------\n");
        
        ps.crearPersona("Luna", 5, "o", 5.3, 80.1);
        resultadoIMC = ps.calcularIMC();
        ps.informacionResultadoIMC(resultadoIMC);
        esMayor = ps.esMayorDeEdad();
        ps.informarResultadoMayor(esMayor);
        System.out.println("");
    }
}
