/*
Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del a�o, en min�sculas. A continuaci�n, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto. Un ejemplo de ejecuci�n del programa podr�a ser este:
Adivine el mes secreto. Introduzca el nombre del mes en min�sculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
�Ha acertado!
 */
package Entidades;

public class Meses {
    
    private String[] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    private String mesSecreto;

    public Meses() {
    
        this.mesSecreto = meses[(int) (Math.random() * 12)];
    }

    public String[] getMeses() {
        return meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }
}
