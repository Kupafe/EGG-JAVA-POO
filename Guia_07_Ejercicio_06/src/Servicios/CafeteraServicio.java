/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad m�xima de caf� que puede contener la cafetera) y cantidadActual (la
cantidad actual de caf� que hay en la cafetera). Implemente, al menos, los siguientes
m�todos:
    - Constructor predeterminado o vac�o
    - Constructor con la capacidad m�xima y la cantidad actual
    - M�todos getters y setters.
    - M�todo llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
      m�xima.
    - M�todo servirTaza(int): se pide el tama�o de una taza vac�a, el m�todo recibe el
      tama�o de la taza y simula la acci�n de servir la taza con la capacidad indicada. Si la
      cantidad actual de caf� ?no alcanza? para llenar la taza, se sirve lo que quede. El
      m�todo le informar� al usuario si se llen� o no la taza, y de no haberse llenado en
      cuanto qued� la taza.
    - M�todo vaciarCafetera(): pone la cantidad de caf� actual en cero.
    - M�todo agregarCafe(int): se le pide al usuario una cantidad de caf�, el m�todo lo
      recibe y se a�ade a la cafetera la cantidad de caf� indicada.
 */
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {
 
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las � y los tilde
    
    Cafetera c = new Cafetera();
    
    /*
    Metodo para pedir cual va a ser la capacidad maxima de liquido que va a
    tener la cafetera 
    */
    public void capacidadMaximaCafetera(){
        
        System.out.print("Ingrese en Mililitros la Capacidad Maxima de Liquido que va a tener la cafetera: ");
        c.setCantidadMaxima(leer.nextInt());
    }
    
    public void menu(){
        
        String opcion;
        
        capacidadMaximaCafetera();
        
        do{
        
            System.out.print("MENU NESPRESSO.\n"
                    + "\n\t1 - Llenar Cafetera.\n"
                    + "\t2 - Servir Taza.\n"
                    + "\t3 - Vaciar Cafetera.\n"
                    + "\t4 - Agregar Agua a la Cafetera.\n"
                    + "\t5 - Ver la Cantidad Actual de Cafe.\n"
                    + "\t0 - Salir."
                    + "\n\tIngrese opcion: ");
            opcion = leer.next();

            switch(opcion){
                
                case "1":
                    llenarCafetera();
                    break;
                    
                case "2":
                    menuTaza();
                    break;
                    
                case "3":
                    vaciarCafetera();
                    break;
                    
                case "4":
                    agregarCafe();
                    break;
                    
                case "5":
                    totalActual();
                    break;
                    
                case "0":
                    System.out.println("Saliendo ...");
                    
                default:
                    System.out.println("Opcion incorrecta.");

            }
        }while(!opcion.equalsIgnoreCase("0"));
    }

    /*
    M�todo llenarCafetera(): hace que la cantidad actual sea igual a la
    capacidad m�xima.
    */
    public void llenarCafetera(){
        
        if (c.getCantidadActual() != c.getCantidadMaxima()){
            
            System.out.println("Llenando la cafetera ...");
            c.setCantidadActual(c.getCantidadMaxima());
            System.out.println("La Cafetera esta llena.\n");
        
        }else{
            
            System.out.println("La Cafetera esta llena.\n");
        }
    }
   
    public void menuTaza(){
        
        Integer opcionTaza;
        
        System.out.print("Elija el tama�o de taza que se va a servir.\n"
                + "\n\t1 - 60 ml.\n"
                + "\t2 - 125 ml.\n"
                + "\t3 - 150 ml.\n"
                + "\t4 - 200 ml.\n"
                + "\t5 - 220 ml.\n"
                + "\nElija opcion: ");
        opcionTaza = leer.nextInt();

        servirTaza(opcionTaza);
    }
    
    /*
    M�todo servirTaza(int): se pide el tama�o de una taza vac�a, el m�todo recibe el
    tama�o de la taza y simula la acci�n de servir la taza con la capacidad indicada. Si la
    cantidad actual de caf� "no alcanza" para llenar la taza, se sirve lo que quede. El
    m�todo le informar� al usuario si se llen� o no la taza, y de no haberse llenado en
    cuanto qued� la taza.
    */
    public void servirTaza(Integer opcionTaza){
        
        switch(opcionTaza){
            
            case 1:
                descontarLiquido(60);
                break;
                
            case 2:
                descontarLiquido(125);
                break;
                
            case 3:
                descontarLiquido(150);
                break;
                
            case 4:
                descontarLiquido(200);
                break;
                
            case 5:
                descontarLiquido(220);
                break;
        }
        
    }
    
    public void descontarLiquido(Integer liquidoServido){
        
        if(liquidoServido <= c.getCantidadActual()){
            
            c.setCantidadActual(c.getCantidadActual() - liquidoServido);
            System.out.println("Se sirvio la Taza de Cafe con "+ liquidoServido +" ml.");
            
        }else{
            
            System.out.println("Como la Jarra de Cafe tiene "+ c.getCantidadActual() +" ml se le va a servir en la taza de "+ liquidoServido +" ml lo que quedo en la Jarra.");
            c.setCantidadActual(0);
        }
    }
    
    //M�todo vaciarCafetera(): pone la cantidad de caf� actual en cero.
    public void vaciarCafetera(){
        System.out.println("Vaciando la Cafetera ...");
        c.setCantidadActual(0);
        System.out.println("La Cafetera ya esta vacia.");
    }

    /*
    - M�todo agregarCafe(int): se le pide al usuario una cantidad de caf�, el m�todo lo
      recibe y se a�ade a la cafetera la cantidad de caf� indicada.
    */
    public void agregarCafe(){
        
        Integer liquido;
        
        System.out.print("�Cuanto Milimetros de Liquido quiere agregar a la Cafetera?: ");
        liquido = leer.nextInt();
        
        if (liquido + c.getCantidadActual() > c.getCantidadMaxima()){
            
            System.out.println("No se puede cargar la Cafetera con "+ liquido +" ml"
                    + " ya que el Nivel Actual es de "+ c.getCantidadActual() +", y"
                    + " entre el Liquido mas el Nivel Actual daria"
                    + " "+ (liquido + c.getCantidadActual()) +" que"
                    + " sobrepasaria el Limite "+ c.getCantidadMaxima() +" que tiene"
                    + " la Cafetera.");
            
        }else{
            
            System.out.println("LLenando la cafetera ...");
            c.setCantidadActual(c.getCantidadActual() + liquido);
            System.out.println("La cafeter ahora tiene "+ c.getCantidadActual() +" ml.");
        }
        
    }
    
    public void totalActual(){
        
        System.out.println("El total de Cafe Actual que tiene la Cafetera es de "+ c.getCantidadActual() +" ml.");
    }
}

