/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como m�nimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
    a) Constructor por defecto y constructor con DNI, saldo, n�mero de cuenta e inter�s.
    b) Agregar los m�todos getters y setters correspondientes
    c) Metodo para crear un objeto Cuenta, pidi�ndole los datos al usuario.
    d) M�todo ingresar(double ingreso): el m�todo recibe una cantidad de dinero a ingresar
       y se la sumara a saldo actual.
    e) M�todo retirar(double retiro): el m�todo recibe una cantidad de dinero a retirar y se
       la restar� al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
       pondr� el saldo actual en 0.
    f) M�todo extraccionRapida(): le permitir� sacar solo un 20% de su saldo. Validar que el
       usuario no saque m�s del 20%.
    g) M�todo consultarSaldo(): permitir� consultar el saldo disponible en la cuenta.
    h) M�todo consultarDatos(): permitir� mostrar todos los datos de la cuenta
 */
package Principal;

import Servicios.CuentaServicio;

public class Principal {

    public static void main(String[] args) {
        
        CuentaServicio cs = new CuentaServicio();
        
        cs.menu();
     
        
    }
    
}
