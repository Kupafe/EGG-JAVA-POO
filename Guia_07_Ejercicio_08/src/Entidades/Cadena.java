/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se crear� el objeto y se le pedir� al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a trav�s de los m�todos set, se guardar� la frase y la longitud de manera
autom�tica seg�n la longitud de la frase ingresada. Deber� adem�s implementar los
siguientes m�todos:
    a) M�todo mostrarVocales(), deber� contabilizar la cantidad de vocales que tiene la
       frase ingresada.
    b) M�todo invertirFrase(), deber� invertir la frase ingresada y mostrarla por pantalla. Por
       ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    c) M�todo vecesRepetido(String letra), recibir� un car�cter ingresado por el usuario y
       contabilizar cu�ntas veces se repite el car�cter en la frase, por ejemplo:
    d) Entrada: frase = "casa blanca". Salida: El car�cter 'a' se repite 4 veces.
    e) M�todo compararLongitud(String frase), deber� comparar la longitud de la frase que
       compone la clase con otra nueva frase ingresada por el usuario.
    f) M�todo unirFrases(String frase), deber� unir la frase contenida en la clase Cadena
       con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    g) M�todo reemplazar(String letra), deber� reemplazar todas las letras ?a? que se
       encuentren en la frase, por alg�n otro car�cter seleccionado por el usuario y mostrar
       la frase resultante.
    h) M�todo contiene(String letra), deber� comprobar si la frase contiene una letra que
       ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Entidades;

/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud.
*/
public class Cadena {
    
    private String frase;
    private Integer largoFrase;

    public Cadena() {
    }

    public Cadena(String frase, Integer largoFrase) {
        this.frase = frase;
        this.largoFrase = largoFrase;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public Integer getLargoFrase() {
        return largoFrase;
    }

    public void setLargoFrase(Integer largoFrase) {
        this.largoFrase = largoFrase;
    }
}
