
package eva3_12_arreglos_multi_int;


public class EVA3_12_ARREGLOS_MULTI_INT {

   
    public static void main(String[] args) {
       
        String dias[] = {"DOMINGO", "LUNES","MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO"};
        int califas[][] ={{50,100,75,30},{80,66,22,10}};
        for (int i = 0; i < dias.length; i++) {
            System.out.print("[" + dias[i] + "]");
        }
        System.out.println("");
        
        for (int i = 0; i < califas.length; i++) {
            for (int j = 0; j < califas[i].length; j++) {
                System.out.print("[" + califas[i][j]+ "]");
            }
            System.out.println("");
        }
       
    
    
    }
    
    
    
}
