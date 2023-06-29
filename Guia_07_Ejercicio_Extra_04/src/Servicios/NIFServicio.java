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
package Servicios;

import Entidades.NIF;
import java.util.Scanner;

public class NIFServicio {
    
    /*
    - M�todo crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
      corresponder�. Una vez calculado, le asigna la letra que le corresponde seg�n el
      resultado del calculo.
    */
    public void crearNIF(){

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las � y los tilde
        
        NIF nif = new NIF();
        
        String[] vectorNif = new String[]{"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        
        System.out.print("Ingrese su Numero de DNI: ");
        nif.setDni(leer.nextLong());
        
        Integer docu = nif.getDni().intValue();
        

        nif.setLetra(vectorNif[docu % 23]);
        
        mostrar(nif);
    }
    
    /*
    - M�todo mostrar(): que nos permita mostrar el NIF (ocho d�gitos, un guion y la letra
      en may�scula; por ejemplo: 00395469-F).
    */
    public void mostrar(NIF nif){
        
        System.out.println("\nSu codigo NIF es: "+ nif.getDni() +"-"+ nif.getLetra() +".");
    }
}
