/*
Crear una clase Rect�ngulo que modele rect�ngulos por medio de un atributo privado
base y un atributo privado altura. La clase incluir� un m�todo para crear el rect�ngulo
con los datos del Rect�ngulo dados por el usuario. Tambi�n incluir� un m�todo para
calcular la superficie del rect�ngulo y un m�todo para calcular el per�metro del
rect�ngulo. Por �ltimo, tendremos un m�todo que dibujar� el rect�ngulo mediante
asteriscos usando la base y la altura. Se deber�n adem�s definir los m�todos getters,
setters y constructores correspondientes.
Superficie = base * altura / Per�metro = (base + altura) * 2.
 */
package Principal;

import Servicio.RectanguloServicio;

public class Principal {

    public static void main(String[] args) {
        
        RectanguloServicio rs = new RectanguloServicio();
       
        System.out.println("\nCALCULO DE RECTANGULO.\n");
        
        rs.menu();
        
        System.out.println("\nFIN DE LA EJECUCION DEL PROGRAMA.");
        
    }
    
}
