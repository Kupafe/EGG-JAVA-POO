/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedir�n al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos a�os hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vac�o.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package Principal;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las � y los tilde
        
        Integer dia, mes, anio;
      
        System.out.println("\nPrograma que va a mostrar la cantidad de a�os que hay entre la Fecha Ingresada por el Usuario con la Fecha Actual.");
        
        System.out.print("\nIngrese el numero de dia: ");
        dia = leer.nextInt();
        
        System.out.print("\nIngrese el numero de mes: ");
        mes = leer.nextInt();
        
        System.out.print("\nIngrese el numero de a�o: ");
        anio = leer.nextInt();
        
        LocalDate fechaIngresada = LocalDate.of(anio, mes, dia);
        
        System.out.println("Fecha Ingresada: "+ fechaIngresada);
        
        System.out.println("Fecha Actual: "+ LocalDate.now());
        
        System.out.println("La cantidad de a�os que hay entre la Fecha"
                + " Ingresada con la actual es de"
                + " "+ ChronoUnit.YEARS.between(fechaIngresada, LocalDate.now()) +" a�os.");
        
        
    }
    
}
