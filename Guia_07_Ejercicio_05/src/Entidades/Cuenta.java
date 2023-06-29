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
package Entidades;

// Realizar una clase llamada Cuenta (bancaria)
public class Cuenta {
    
    /*
    Debe tener como m�nimo los atributos: numeroCuenta (entero), el DNI del
    cliente (entero largo) y el saldo actual (entero).
    */
    private Integer numeroCuenta;
    private Long dni;
    private Double saldoActual;
    
    // a) Constructor por defecto y constructor con DNI, saldo, n�mero de cuenta e inter�s.

    public Cuenta() {
    }

    public Cuenta(Integer numeroCuenta, Long dni, Double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    // b) Agregar los m�todos getters y setters correspondientes
    public Integer getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(Integer numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public Double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(Double saldoActual) {
        this.saldoActual = saldoActual;
    }
}