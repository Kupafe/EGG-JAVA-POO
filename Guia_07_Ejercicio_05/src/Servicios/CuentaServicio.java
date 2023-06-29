/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
    a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
    b) Agregar los métodos getters y setters correspondientes
    c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
       y se la sumara a saldo actual.
    e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
       la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
       pondrá el saldo actual en 0.
    f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
       usuario no saque más del 20%.
    g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package Servicios;

import Entidades.Cuenta;
import java.util.Scanner;

public class CuentaServicio {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
    
    Cuenta c = new Cuenta();
    
    // c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    public Cuenta altaCuenta(Cuenta c){
    
        System.out.print("\nCREAR CUENTA.\n"
                + "\nIngrese el Numero de Cuenta del Cliente: ");
        c.setNumeroCuenta(leer.nextInt());
        
        System.out.print("Ingrese el Numero de DNI del Cliente con Numero de Cuenta "+ c.getNumeroCuenta() +": ");
        c.setDni(leer.nextLong());
        
        c.setSaldoActual(0.0);
                
        return c;
    }
    
    /*
    d) Método ingresar(double ingreso): el método recibe una cantidad de dinero
    a ingresar y se la sumara a saldo actual.
    */
    public void ingresar(Double ingreso){
        
        c.setSaldoActual(c.getSaldoActual() + ingreso);
    }
    
    /*
    e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
       la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
       pondrá el saldo actual en 0.
    */
    
    public void retirar(Double retiro){
      
        if (c.getSaldoActual() - retiro >= 0){
        
            c.setSaldoActual(c.getSaldoActual() - retiro);
        
        }else{
            
            c.setSaldoActual(0.0);
        }
    }

    /*
    f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
       usuario no saque más del 20%.
    */
    public void extraccionRapida(){
        
        if (c.getSaldoActual() > 0){
            
            Double sActual = c.getSaldoActual();
            
            System.out.println("El monto a retirar es de $"+ ((20 * sActual) / 100) +" Pesos.");
            c.setSaldoActual((sActual - ((20 * sActual) / 100)));
            
            
            //System.out.println("Su saldo actual es de $"+ c.getSaldoActual() +" Pesos.");
            
        }else{
            
            System.out.println("No cuenta con saldo. Su saldo es "+ c.getSaldoActual());
        }
    }
    
    // g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    public void consultarSaldo(){
        
        System.out.println("Su saldo actual es de $"+ c.getSaldoActual() +" Pesos." );
    }
    
    // h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    public void consultarDatos(){
        
        System.out.println("Los datos de la cuenta "+ c.getNumeroCuenta() +" son:\n"
                + "\tDNI: "+ c.getDni() +".\n"
                + "\tSaldo Actual: $"+ c.getSaldoActual() +" Pesos.");
    }
    
    public void menu(){
       
        
        String opcion;
        
        c = altaCuenta(c);
        
        do{

            System.out.print("MENU.\n"
                    + "\n\t1 - Ingresar Dinero.\n"
                    + "\t2 - Retirar Dinero.\n"
                    + "\t3 - Extraccion Rapida.\n"
                    + "\t4 - Consultar Saldo.\n"
                    + "\t5 - Consultar Datos.\n"
                    + "\n\t0 - Salir.\n"
                    + "\nIngrese opcion: ");
            opcion = leer.next();
            
            switch(opcion){

                case "1":
                    
                    System.out.print("Ingrese monto: ");
                    ingresar(leer.nextDouble());
                    break;

                case "2":

                    System.out.print("Ingrese monto a retirar: ");
                    retirar(leer.nextDouble());
                    break;

                case "3":
                    extraccionRapida();
                    break;

                case "4":
                    consultarSaldo();
                    break;

                case "5":
                    consultarDatos();
                    break;
                    
                case "0":
                    System.out.println("Saliendo ....");
                    break;
            }

        }while(!opcion.equals("0"));
    }
}
