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
package Servicio;

import Entidades.Operacion;
import java.util.Scanner;

public class OperacionServicio {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las � y los tilde
    
    Operacion ope = new Operacion();
   
    /*
    d) M�todo para crearOperacion(): que le pide al usuario los dos n�meros y los guarda
       en los atributos del objeto.
    */
    public void crearOperacion(){
      
        System.out.print("Ingrese su Primer numero: ");
        ope.setNumero1(leer.nextDouble());
        
        System.out.print("Ingrese su Segundo numero: ");
        ope.setNumero2(leer.nextDouble());
    }
    
    // e) M�todo sumar(): calcular la suma de los n�meros y devolver el resultado al main.
    public double sumar(){
        
        System.out.print(ope.getNumero1() +" + "+ ope.getNumero2() +" = ");
        return ope.getNumero1() + ope.getNumero2();
    }
    
    // f) M�todo restar(): calcular la resta de los n�meros y devolver el resultado al main
    public double restar(){
        
        System.out.print(ope.getNumero1() +" - "+ ope.getNumero2() +" = ");
        return ope.getNumero1() - ope.getNumero2();
    }
    
    /*
    g) M�todo multiplicar(): primero valida que no se haga una multiplicaci�n por cero, si
       fuera a multiplicar por cero, el m�todo devuelve 0 y se le informa al usuario el error.
       Si no, se hace la multiplicaci�n y se devuelve el resultado al main
    */
    public double multiplcar(){
        
        System.out.print(ope.getNumero1() +" * "+ ope.getNumero2() +" = ");
        return ope.getNumero1() * ope.getNumero2();
    }
    
    /*
    h) M�todo dividir(): primero valida que no se haga una divisi�n por cero, si fuera a pasar
       una divisi�n por cero, el m�todo devuelve 0 y se le informa al usuario el error se le
       informa al usuario. Si no, se hace la divisi�n y se devuelve el resultado al main.
    */
    public double dividir(){
        
        if(ope.getNumero1() <= ope.getNumero2()){
            
            System.out.print(ope.getNumero1() +" / "+ ope.getNumero2() +" = ");
            return ope.getNumero1() / ope.getNumero2();
            
        }else{
            System.out.println("La division no se puede realizar");
            return 0;
            /*
            System.out.print(ope.getNumero2() +" / "+ ope.getNumero1() +" = ");
            return ope.getNumero2() / ope.getNumero1();*/
        }
        
    }
    
    public String menu(){
        
        String opcion;
        
        System.out.print("\nBienvenidos al Programa de Cuentas Basicas de Matematicas.\n"
                + "\nMENU.\n"
                + "\t1 - INGRESAR NUMEROS.\n"
                + "\t2 - SUMAR.\n"
                + "\t3 - RESTAR.\n"
                + "\t4 - MULTIPLICAR.\n"
                + "\t5 - DIVIDIR.\n\n"
                + "\t0 - SALIR.\n\n"
                + "Elija opcion: ");
        opcion = leer.next();
                
        return opcion;        
    }
}
