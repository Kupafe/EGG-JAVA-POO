package Servicio;

import Entidades.Vendedor;
import java.util.Date;
import java.util.Scanner;

public class VendedorServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Vendedor altaVendedor(){
        
        // Instanciar un Objeto de Tipo Vendedor
        Vendedor v1 = new Vendedor();
        
        //Lleno los atributos

        System.out.print("Ingrese el nombre del vendedor: ");
        v1.setNombre(leer.next());
        
        System.out.print("Ingrese el DNI de "+ v1.getNombre() +": ");
        v1.setDni(leer.nextInt());
        
        System.out.print("Ingrese el Sueldo Basico de "+ v1.getNombre() +": ");
        v1.setSueldoBasico(leer.nextDouble());
        
        
        System.out.print("Ingrese el dia en que comenzo a trabajar "+ v1.getNombre() +": ");
        int dia = leer.nextInt();
        
        System.out.print("Ingrese el mes en que comenzo a trabajar "+ v1.getNombre() +": ");
        int mes = leer.nextInt();
        
        System.out.print("Ingrese el a�o en que comenzo a trabajar "+ v1.getNombre() +": ");
        int anio = leer.nextInt();
        
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        
        v1.setFechaInicio(fecha);
        
        return v1;
    }
    
    public void sueldoMensual(Vendedor v1){
        
        System.out.print("Ingrese cuales fueron las ventas totales del vendedor: ");
        Double ventas = leer.nextDouble();
        v1.setComisiones(ventas * 0.15); // 0.15 = 15%
        v1.setSueldoMensual(v1.getSueldoBasico() + v1.getComisiones());
        
        System.out.println("El Sueldo Mensual del Vendedor "
                + v1.getNombre() +" es de $"+ v1.getSueldoMensual());
    }
    
    public void vacaciones(Vendedor v1){
        
        Date hoy = new Date();
        
        int antiguedad = hoy.getYear() - v1.getFechaInicio().getYear();
        
        if (antiguedad < 5){
            
            System.out.println("A "+ v1.getNombre() +" le corresponden 14 dias de vacaciones.");
        
        }else if (antiguedad < 10){
            
            System.out.println("A "+ v1.getNombre() +" le corresponden 21 dias de vacaciones.");
            
        }else if (antiguedad < 20){
            
            System.out.println("A "+ v1.getNombre() +" le corresponden 28 dias de vacaciones.");
        
        }else if (antiguedad > 20){
            
            System.out.println("A "+ v1.getNombre() +" le corresponden 35 dias de vacaciones.");
            
        }else{
            
            System.out.println(v1.getNombre() +" tiene vacaciones proporcionales.");
        }
    }
    
}
