/*
D�gito Verificador. Crear una clase NIF que se usar� para mantener DNIs con su
correspondiente letra (NIF). Los atributos ser�n el n�mero de DNI (entero largo) y la
letra (String o char) que le corresponde. Dispondr� de los siguientes m�todos:
    - M�todos getters y setters para el n�mero de DNI y la letra.
    - M�todo crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
      corresponder�. Una vez calculado, le asigna la letra que le corresponde seg�n el
      resultado del calculo.
    - M�todo mostrar(): que nos permita mostrar el NIF (ocho d�gitos, un guion y la letra
      en may�scula; por ejemplo: 00395469-F).

La letra correspondiente al d�gito verificador se calcular� a traves de un m�todo que
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el
n�mero de DNI por 23 (el resultado debe ser un n�mero entre 0 y 22). El m�todo debe
buscar en un array (vector) de caracteres la posici�n que corresponda al resto de la
divisi�n para obtener la letra correspondiente. La tabla de caracteres es la siguiente:

    POSICI�N        LETRA
        0             T
        1             R
        2             W
        3             A
        4             G
        5             M
        6             Y
        7             F
        8             P
        9             D
        10            X
        11            B
        12            N
        13            J
        14            Z
        15            S
        16            Q
        17            V
        18            H
        19            L
        20            C
        21            K
        22            E
 */
package Principal;

import Servicios.NIFServicio;

public class Principal {

    public static void main(String[] args) {

        NIFServicio nifs = new NIFServicio();
        
        System.out.println("\nCOMIENZO DE LA EJECUCION DEL PROGRAMA.\n");
        
        nifs.crearNIF();
        
        System.out.println("\nFIN DE LA EJECUCION DEL PROGRAMA.\n");
    }
}
