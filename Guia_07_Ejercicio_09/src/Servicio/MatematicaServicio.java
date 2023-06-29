/*
Realizar una clase llamada Matem�tica que tenga como atributos dos n�meros reales con
los cuales se realizar�n diferentes operaciones matem�ticas. La clase deber tener un
constructor vac�o, parametrizado y get y set. En el main se crear� el objeto y se usar� el
Math.random para generar los dos n�meros y se guardaran en el objeto con su
respectivos set. Deber� adem�s implementar los siguientes m�todos:
    a) M�todo devolverMayor() para retornar cu�l de los dos atributos tiene el mayor valor
    b) M�todo calcularPotencia() para calcular la potencia del mayor valor de la clase
       elevado al menor n�mero. Previamente se deben redondear ambos valores.
    c) M�todo calculaRaiz(), para calcular la ra�z cuadrada del menor de los dos valores.
       Antes de calcular la ra�z cuadrada se debe obtener el valor absoluto del n�mero.
 */
package Servicio;

import Entidades.Matematica;

public class MatematicaServicio {
    
    // Deber� adem�s implementar los siguientes m�todos:
    
    // a) M�todo devolverMayor() para retornar cu�l de los dos atributos tiene el mayor valor
    
    public Double devolverMayor(Double numeroA, Double numeroB){
        
       // max(double a, double b)     Devuelve el mayor de dos valores double
       return (Math.max(numeroA, numeroB));
    }
    
    /*
    b) M�todo calcularPotencia() para calcular la potencia del mayor valor de la clase
       elevado al menor n�mero. Previamente se deben redondear ambos valores.
    */
    public Double calcularPotencia(Double numeroA, Double numeroB){

        /*
        pow(double a, double b)     Devuelve el valor del primer argumento elevado a la potencia del
                                    segundo argumento.
        */
        return Math.pow(numeroA, numeroB);
    }
    
    /*
    c) M�todo calculaRaiz(), para calcular la ra�z cuadrada del menor de los dos valores.
       Antes de calcular la ra�z cuadrada se debe obtener el valor absoluto del n�mero.
    */
    
    public Double calcularRaiz(Double menor){
        
        /*
        abs(double a)               Devuelve el valor absoluto de un valor double introducido como
                                    par�metro.
        
        sqrt(double a)              Devuelve la ra�z cuadrada positiva correctamente redondeada de un
                                    double.
        */
        
        return Math.sqrt(Math.abs(menor));
    }
}
