/*
Instituto Tecnològico Superior Rumiñahui
 * Nombre : Bryan Gonzalez
 * Nivel : Cuarto sistemas nocturno 
 * Fecha : Martes 30 de julio del 2019
 Escriba instrucciones en Java que realicen cada una de las siguientes tareas:
 * a) Mostrar el valor del elemento 6 del arreglof. 
 * b) Inicializar con 8cada uno de los cinco elementos del arreglo entero unidimensional g.
 * c) 
 * Sumar el total de los 100 elementos del arreglo c de punto flotante. 
 * d) Copiar el arreglo a de 11 elementos en la primera porción del arreglo b, el cual contiene 34 elementos.
 * e) 
 * Determinar e imprimir los valores menor y mayor contenidos en el arreglo w con 99 elementos de punto flotante.
 */
package Arreglos;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Aplicativo {
    public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);
     Scanner lee = new Scanner(System.in);
     
      float n;  
    int arrayf[]= new int[6];
    int arrayg[]= new int[5];
    int arregloa[]=new int[11];
    int arreglob[]=new int[34];
    float arregloC[]=new float[100];
    float arregloW[]=new float[99]; 
   int numero;
   
 
        for (int i = 0; i <6; i++) {
            System.out.println("Diguite un numero : ");
            arrayf[i]=entrada.nextInt();
        }
        
         Arreglos obj1 = new Arreglos();
        obj1.mostrarValor(arrayf);
        
        for (int i = 0; i <5; i++) {
            System.out.println("Diguite un numero : ");
            arrayg[i]=entrada.nextInt();
        }
        obj1.inicializar(arrayg);
        
        
            
        System.out.println("diguite dimension : ");
        n=lee.nextFloat();
        
            System.out.println("diguite un numero : ");
            n= lee.nextFloat();
        for (int i = 0; i <n; i++) {
            System.out.println("Diguite un numero : "); 
             arregloC[i]=lee.nextFloat();
        }
        obj1.sumaElementos(n, arregloC);
          
    }
    
}
