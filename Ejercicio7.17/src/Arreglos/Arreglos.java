/*
 Instituto Tecnològico Superior Rumiñahui
 * Nombre : Bryan Gonzalez
 * Nivel : Cuarto sistemas nocturno 
  Escriba una aplicación para simular el tiro de dos dados. La aplicación debe 
  * utilizar un objeto de la clase Random una vez para tirar el primer dado, y de nuevo para 
  * tirar el segundo. Después debe calcularse la suma de los dos valores. Cada dado puede mostrar
  * 
  * un valor entero del 1 al 6, por lo que la suma de los valores variará del 2 al 12, siendo 7 
  * la suma más frecuente, mientras que 2 y 12 serán las sumas menos frecuentes. En la figura 
  * 7.28 se muestran las 36 posibles combinaciones de los dos dados. Su aplicación debe tirar los dados
  * 
  * 36,000,000 de veces. Escriba una aplicación para simular el tiro de dos dados. La aplicación debe 
  * utilizar un objeto de la clase Random una vez para tirar el primer dado, y de nuevo para tirar el segundo. 
  * Después debe calcularse la suma de los dos valores. Cada dado puede mostrar un valor entero del 1 al 6, por lo 
  * que la suma de los valores variará del 2 al 12, siendo 7 la suma más frecuente, mientras que 2 y 12 serán las 
  * sumas menos frecuentes. En la figura 7.28 se muestran las 36 posibles combinaciones de los dos dados. Su aplicación 
  * debe tirar los dados 36,000,000 de veces. Escriba una aplicación para simular el tiro de dos dados. La aplicación debe
  * utilizar un objeto de la clase Random una vez para tirar el primer dado, y de nuevo para tirar el segundo. 
  * Después debe calcularse la suma de los dos valores. Cada dado puede mostrar un valor entero del 1 al 6, 
  * por lo que la suma de los valores variará del 2 al 12, siendo 7 la suma más frecuente, mientras que 2 y 
  * 12 serán las sumas menos frecuentes. En la figura 7.28 se muestran las 36 posibles
  * combinaciones de los dos dados. Su aplicación debe tirar los dados 36,000,000 de veces.
 */
package Arreglos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Arreglos {
    
 Random numerosAleatorio = new Random();
 private int numero;
 int array[];
    int n1,n2;
    
    public void ingresoDatos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("lanzar el dado : ");
        numero=entrada.nextInt();
        int[] array = new int[numero];  
    }
    
 public void lanzarDados(){
       array= new int[numero];
  
     
     for (int i = 0; i <array.length; i++) {
         n1 = 1 + numerosAleatorio.nextInt(6); 
         n2 = 1 + numerosAleatorio.nextInt(6);
         array[i] = n1 + n2; 
     }
 }
    
 public void contarT(){
     int contador[] = new int[13];
     
     for ( int j = 0; j < array.length; j++ ){  
        for ( int k = 0; k <contador.length; k++ ){      
            if ( array[j] == k )
    contador[k]++;
            }  
        } 
    }
 
 public void imprimir(){
     for (int i = 0; i < array.length; i++ ){ 
 System.out.println("\n sumaron \n"+array[i]+ i ); 
 }   
     
     
 }
}
