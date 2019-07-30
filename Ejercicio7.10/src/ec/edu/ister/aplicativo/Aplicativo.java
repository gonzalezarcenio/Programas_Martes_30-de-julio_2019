/*
 Instituto Tecnològico Superior Rumiñahui
 * Nombre : Bryan Gonzalez
 * Nivel : Cuarto sistemas nocturno 
 * Fecha : Martes 30 de julio del 2019
(Comisión por ventas) Utilice un arreglo unidimensional para resolver el siguiente problema: una compañía
paga a sus vendedores por comisión. Los vendedores reciben $200 por semana más el 9% de sus ventas totales de esa
semana. Por ejemplo, un vendedor que acumule $5,000 en ventas en una semana, recibirá $200 más el 9% de $5,000,
o un total de $650. Escriba una aplicación (utilizando un arreglo de contadores) que determine cuántos vendedores
recibieron salarios en cada uno de los siguientes rangos (suponga que el salario de cada vendedor se trunca a una 
* cantidad entera):
 */
package ec.edu.ister.aplicativo;

import ec.edu.ister.arreglos.Arreglos;
import java.util.Scanner;


public class Aplicativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int arregloC[] = new int[100];
        int tVentas[]= new int[100];
        int numero;
        
    
  
    
        System.out.println("Diguite  un numero de n sueldo empleados :");
        numero=entrada.nextInt();
        
        for (int i = 0; i <numero; i++) {
            System.out.println("Introduzca ventas del empleado : ");
            tVentas[i]= entrada.nextInt();
        }
        
        Arreglos obj1 = new Arreglos();
        
        obj1.calculoSueldo(numero, tVentas);
        obj1.imprimirValor(numero, tVentas);
        obj1.calculo(numero);
        obj1.calculoContadores(numero, tVentas);
        obj1.imprimirD(numero);
    }
    
}
