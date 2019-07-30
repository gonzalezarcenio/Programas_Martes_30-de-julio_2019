/*
Instituto Tecnològico Superior Rumiñahui
 * Nombre : Bryan Gonzalez
 * Nivel : Cuarto sistemas nocturno 
 * Fecha : Martes 30 de julio del 2019
  Etiquete los elementos del arreglo bidimensional ventas de tres por cinco, 
para indicar el orden en el que se establecen en cero, mediante el siguiente 
fragmento de programa: for (int fila = 0; fila < ventas.length; fila++) { 
for (int col = 0; col < ventas[fila].length; col++)   {      
ventas[fila][col] = 0;   } } 
 */


public class Matriz {
     int ventas[][]=new int[3][5];
     
     public void proceso(){
         
         for (int fila = 0; fila < ventas.length; fila++) { 
            for (int col = 0; col < ventas[fila].length; col++){  
                ventas[fila][col] = 0;  
                System.out.print("\t"+ventas[fila][col]);
            } 
            System.out.println("");
        }
         
         
     }
}
