/*
Instituto Tecnològico Superior Rumiñahui
 * Nombre : Bryan Gonzalez
 * Nivel : Cuarto sistemas nocturno 
 * Fecha : Martes 30 de julio del 2019
 ( ( ) s Modifique la figura 7.2, de manera que el tamaño del arreglo 
se especifique mediante el primer argumento de línea de comandos. 
Si no se suministra un argumento de línea de comandos, use 10 como
el valor predeterminado del arreglo.
 */
package Arreglos;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Arreglos {
    Scanner entrada = new Scanner(System.in);
    int numero =10;
    int array[];
    
    
     public void ingreso(){
         
         System.out.print("Diguite un numero : ");
         numero=entrada.nextInt();
     }
    public void imprimirC(){
        
        System.out.print("Indice"+"-"+"Valor\n");
    }
    
    public void  proceso(){
         array=new int[numero];
        for (int i = 0; i <array.length; i++) {
            System.out.println(""+i+"\t"+array[i]);
        }
    }
}
