/*
Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del a�o, en min�sculas. A continuaci�n, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto. Un ejemplo de ejecuci�n del programa podr�a ser este:
Adivine el mes secreto. Introduzca el nombre del mes en min�sculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
�Ha acertado!
 */
package Servicios;

import Entidades.Meses;
import java.util.Scanner;

public class MesServicio {
    
    public void acertarMesOculto(){
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las � y los tilde
        
        Meses m = new Meses();

        String mes;
        Boolean acerto = false;
        
        do{

            //System.out.println("Mes oculto: "+ m.getMesSecreto());
        
            System.out.print("Adivine el mes secreto. Introduzca el nombre del mes en min�sculas: ");
            mes = leer.next().toLowerCase();
            
            if (mes.equals(m.getMesSecreto())){
                
                acerto = true;
            
            }else{
                
                System.out.println("\nNo ha acertado el Mes Secreto.\n");
            }

        }while(acerto == false);

        
        System.out.println("\n�Ha acertado!");
    }
}