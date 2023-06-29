/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
    - Agregar un método de creación del objeto que respete la siguiente firma:
      crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
      usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
      fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
    - Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
      en cuenta que para conocer la edad de la persona también se debe conocer la fecha
      actual.
    - Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
      edad y retorna true en caso de que el receptor tenga menor edad que la persona que
      se recibe como parámetro, o false en caso contrario.
    - Metodo mostrarPersona(): este método muestra la persona creada en el método
      anterior.
 */
package Servicios;

import Entidades.Persona;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde    
    
    Persona p = new Persona();
    
    /*
    - Agregar un método de creación del objeto que respete la siguiente firma:
      crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
      usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
      fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
    */
    public void crearPersona(){
        
        Integer dia, mes, anio;
        
        System.out.print("\nIngrese el nombre de la Persona: ");
        p.setNombre(leer.next());
        
        System.out.print("\nIngrese el DIA de Nacimiento de "+ p.getNombre() +". Debe ingresarlo en numeros (dd): ");
        dia = leer.nextInt();
        
        System.out.print("\nIngrese el MES de Nacimiento de "+ p.getNombre() +". Debe ingresarlo en numeros (mm): ");
        mes = leer.nextInt();
        
        System.out.print("\nIngrese el AÑO de Nacimiento de "+ p.getNombre() +". Debe ingresarlo en numeros (aaaa): ");
        anio = leer.nextInt();
        
        LocalDate fechaIngresada = LocalDate.of(anio, mes, dia);
        
        p.setFechaNacimiento(fechaIngresada);
    }
    
    /*
    - Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
      en cuenta que para conocer la edad de la persona también se debe conocer la fecha
      actual.
    */
    public void calcularEdad(){
    
        //System.out.println("Fecha Actual: "+ LocalDate.now());
        
        System.out.println("\nLa cantidad de años que hay entre la Fecha"
                + " Ingresada con la actual es de"
                + " "+ ChronoUnit.YEARS.between(p.getFechaNacimiento(), LocalDate.now()) +" años.\n");
    }
    
    /*
    - Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
      edad y retorna true en caso de que el receptor tenga menor edad que la persona que
      se recibe como parámetro, o false en caso contrario.
    */
    public boolean menorQue(Integer edad){
    
        if(edad < ChronoUnit.YEARS.between(p.getFechaNacimiento(), LocalDate.now())){
            
            return true;
            
        }else{
            
            return false;
        }
     }
 
    /*
    - Metodo mostrarPersona(): este método muestra la persona creada en el método
      anterior.
    */
    public void mostrarPersona(){
        
        System.out.println(p.getNombre() +" tiene "+ ChronoUnit.YEARS.between(p.getFechaNacimiento(), LocalDate.now()) +" años.");
    }
    
    public void menu(){
        
        String opcion;
        
        do{
            
            System.out.print("\n--- MENU. ---\n"
                    + "\n\t1 - Crear Persona.\n"
                    + "\t2 - Calcular Edad.\n"
                    + "\t3 - Ingresar una edad para saber si es menor o mayor a la Persona Creada.\n"
                    + "\t4 - Mostrar informacion de la Persona Creada.\n"
                    + "\n\t0 - Salir.\n"
                    + "\nIngresar opcion: ");
            opcion = leer.next();
            
            switch(opcion){
                
                case "1":
                    
                    crearPersona();
                    
                    break;
                    
                case "2":
                        
                    calcularEdad();
                    
                    break;
                    
                case "3":
                    
                    Integer edadAComparar;
                    Boolean esMenor;
                    
                    do{
                        
                        System.out.print("\nIngrese una Edad. Tiene que ser Mayor a 0: ");
                        
                        edadAComparar = leer.nextInt();
                    
                    }while(edadAComparar < 0);
                    
                    esMenor = menorQue(edadAComparar);
                    
                    if(esMenor){
                        
                        System.out.println("La Edad de "+ edadAComparar +" es Menor que la Edad "+ ChronoUnit.YEARS.between(p.getFechaNacimiento(), LocalDate.now()) +" años." );
                        
                    }else{
                        
                        System.out.println("La Edad de "+ edadAComparar +" es Mayor que la Edad "+ ChronoUnit.YEARS.between(p.getFechaNacimiento(), LocalDate.now()) +" años." );
                    }
                    
                    break;
                    
                case "4":
                    
                    mostrarPersona();
                    break;
                    
                case "0":
                    
                    System.out.println("\nSaliendo ...\n");
                    
                    break;
                    
                    default:
                        
                        System.out.println("\nError. Mal Ingresada la opcion.\n");
                        
                        break;
            }
            
        }while(!opcion.equals("0"));
    }
}
