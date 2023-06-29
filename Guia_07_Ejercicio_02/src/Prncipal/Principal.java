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
package Prncipal;

import Servicios.CircunferenciaServicio;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las � y los tilde
        
        CircunferenciaServicio cs = new CircunferenciaServicio();
        
        String opcion;
        double resultadoArea, resultadoPerimetro;
        
        do{
            
            cs.ingresarRadio();
            resultadoArea = cs.area();
            resultadoPerimetro = cs.perimetro();
            cs.mostrarArea(resultadoArea);
            cs.mostrarPerimetro(resultadoPerimetro);
            
            System.out.print("�Desea seguir ingresando numeros?\n"
                    + "\tS (Si) / N (No).\n"
                    + "Ingrese opcion: ");
            opcion = leer.next();
            
        }while(opcion.equalsIgnoreCase("s"));
            
    }
    
}
