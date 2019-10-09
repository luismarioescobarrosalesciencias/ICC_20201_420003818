import java.util.ArrayList;
import java.util.Arrays;

/**@author Luis Mario Escobar Rosales 
 * Programa que resuelve problemas relacionados con arreglos 
 */
public class Control{

   /**Palindromo
    * @param palabra Elemento string a evaluar si es un palindromo 
    */
     public static boolean problema1(String palabra){
        String tecnico= palabra.replaceAll("\\s+", "").toLowerCase();
        int longitud= tecnico.length();
        if(longitud<2)return true; 
        return tecnico.charAt(0)==tecnico.charAt(longitud-1) && problema1(tecnico.substring(1, longitud-1));
    }
    
   /**Buscar si la suma de dos elementos del arreglo suman el parametro dado
    * @param arreglo donde se buscaran los elementos 
    * @param k valor cuya suma entre dos elementos del arreglo existe 
    */
    public static boolean problema2(int[] arreglo, int k){
       int m;//contador de for
       int b;// variable que guarda el valor de los indices del arreglo
       int a;  // contador que inicia en el extremo contrario ( al reves)
       for(m=0;m<arreglo.length;m++){
        b=arreglo[m];
        for (a=-1; a<arreglo.length;a++){
            if (a+b==k) return true;

             }

         }
        return false;
    }
    /**ordenamiento tipo burbuja;
     * 
     * @param arreglo regresa al arreglo ordenado de menor a mayor 
     */
    public static void problema3(int[] arreglo){
            for(int x=0;x<arreglo.length;x++){
                for(int i=1;i<(arreglo.length-x);i++){
                    if(arreglo[i-1] > arreglo[i]){
                        int evaluacion=arreglo[i-1];//
                        arreglo[i-1]=arreglo[i];
                        arreglo[i]=evaluacion;

                    }
                }
            }

       
        
    }
    /**Busqueda binaria  
     * @param arreglo arreglo donde se buscará el elemento
     * @param buscando elemento a encontrar 
     * @return
     */
    public static boolean problema4(int[] arreglo, int buscando){
        int c;//contador para for 
        for(c=0;c<arreglo.length; c++) {
            
            if(buscando==arreglo[c]) {
                return true;
            } 
               
    }      return false; //importante sacarlo el for 
      
    }
/** Evaluar si el numero dado es primo o no.
 * @param n evaluar si es primo o no.
 */
    public static boolean problema5(int n){
        if (n==1)  return true ;
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;

        }        
    

    
   /**Buscar el arreglo con todos los elementos primos menores al dado
    * 
    * @param n
    * @return todos los numeros Primos menores a n
    */
        public static int[] problema6(int n){
     ArrayList<Integer> listaprimos=new ArrayList<Integer>();
     
     if(n<=2)return new int[0];// 
     for(int i=2; i<n;i++){
         if(problema5(i)==true){ 
             listaprimos.add(i);
            }
         else{continue;}

     }
       int [] primos=new int[listaprimos.size()];
       for(int x=0;x<listaprimos.size();x++){
           int y= listaprimos.get(x);
           primos[x]=y;
       }
        return primos;
    }


    public static void main(String[] args) {
        String resultado = "";
        int[] desordenado = {9,8,7,6,5,4,3,2,1};// problema 4
        int[] ordenado    = {1,2,3,4,5,6,7,8,9};
        int[] primos10 = {2,3,5,7};
        if(problema1("oso")==true && problema1("palabra")==false)resultado+="P1 bien\n";else resultado+="P1 mal\n";
        if(problema2(desordenado, 17)==true) resultado+="P2 bien\n";else resultado+="P2 mal\n";
        problema3(desordenado);
        if(Arrays.equals(desordenado,ordenado) == true)resultado+="P3 bien\n";else resultado+="P3 mal\n";
        if(problema4(desordenado,2)== true && problema4(desordenado,18)== false)resultado+="P4 bien\n";else resultado+="P4 mal\n";
        if(problema5(7)==true && problema5(6)==false)resultado+="P5 bien\n";else resultado+="P5 mal\n";
        if(Arrays.equals(problema6(10), primos10) == true)resultado+="P6 bien\n";else resultado+="P6 mal\n";
        System.out.println(resultado);   
        System.out.println("Ejemplo del uso del metodo problema6 imprimiendo la lista con n=100"+Arrays.toString(problema6(100)));
    }

}