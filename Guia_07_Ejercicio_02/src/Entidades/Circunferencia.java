/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = PI * radio al cuadrado).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 * PI * radio).
 */
package Entidades;

// Declarar una clase llamada Circunferencia
public class Circunferencia {
   
    // Que tenga como atributo privado el radio de tipo real.
    private double radio;
 
    // A continuación, se deben crear los siguientes métodos:
    
    public Circunferencia() {
        
    }
    
    // a) Método constructor que inicialice el radio pasado como parámetro.
    public Circunferencia(double radio) {
        
        this.radio = radio;
    }

    // b) Métodos get y set para el atributo radio de la clase Circunferencia.

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        
       //if(radio > 0){
            
           this.radio = radio;
        
        //}
    }
    
    /* c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (???? = ? ? ??????).
e) Método perimetro(): para calcular el perímetro (????????? = ? ? ? ? ?????).
 */
}
