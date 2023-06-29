/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad m�xima de caf� que puede contener la cafetera) y cantidadActual (la
cantidad actual de caf� que hay en la cafetera). Implemente, al menos, los siguientes
m�todos:
    - Constructor predeterminado o vac�o
    - Constructor con la capacidad m�xima y la cantidad actual
    - M�todos getters y setters.
    - M�todo llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
      m�xima.
    - M�todo servirTaza(int): se pide el tama�o de una taza vac�a, el m�todo recibe el
      tama�o de la taza y simula la acci�n de servir la taza con la capacidad indicada. Si la
      cantidad actual de caf� ?no alcanza? para llenar la taza, se sirve lo que quede. El
      m�todo le informar� al usuario si se llen� o no la taza, y de no haberse llenado en
      cuanto qued� la taza.
    - M�todo vaciarCafetera(): pone la cantidad de caf� actual en cero.
    - M�todo agregarCafe(int): se le pide al usuario una cantidad de caf�, el m�todo lo
      recibe y se a�ade a la cafetera la cantidad de caf� indicada.
 */
package Principal;

import Servicios.CafeteraServicio;

public class Principal {

    public static void main(String[] args) {

        CafeteraServicio cs = new CafeteraServicio();
        
        System.out.println("BIENVENIDO AL SISTEMA DE NESPRESSO.");
        
        cs.menu();
        
        System.out.println("FIN DE LA EJECUCION DEL PROGRAMA.");
    }
    
}
 