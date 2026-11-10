
package eva3_11_arreglos_multi_2;


public class EVA3_11_ARREGLOS_MULTI_2 {

    public static void main(String[] args) {
     
        int cubo[][][] = new int [2][3][4];//24 enteros
        
        for (int i = 0; i < cubo.length; i++) {//1era dimensión
            for (int j = 0; j < cubo[i].length; j++) {//2da dimensión
                for (int k = 0; k < cubo[i][j].length; k++) {//3ra dimenasión
                    cubo[i][j][k] = (int)(Math.random() * 100);
                    
                }
            }
        }
        //como mostramos los valores?
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    System.out.print("["+ cubo[i][j][k]+ "]");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
    
}
