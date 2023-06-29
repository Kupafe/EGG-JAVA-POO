/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
    a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
       elevado al menor número. Previamente se deben redondear ambos valores.
    c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
       Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Principal;

import Entidades.Matematica;
import Servicio.MatematicaServicio;

public class Principal {

    public static void main(String[] args) {
        
        // En el main se creará el objeto
        Matematica m = new Matematica();
        MatematicaServicio ms = new MatematicaServicio();
        
        Double menor, mayor;
        
        /*
        Se usará el Math.random para generar los dos números y se
        guardaran en el objeto con su respectivos set.
        */
        m.setNumeroA((Double)(Math.random()*10+1));
        m.setNumeroB((Double)(Math.random()*10+1));
        
        System.out.println("Numero A: "+ m.getNumeroA());
        System.out.println("Numero B: "+ m.getNumeroB());
        
        // a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
        System.out.println("\nEl numero mayor es: "+ ms.devolverMayor(m.getNumeroA(), m.getNumeroB()));
        
        /*
        b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
        elevado al menor número. Previamente se deben redondear ambos valores.
        */
        System.out.println("\nEl numero "+ m.getNumeroA() +" elevado a la potencia "+ m.getNumeroB() +" da como "
                + "resultado el numero "+ ms.calcularPotencia(Double.NaN, Double.NaN));

        // min(double a, double b)     Devuelve el menor de dos valores double.
        menor = Math.min(m.getNumeroA(), m.getNumeroB());
        
        /*
        c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
        Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
        */
        System.out.println("La raiz cuadrada de "+ menor +" es "+ ms.calcularRaiz(menor));
    }
    
}
