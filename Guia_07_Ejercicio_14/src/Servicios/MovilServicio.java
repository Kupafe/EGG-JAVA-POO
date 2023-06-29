/*
Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su información. Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
correspondiente al código. A continuación, se implementarán los siguientes métodos:
    - Un constructor por defecto.
    - Un constructor con todos los atributos como parámetro.
    - Métodos getters y setters de cada atributo.
    - Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
      instanciar un objeto Celular y poder cargarlo en nuestro programa.
    - Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
      números de un celular. Para ello, puede utilizarse un bucle repetitivo
 */
package Servicios;

import Entidades.Movil;
import java.util.Scanner;

public class MovilServicio {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
        
    Movil m = new Movil();
    
    /*
     - Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
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
            
            System.out.print("Ingrese el tamaño de Memoria Ram del celular: ");
            memoriaRamCelular = leer.nextInt();
            
        }while(memoriaRamCelular <= 0);
        
        m.setMemoriaRam(memoriaRamCelular);

        do{
            
            System.out.print("Ingrese el tamaño de Almacenamiento del celular: ");
            almacenamientoCelular = leer.nextInt();
            
        }while(almacenamientoCelular <= 0);
        
        m.setAlmacenamiento(almacenamientoCelular);

        ingresarCodigo();
    }
    
    /*
    - Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
      números de un celular. Para ello, puede utilizarse un bucle repetitivo
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