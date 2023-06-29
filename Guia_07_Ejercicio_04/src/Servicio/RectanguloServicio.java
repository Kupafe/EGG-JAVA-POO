/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Servicio;

import Entidades.Rectangulo;
import java.util.Scanner;

public class RectanguloServicio {
    
    Scanner leer = new Scanner(System.in);
    
    Rectangulo r = new Rectangulo();
    /*
    Incluirá un método para crear el rectángulo
    con los datos del Rectángulo dados por el usuario.
    */
    public Rectangulo altaRectangulo(Rectangulo r){
        
        System.out.print("Crear Rectangulo.\n\n"
                + "Ingrese la medida de la Base del Rectangulo en Centimetros: ");
        r.setBase(leer.nextInt());
        
        System.out.print("Ingrese la medida de la Altura del Rectangulo en Centimetros: ");
        r.setAltura(leer.nextInt());
        
        return r;
    }
    
    // También incluirá un método para calcular la superficie del rectángulo
    public void calcularSuperficie(Rectangulo r){
        
        System.out.println("La Superficie del Rectangulo es de "+ (r.getBase() * r.getAltura()) +" centimetros.");
    }
    
    // Un método para calcular el perímetro del rectángulo.
    public void calcularPerimetro(Rectangulo r){
        
        System.out.println("El Perimetro del Rectangulo es de "+ ((r.getBase() + r.getAltura() * 2)) +" centimetros.");
    }
    
    // un método que dibujará el rectángulo mediante asteriscos usando la base y la altura.
    public void dibujarRectangulo(Rectangulo r){
        
        System.out.println("");
        
        for (int i = 0; i < r.getBase(); i++) {
            
            for (int j = 0; j < r.getAltura(); j++) {
                
                if(i < 1 || j < 1 || i == r.getBase() - 1 || j == r.getAltura() - 1){
                    
                    System.out.print("* ");
                
                }else{
                    
                    System.out.print("  ");
                }
                
                
            }
            System.out.println("");
            
            
            
        }
        
        System.out.println("");
    }
    
    public void menu(){
        
        String opcion;
        
        do{

            System.out.print("MENU.\n"
                    + "\t1 - Ingresar medidas.\n"
                    + "\t2 - Calcular Superficie.\n"
                    + "\t3 - Calcular Perimetro.\n"
                    + "\t4 - Dibujar Rectangulo.\n\n"
                    + "\t0 - Salir.\n\n"
                    + "Ingrese opcion: ");
            opcion = leer.next();

            switch(opcion){

                case "1":
                    r = altaRectangulo(r);
                    break;

                case "2":
                    calcularSuperficie(r);
                    break;

                case "3":
                    calcularPerimetro(r);
                    break;

                case "4":
                    dibujarRectangulo(r);
                    break;

                case "0":
                    System.out.println("Saliendo ....");
                    break;
            }
        
        }while(!opcion.equals("0"));
    }
}
