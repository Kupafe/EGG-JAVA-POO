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
package Servicio;

import Entidades.Matematica;

public class MatematicaServicio {
    
    // Deberá además implementar los siguientes métodos:
    
    // a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    
    public Double devolverMayor(Double numeroA, Double numeroB){
        
       // max(double a, double b)     Devuelve el mayor de dos valores double
       return (Math.max(numeroA, numeroB));
    }
    
    /*
    b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
       elevado al menor número. Previamente se deben redondear ambos valores.
    */
    public Double calcularPotencia(Double numeroA, Double numeroB){

        /*
        pow(double a, double b)     Devuelve el valor del primer argumento elevado a la potencia del
                                    segundo argumento.
        */
        return Math.pow(numeroA, numeroB);
    }
    
    /*
    c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
       Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    */
    
    public Double calcularRaiz(Double menor){
        
        /*
        abs(double a)               Devuelve el valor absoluto de un valor double introducido como
                                    parámetro.
        
        sqrt(double a)              Devuelve la raíz cuadrada positiva correctamente redondeada de un
                                    double.
        */
        
        return Math.sqrt(Math.abs(menor));
    }
}
