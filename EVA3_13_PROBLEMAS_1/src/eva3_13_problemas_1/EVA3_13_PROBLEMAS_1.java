
package eva3_13_problemas_1;

import java.util.Scanner;


public class EVA3_13_PROBLEMAS_1 {

    
    public static void main(String[] args) {
      
        Scanner cap = new Scanner(System.in);
        int[] valores = new int [10];
        int valor;
        int contador = 0;
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int)(Math.random() * 9);
            
        }
        for (int i = 0; i < valores.length; i++) {
            System.out.print("[ " + valores[i] + " ] ");
            
    }
    
        
    
     
        System.out.println("INTRODUCE UN VALOR ");
        valor = cap.nextInt();
        cap.nextLine();
     
  
        for (int i = 0; i < valores.length ; i++) {
            if(valor == valores[i]){
               
                contador++;
            
            }
            }
            System.out.println("EL VALOR DE " + valor + " SE REPITE " + contador + " VECES" );
            }
    }

        
       
        
    
            
    
 