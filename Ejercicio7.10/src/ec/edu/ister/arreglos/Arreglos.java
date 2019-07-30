
package ec.edu.ister.arreglos;

/**
 * Instituto Tecnològico Superior Rumiñahui
 * Nombre : Bryan Gonzalez
 * Nivel : Cuarto sistemas nocturno 
 * Fecha : Martes 30 de julio del 2019
(Comisión por ventas) Utilice un arreglo unidimensional para resolver el siguiente problema: una compañía
paga a sus vendedores por comisión. Los vendedores reciben $200 por semana más el 9% de sus ventas totales de esa
semana. Por ejemplo, un vendedor que acumule $5,000 en ventas en una semana, recibirá $200 más el 9% de $5,000,
o un total de $650. Escriba una aplicación (utilizando un arreglo de contadores) que determine cuántos vendedores
recibieron salarios en cada uno de los siguientes rangos (suponga que el salario de cada vendedor se trunca a una 
* cantidad entera):
a) $200-299
b) $300-399
c) $400-499 /// formula 5000*0.09+200;
d) $500-599       ///5000*9/100;
e) $600-699
f) $700-799
g) $800-899
h) $900-999
i) $1,000 en adelante
 */
public class Arreglos {
     int numero;
    int arregloC[] = new int[100];
    int tVentas[]= new int[100];
  
    
    
    public void calculoSueldo(int numero,int tVentas[]){
        int total[]= new int[100+1];
        
        for (int i = 0; i <numero; i++) {
            
             total[i] = tVentas[i]*9/100+200;
         
             System.out.println("el salario es  :"+total[i]);
               
        }
    }
    
    public void imprimirValor(int numero,int tVentas[]){
        for (int i = 0; i <numero; i++) {
           System.out.println(""+tVentas[i]);
           
        }
        
    }
    
    public void calculo(int numero){
        int res=0;
        for (int i = 2; i <numero; i++) {
            
            res=((i+1)*100)-1;
            int res1=0;
            res1=res;
            System.out.println();
            System.out.println(""+res1);
        }
        
        
    }
    
    public void calculoContadores(int numero,int total[]){
        
       
        for (int i = 0; i <numero; i++) {
         arregloC[i] = 0;   
          if(total[i]<numero) 
              arregloC[total[i]]++;
          else
              arregloC[numero]++;   
        }
    }
    
    public void imprimirD(int numero){
       
        for (int i =1; i <numero; i++) {
            
           
        }
        
        System.out.printf("Hay %d empleados que cobran 100 o mas.\n\n", arregloC[numero]);
    }
}
