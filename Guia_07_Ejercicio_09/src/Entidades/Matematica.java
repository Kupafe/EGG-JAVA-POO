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
package Entidades;

// Realizar una clase llamada Matemática
public class Matematica {
    
    // Que tenga como atributos dos números reales
    private Double numeroA;
    private Double numeroB;

    // La clase deber tener un constructor vacío
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
