
package Arreglos;

import java.util.Scanner;

/**
 * Instituto Tecnològico Superior Rumiñahui
 * Nombre : Bryan Gonzalez
 * Nivel : Cuarto sistemas nocturno 
 * Fecha : Martes 30 de julio del 2019
 (Lista de argumentos de longitud variable ( ( ) e Escriba una aplicación que calcule el 
 * producto de una serie de enteros que se pasan al método producto; use una lista de argumentos de 
 * longitud variable. 
 * Pruebe su método con varias llamadas, cada una con un número distinto de argumentos. 
 */
public class Aplicativo {
    public static void main(String[] args) {
        int longitud=10;
        int array[]= new int[longitud];
        int mul;
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i <longitud; i++) {
            System.out.println("Diguite un numero :");
            array[i]=entrada.nextInt();
        }
        Arreglos obj1 = new Arreglos();
         mul=obj1.mulpriplicarArray(array);
         obj1.imprimir(mul);
         
    }
    
}
