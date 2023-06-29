/*
Una tienda que vende tel�fonos m�viles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su informaci�n. Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo c�digo ser�
un arreglo num�rico de dimensi�n 7 (siete) donde cada sub�ndice alojar� un n�mero
correspondiente al c�digo. A continuaci�n, se implementar�n los siguientes m�todos:
    - Un constructor por defecto.
    - Un constructor con todos los atributos como par�metro.
    - M�todos getters y setters de cada atributo.
    - M�todo cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
      instanciar un objeto Celular y poder cargarlo en nuestro programa.
    - M�todo ingresarCodigo(): este m�todo permitir� ingresar el c�digo completo de siete
      n�meros de un celular. Para ello, puede utilizarse un bucle repetitivo
 */
package Servicios;

import Entidades.Movil;
import java.util.Scanner;

public class MovilServicio {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las � y los tilde
        
    Movil m = new Movil();
    
    /*
     - M�todo cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
      instanciar un objeto Celular y poder cargarlo en nuestro programa.
    */
    public void cargarCelular(){
    
        Double precioCelular;
        Integer memoriaRamCelular, almacenamientoCelular;
        
        System.out.print("Ingrese la marca del Celular: ");
        m.setMarca(leer.next());
       
        do{
            
            System.out.print("Ingrese el precio del celular.\n"
                    + "Utilice la coma (,) para separar los decimales.\n"
                    + "Ingrese precio: ");
            precioCelular = leer.nextDouble();
            
        }while(precioCelular <= 0);
        
        m.setPrecio(precioCelular);
        
        System.out.print("Ingrese el modelo del Celular: ");
        m.setModelo(leer.next());
        
        do{
            
            System.out.print("Ingrese el tama�o de Memoria Ram del celular: ");
            memoriaRamCelular = leer.nextInt();
            
        }while(memoriaRamCelular <= 0);
        
        m.setMemoriaRam(memoriaRamCelular);

        do{
            
            System.out.print("Ingrese el tama�o de Almacenamiento del celular: ");
            almacenamientoCelular = leer.nextInt();
            
        }while(almacenamientoCelular <= 0);
        
        m.setAlmacenamiento(almacenamientoCelular);

        ingresarCodigo();
    }
    
    /*
    - M�todo ingresarCodigo(): este m�todo permitir� ingresar el c�digo completo de siete
      n�meros de un celular. Para ello, puede utilizarse un bucle repetitivo
    */
    public void ingresarCodigo(){
        
        Integer codigoCelular, largo;
        String codigoCelularString, letra;
        
        do{
        
            System.out.print("Ingrese el Codigo de Numerico del Celular: ");
            codigoCelular = leer.nextInt();
        
            // String numCadena = String.valueOf(numEntero);
            codigoCelularString = String.valueOf(codigoCelular);
            largo = codigoCelularString.length();
        
        }while(codigoCelular < 0 || largo != 7);
        
        String[] vectorMovil = new String[7];
        
        for (int i = 0; i < vectorMovil.length; i++) {
            
            // substring(int beginIndex, int endIndex
            letra = codigoCelularString.substring(i, i + 1);
            
            // int numEntero = Integer.parseInt(numCadena);
            vectorMovil[i] = letra;
        }
        
        m.setCodigo(vectorMovil);
    
        mostrarMovil(vectorMovil);
    }
    
    public void mostrarMovil(String[] vectorMovil){
        
        System.out.print("El Celular Marca: "+ m.getMarca() +""
                + ", Modelo: "+ m.getModelo() +", Memoria RAM: "
                + m.getMemoriaRam() +" GB, Espacio de Almacenamiento: "
                + ""+ m.getAlmacenamiento() +" GB, Numero de Serie: ");

        for (int i = 0; i < m.getCodigo().length; i++) {
            
            System.out.print(vectorMovil[i]);
        }
        
        System.out.println(" tiene un precio de $"+ m.getPrecio() +" Pesos.");
    }
}