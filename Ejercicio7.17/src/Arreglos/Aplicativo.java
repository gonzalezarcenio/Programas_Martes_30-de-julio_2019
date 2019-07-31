/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

import java.util.Random;
import java.util.Scanner;

/**
 * Instituto Tecnològico Superior Rumiñahui
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
public class Aplicativo {
    public static void main(String[] args) {
        Arreglos obj1  = new Arreglos();
        Random numerosAleatorio = new Random();
      
        obj1.ingresoDatos();
        obj1.lanzarDados();
        obj1.contarT();
        obj1.imprimir();
        
        
        
    }
    
}
