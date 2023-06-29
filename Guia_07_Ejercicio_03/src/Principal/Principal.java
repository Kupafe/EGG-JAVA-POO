/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
    a) Método constructor con todos los atributos pasados por parámetro.
    b) Metodo constructor sin los atributos pasados por parámetro.
    c) Métodos get y set.
    d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
       en los atributos del objeto.
    e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
    f) Método restar(): calcular la resta de los números y devolver el resultado al main
    g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
       fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
       Si no, se hace la multiplicación y se devuelve el resultado al main
    h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
       una división por cero, el método devuelve 0 y se le informa al usuario el error se le
       informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
package Principal;

import Entidades.Operacion;
import Servicio.OperacionServicio;

public class Principal {
    
    public static void main(String[] args) {
       
        OperacionServicio os = new OperacionServicio();
        Operacion ope = new Operacion();
        
        String opcion;
        double resultado, numeroA, numeroB;
        
        do{
            
            opcion = os.menu();
        
            switch(opcion){
                
                case "1":
                    
                    os.crearOperacion();
                    break;
                    
                case "2":
                    
                    resultado = os.sumar();
                    
                    System.out.println(+ resultado+".");
                
                    break;
                    
                case "3":
                    numeroA = ope.getNumero1();
                    numeroB = ope.getNumero2();
                    
                    resultado = os.restar();
                    System.out.println(+ resultado+".");
                    break;
                    
                case "4":
                    
                    resultado = os.multiplcar();
                    
                    System.out.println(+ resultado+".");
                    
                    break;
                    
                case "5":
                    
                    resultado = os.dividir();
                    System.out.println(+ resultado+".");
                    
                    break;
                    
                    case "0":
                        
                        System.out.println("\nSaliendo .....");
                        
                    break;
            }

        }while(!opcion.equals("0"));

        System.out.println("\nFIN DE LA EJECUCION DEL PROGRAMA.\n");
    }
    
}
