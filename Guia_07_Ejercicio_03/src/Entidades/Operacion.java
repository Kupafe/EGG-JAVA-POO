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
package Entidades;

// Crear una clase llamada Operacion.
public class Operacion {
    
    // Que tenga como atributos privados numero1 y numero2.
    private double numero1;
    private double numero2;
    
    // A continuaci�n, se deben crear los siguientes m�todos:
    
    //a) M�todo constructor con todos los atributos pasados por par�metro.
    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    // b) Metodo constructor sin los atributos pasados por par�metro.
    public Operacion() {
    }
    
    // c) M�todos get y set.
    
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    
}
