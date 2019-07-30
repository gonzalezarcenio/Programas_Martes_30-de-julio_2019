
package Arreglos;

import javax.swing.JOptionPane;

/**
 * Instituto Tecnològico Superior Rumiñahui
 * Nombre : Bryan Gonzalez
 * Nivel : Cuarto sistemas nocturno 
 * Fecha : Martes 30 de julio del 2019
( ( for mejorada r )
* a Escriba una aplicación que utilice una instrucción 
* for mejorada para sumar los valores double que se pasan mediante los 
* argumentos de línea de comandos. [Sugerencia: use el método static parseDoublede 
* la clase Double para convertir un String en un valor double]. 
 */
public class Arreglos {
   private double n;
   private double suma=0;
   private double array[]=new double[10];
   
   public void ingreso(){
       
       for (int i = 0; i <array.length; i++) {
           array[i]=Double.parseDouble(JOptionPane.showInputDialog("Diguite un numero "));
       }
       for (double i :array) {
           System.out.println("numero :"+i);
       }
   }
   
   public void proceso(){
       for (int i = 0; i <array.length; i++) {
           
           suma=suma+array[i];
       }
       
   }
   
   public void imprimir(){
       System.out.println("suma :"+suma);
   }
}
