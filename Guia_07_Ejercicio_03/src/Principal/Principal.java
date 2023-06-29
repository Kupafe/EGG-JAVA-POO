/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuaci�n, se deben crear los siguientes m�todos:
    a) M�todo constructor con todos los atributos pasados por par�metro.
    b) Metodo constructor sin los atributos pasados por par�metro.
    c) M�todos get y set.
    d) M�todo para crearOperacion(): que le pide al usuario los dos n�meros y los guarda
       en los atributos del objeto.
    e) M�todo sumar(): calcular la suma de los n�meros y devolver el resultado al main.
    f) M�todo restar(): calcular la resta de los n�meros y devolver el resultado al main
    g) M�todo multiplicar(): primero valida que no se haga una multiplicaci�n por cero, si
       fuera a multiplicar por cero, el m�todo devuelve 0 y se le informa al usuario el error.
       Si no, se hace la multiplicaci�n y se devuelve el resultado al main
    h) M�todo dividir(): primero valida que no se haga una divisi�n por cero, si fuera a pasar
       una divisi�n por cero, el m�todo devuelve 0 y se le informa al usuario el error se le
       informa al usuario. Si no, se hace la divisi�n y se devuelve el resultado al main.
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
