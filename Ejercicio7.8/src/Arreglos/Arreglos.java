
package Arreglos;

/**
 * Instituto Tecnològico Superior Rumiñahui
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
public class Arreglos {
    private int arrayf[]= new int[6];
    private  int arrayg[]= new int[5];
    private int arregloa[]=new int[11];
    private int arreglob[]=new int[34];
    private float arregloC[]=new float[100];
       
      private float arregloW[]=new float[99]; 
      private float n;
    public void  mostrarValor(int arrayf[]){
        int valor;
        valor=arrayf[5];      
        System.out.println("el valor del elemento 6 es :"+valor);
        
    }
    
    public void inicializar(int arrayg[]){
        for (int i = 0; i <5; i++) {
            arrayg[i]=8;
            System.out.println("inicializado : "+arrayg[i]);
        }
    }
    
    public void sumaElementos(float n,float arregloC[]){
        
        float suma=0;
        for (int i = 0; i <n; i++) {
            suma=suma+arregloC[i];
            System.out.println("la suma de flotantes es  es :"+suma);
        }
        
    }
    //Determinar e imprimir los valores menor y mayor contenidos en el arreglo w con 99 elementos de punto flotante.
    public void imprimirValores(float arregloW[]){
        for (int i = 0; i <5; i++) {
            System.out.println(""+arregloW[i]);
        }
         for (int i = 5; i <0; i++) {
            System.out.println(""+arregloW[i]);
        }
        
    }
     
}
