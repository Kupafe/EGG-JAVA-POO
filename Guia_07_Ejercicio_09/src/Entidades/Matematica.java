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
package Entidades;

// Realizar una clase llamada Matem�tica
public class Matematica {
    
    // Que tenga como atributos dos n�meros reales
    private Double numeroA;
    private Double numeroB;

    // La clase deber tener un constructor vac�o
    public Matematica() {
    }
    
    // Parametrizado
     public Matematica(Double numeroA, Double numeroB) {
        this.numeroA = numeroA;
        this.numeroB = numeroB;
    }
     
    // Get y Set.
    public Double getNumeroA() {
        return numeroA;
    }

    public void setNumeroA(Double numeroA) {
        this.numeroA = numeroA;
    }

    public Double getNumeroB() {
        return numeroB;
    }

    public void setNumeroB(Double numeroB) {
        this.numeroB = numeroB;
    }
}
