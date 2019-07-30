
package Arreglos;

/**
 * Instituto Tecnològico Superior Rumiñahui
 * Nombre : Bryan Gonzalez
 * Nivel : Cuarto sistemas nocturno 
 * Fecha : Martes 30 de julio del 2019
Lista de argumentos de longitud variable ( ( ) e Escriba una aplicación que calcule el 
 * producto de una serie de enteros que se pasan al método producto; use una lista de argumentos de 
 * longitud variable. 
 * Pruebe su método con varias llamadas, cada una con un número distinto de argumentos. 
 */
public class Arreglos {
    int longitud=10;
    int array[]= new int[longitud];
    
    public int mulpriplicarArray(int array[]){
        int mul=1;
        
        for (int i = 0; i <array.length; i++) {
            mul=mul*array[i];
        }
        return mul;
    }
     
    public void imprimir(int mul){
        
        System.out.println("muitiplicavion :"+mul);
    }
    
}
