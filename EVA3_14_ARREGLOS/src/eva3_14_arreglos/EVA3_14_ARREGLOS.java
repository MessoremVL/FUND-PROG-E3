
package eva3_14_arreglos;


public class EVA3_14_ARREGLOS {

    public static void main(String[] args) {

        
        int[] valores = new int[10];

        
        
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int)(Math.random() * 100);
            System.out.print(valores[i] + " "); 
        }
        System.out.println("");

        
        int masPequeño = valores[0];
        int masGrande = valores[0];

       
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > masGrande) {
                masGrande = valores[i]; 
            } else if (valores[i] < masPequeño) {
                masPequeño = valores[i]; 
            }
        }

        
        System.out.println("EL MAS PEQUEÑO ES " + masPequeño);
        System.out.println("EL MAS GRANDE ES " + masGrande);
    }
}
