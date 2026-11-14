
package eva3_15_arreglos;


public class EVA3_15_ARREGLOS {

  
   public static void main(String[] args) {
     
      int matriz[][] = new int [5][5];
      for (int i = 0; i < matriz.length; i++) {
         for (int j = 0; j < matriz[i].length; j++) {
            matriz[i][j] = (int) (Math.random() * 100);
            
         }
      }
      for (int i = 0; i < matriz.length; i++) {
         for (int j = 0; j < matriz[i].length; j++) {
            System.out.print("[ "+ matriz[i][j] + " ]");
         }
   
     System.out.println(""); }
   
         System.out.println("");
         for (int i = 4; i >= 0 ; i--) {
            for (int j = 4; j >= 0; j--) {
               System.out.print("[ " + matriz[i][j] + " ]");
            }
      System.out.println("");
         } 
   }
   
}
