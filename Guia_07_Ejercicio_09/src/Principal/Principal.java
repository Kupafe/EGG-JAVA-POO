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
package Principal;

import Entidades.Matematica;
import Servicio.MatematicaServicio;

public class Principal {

    public static void main(String[] args) {
        
        // En el main se crear� el objeto
        Matematica m = new Matematica();
        MatematicaServicio ms = new MatematicaServicio();
        
        Double menor, mayor;
        
        /*
        Se usar� el Math.random para generar los dos n�meros y se
        guardaran en el objeto con su respectivos set.
        */
        m.setNumeroA((Double)(Math.random()*10+1));
        m.setNumeroB((Double)(Math.random()*10+1));
        
        System.out.println("Numero A: "+ m.getNumeroA());
        System.out.println("Numero B: "+ m.getNumeroB());
        
        // a) M�todo devolverMayor() para retornar cu�l de los dos atributos tiene el mayor valor
        System.out.println("\nEl numero mayor es: "+ ms.devolverMayor(m.getNumeroA(), m.getNumeroB()));
        
        /*
        b) M�todo calcularPotencia() para calcular la potencia del mayor valor de la clase
        elevado al menor n�mero. Previamente se deben redondear ambos valores.
        */
        System.out.println("\nEl numero "+ m.getNumeroA() +" elevado a la potencia "+ m.getNumeroB() +" da como "
                + "resultado el numero "+ ms.calcularPotencia(Double.NaN, Double.NaN));

        // min(double a, double b)     Devuelve el menor de dos valores double.
        menor = Math.min(m.getNumeroA(), m.getNumeroB());
        
        /*
        c) M�todo calculaRaiz(), para calcular la ra�z cuadrada del menor de los dos valores.
        Antes de calcular la ra�z cuadrada se debe obtener el valor absoluto del n�mero.
        */
        System.out.println("La raiz cuadrada de "+ menor +" es "+ ms.calcularRaiz(menor));
    }
    
}
