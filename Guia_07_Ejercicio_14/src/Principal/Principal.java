/*
Una tienda que vende tel�fonos m�viles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su informaci�n. Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo c�digo ser�
un arreglo num�rico de dimensi�n 7 (siete) donde cada sub�ndice alojar� un n�mero
correspondiente al c�digo. A continuaci�n, se implementar�n los siguientes m�todos:
? Un constructor por defecto.
? Un constructor con todos los atributos como par�metro.
? M�todos getters y setters de cada atributo.
? M�todo cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
? M�todo ingresarCodigo(): este m�todo permitir� ingresar el c�digo completo de siete
n�meros de un celular. Para ello, puede utilizarse un bucle repetitivo
 */
package Principal;

import Servicios.MovilServicio;

public class Principal {

    public static void main(String[] args) {
        
        MovilServicio ms = new MovilServicio();
        
        System.out.println("\nCOMIENZO DE LA EJECUCION DEL PROGRAMA.");
        
        ms.cargarCelular();
        
        System.out.println("FIN DE LA EJECUCION DEL PROGRAMA.\n");
    }
    
}