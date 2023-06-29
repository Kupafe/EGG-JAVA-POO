/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuaci�n, se deben crear los siguientes m�todos:
a) M�todo constructor que inicialice el radio pasado como par�metro.
b) M�todos get y set para el atributo radio de la clase Circunferencia.
c) M�todo para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) M�todo area(): para calcular el �rea de la circunferencia (Area = PI * radio al cuadrado).
e) M�todo perimetro(): para calcular el per�metro (Perimetro = 2 * PI * radio).
 */
package Entidades;

// Declarar una clase llamada Circunferencia
public class Circunferencia {
   
    // Que tenga como atributo privado el radio de tipo real.
    private double radio;
 
    // A continuaci�n, se deben crear los siguientes m�todos:
    
    public Circunferencia() {
        
    }
    
    // a) M�todo constructor que inicialice el radio pasado como par�metro.
    public Circunferencia(double radio) {
        
        this.radio = radio;
    }

    // b) M�todos get y set para el atributo radio de la clase Circunferencia.

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        
       //if(radio > 0){
            
           this.radio = radio;
        
        //}
    }
    
    /* c) M�todo para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) M�todo area(): para calcular el �rea de la circunferencia (???? = ? ? ??????).
e) M�todo perimetro(): para calcular el per�metro (????????? = ? ? ? ? ?????).
 */
}
