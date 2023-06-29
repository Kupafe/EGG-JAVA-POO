/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package Principal;

public class Principal {

    public static void main(String[] args) {

        /*
        Realizar un programa en Java donde se creen dos arreglos: el primero
        será un arreglo A de 50 números reales, y el segundo B, un arreglo de
        20 números, también reales.
        */
        Double[] arregloA = new Double[50];
        Double[] arregloB = new Double[20];
        
        System.out.println("\nARREGLO A.\n");
        /*
        El programa deberá inicializar el arreglo A con números aleatorios y
        mostrarlo por pantalla.
        */
        for (int i = 0; i < 50; i++) {
            
            arregloA[i] = Math.random() * 10;
            System.out.println(" Posicion: "+ (i + 1) +" ( "+ arregloA[i] +" ) ");
        }
        
        // Luego, el arreglo A se debe ordenar de menor a mayor

        // ORDENAR DE MENOR A MAYOR
        
        Double temporal = 0.0;
        
        for (int i = 0; i < arregloA.length; i++) {
            
            for (int j = 1; j < (arregloA.length - i); j++) {
                
                if (arregloA[j - 1] > arregloA[j]) {
                    
                    temporal = arregloA[j - 1];
                    arregloA[j - 1] = arregloA[j];
                    arregloA[j] = temporal;
                }
            }
        }
        
        System.out.println("\nARREGLO ORDENADO DE MENOR A MAYOR.\n");
    
        for (int i = 0; i < 50; i++) {
            
            System.out.println(" Posicion: "+ (i + 1) +" ( "+ arregloA[i] +" ) ");
        }
        
        /*
        Y copiar los primeros 10 números ordenados al arreglo B de 20
        elementos
        */
        for (int i = 0; i < 10; i++) {
            
            arregloB[i] = arregloA[i];
        }
        
        // y rellenar los 10 últimos elementos con el valor 0.5.
        for (int i = 10; i < 20; i++) {
            
            arregloB[i] = 0.5;
        }
        
         /*
        Mostrar los dos arreglos resultantes: el ordenado de 50 elementos
        y el combinado de 20.
        */
        
        System.out.println("\nArreglo A.\n");
        for (int i = 0; i < 50; i++) {
            
            System.out.println(" Posicion: "+ (i + 1) +" ( "+ arregloA[i] +" ) ");
        }
        
        System.out.println("\nArreglo B.\n");
        for (int i = 0; i < 20; i++) {
            
            System.out.println(" Posicion: "+ (i + 1) +" ( "+ arregloB[i] +" ) ");
        }
        
        System.out.println("\nFIN DE LA EJECUCION DEL PROGRAMA.\n");
    }

    /*
    
    int a[] = {5,3,2,7,10,1};

    System.out.println("ARREGLO DESORDENADO.");

    for (int i = 0; i < 6; i++) {
            
        System.out.print(" ( "+ a[i] +" ) ");
    }

    // ORDENAR DE MAYOR A MENOR
    
    for (int x = 0; x < a.length; x++) {
    
        for (int i = 0; i < a.length-x-1; i++) {
        
            if(a[i] < a[i+1]){
            
                int tmp = a[i+1];
                a[i+1] = a[i];
                a[i] = tmp;
            }
        }
    } 
    
    System.out.println("");
    
    System.out.println("ARREGLO ORDENADO DE MAYOR A MENOR.");

    for (int i = 0; i < 6; i++) {
            
        System.out.print(" ( "+ a[i] +" ) ");
    }
        
    // ORDENAR DE MENOR A MAYOR
    
    int temporal = 0;

    for (int i = 0; i < a.length; i++) {
    
        for (int j = 1; j < (a.length - i); j++) {
        
            if (a[j - 1] > a[j]) {
            
                temporal = a[j - 1];
                a[j - 1] = a[j];
                a[j] = temporal;
            }
        }
    }

    System.out.println("");
    
    System.out.println("ARREGLO ORDENADO DE MENOR A MAYOR.");
    
    for (int i = 0; i < 6; i++) {
            
        System.out.print(" ( "+ a[i] +" ) ");
    }

    */
}