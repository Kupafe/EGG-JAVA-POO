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
package Servicio;

import Entidades.Operacion;
import java.util.Scanner;

public class OperacionServicio {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
    
    Operacion ope = new Operacion();
   
    /*
    d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
       en los atributos del objeto.
    */
    public void crearOperacion(){
      
        System.out.print("Ingrese su Primer numero: ");
        ope.setNumero1(leer.nextDouble());
        
        System.out.print("Ingrese su Segundo numero: ");
        ope.setNumero2(leer.nextDouble());
    }
    
    // e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
    public double sumar(){
        
        System.out.print(ope.getNumero1() +" + "+ ope.getNumero2() +" = ");
        return ope.getNumero1() + ope.getNumero2();
    }
    
    // f) Método restar(): calcular la resta de los números y devolver el resultado al main
    public double restar(){
        
        System.out.print(ope.getNumero1() +" - "+ ope.getNumero2() +" = ");
        return ope.getNumero1() - ope.getNumero2();
    }
    
    /*
    g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
       fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
       Si no, se hace la multiplicación y se devuelve el resultado al main
    */
    public double multiplcar(){
        
        System.out.print(ope.getNumero1() +" * "+ ope.getNumero2() +" = ");
        return ope.getNumero1() * ope.getNumero2();
    }
    
    /*
    h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
       una división por cero, el método devuelve 0 y se le informa al usuario el error se le
       informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
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
