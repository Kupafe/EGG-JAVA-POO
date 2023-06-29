/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
    a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
       frase ingresada.
    b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
       ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
       contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
    d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
       compone la clase con otra nueva frase ingresada por el usuario.
    f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
       con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    g) Método reemplazar(String letra), deberá reemplazar todas las letras ?a? que se
       encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
       la frase resultante.
    h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
       ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Servicios;

import Entidades.Cadena;

public class CadenaServicio {
    
    String vocal;

    /*
    a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
    frase ingresada.
    */
    public void mostrarVocales(Cadena cad){
        
        Integer contadorVocales = 0;
        
        for (int i = 0; i < cad.getLargoFrase(); i++) {
            
            // substring(int beginIndex, int endIndex)
            vocal = cad.getFrase().substring( i, i + 1).toLowerCase();
            
            if(vocal.equals("a") || vocal.equals("e") || vocal.equals("i") || vocal.equals("o") || vocal.equals("u")){
                
                contadorVocales++;
            }
        }

        System.out.println("La cantidad de Vocales que tiene la Palabra o Frase es de "+ contadorVocales +" vocales");
    }
    
    /*
    b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
    ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    */
    public void invertirFrase(Cadena cad){
        
        String cadenaAux = "";
        
        for (int i = cad.getLargoFrase() - 1; i >= 0; i--) {
            
            //  substring(int beginIndex, int endIndex)
            vocal = cad.getFrase().substring( i, i + 1).toLowerCase();
            
            // concat(String str)
            cadenaAux = cadenaAux.concat(vocal);
        }
        
        System.out.println("La Palabra o Frase de manera Invertida queda de la siguiente manera: \n"
                + cadenaAux +".");
    }
    
    /*
    c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
    contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
    d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    */
    public void vecesRepetido(Cadena cad, String letra){
        
        Integer contadorRepetidas = 0;
        
        for (int i = cad.getLargoFrase() - 1; i >= 0; i--) {
            
            //  substring(int beginIndex, int endIndex)
            vocal = cad.getFrase().substring( i, i + 1).toLowerCase();
            
            if(vocal.equalsIgnoreCase(letra)){
                
                contadorRepetidas++;
            }
        }
        
        System.out.println("La cantidad de veces que se repite la letra "+ letra+" dentro de la palabra o Frase es "+ contadorRepetidas +" veces.");
    }
    
    /*
    e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
    compone la clase con otra nueva frase ingresada por el usuario.
    */
    public void compararLongitud(Cadena cad, String frase){
        
        if(frase.length() > cad.getLargoFrase()){
            
            System.out.println("La Palabra o Frase: "+ frase +"\n"
                    + "tiene "+ frase.length() +" caracteres\n"
                    + "por eso, es mas larga que"
                    + " la Palabra o Frase: "+ cad.getFrase() +"\n"
                    + "ya que tiene "+ cad.getLargoFrase() +" caracteres.");
        
        }else if(frase.length() < cad.getLargoFrase()){
            
            System.out.println("La Palabra o Frase: "+ frase +"\n"
                    + "tiene "+ frase.length() +" caracteres\n"
                    + "por eso, es mas corta que"
                    + " la Palabra o Frase: "+ cad.getFrase() +"\n"
                    + "ya que tiene "+ cad.getLargoFrase() +" caracteres.");
        
        }else if(frase.length() == cad.getLargoFrase()){
            
            System.out.println("La Palabra o Frase: "+ frase +"\n"
                    + "tiene "+ frase.length() +" caracteres\n"
                    + "por eso, es igual que"
                    + " la Palabra o Frase: "+ cad.getFrase() +"\n"
                    + "ya que tiene "+ cad.getLargoFrase() +" caracteres.");
        }
    }
        
    /*
    f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
    con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    */
    public void unirFrases(Cadena cad, String frase){

        String cadenaConcatenada;

        // concat(String str)
        cadenaConcatenada = cad.getFrase().concat(" "+ frase);

        System.out.println("La union de las Palabras y/o Frases quedo de la siguiente manera: ");
        System.out.println(cadenaConcatenada);

    }

    /*
    g) Método reemplazar(String letra), deberá reemplazar todas las letras "a" que se
    encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
    la frase resultante.
    */
    public void reemplazar(Cadena cad, String letra){
        
        String[] cadenaReemplazada = new String[cad.getLargoFrase()];
        
        for (int i = 0; i < cadenaReemplazada.length; i++) {
            
            // substring(int beginIndex, int endIndex)
            vocal = cad.getFrase().substring( i, i + 1).toLowerCase();
            
            if(vocal.equals("a")){

                cadenaReemplazada[i] = letra;
 
            }else{
                
                cadenaReemplazada[i] = vocal;
            }
        }
        
        System.out.println("\nLa Palabra o Frase con la Letra "+ letra +" Seleccionada por el"
                + " usuario y reemplazada por la a queda de la siguiente manera:\n");
        
        for (int i = 0; i < cadenaReemplazada.length; i++) {
            
            System.out.print(cadenaReemplazada[i]);
        }
        
        System.out.println("");
    }
    
    /*
    h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
    ingresa el usuario y devuelve verdadero si la contiene y falso si no.
     */
    public boolean contiene(Cadena cad, String letra){
        
        boolean contieneLetra = false;
        
        for (int i = 0; i < cad.getLargoFrase(); i++) {
            
            // substring(int beginIndex, int endIndex)
            vocal = cad.getFrase().substring( i, i + 1).toLowerCase();
            
            if(vocal.equals(letra)){
                
                contieneLetra = true;
            }
        }
        
        return contieneLetra;
    }
}


        
        
        
    
    
    
    

//La Casa Rosada y Blanca
//es grande, confortable y lujoza