
package eva3_21_temperaturas;

import java.util.Scanner;


public class EVA3_21_TEMPERATURAS {

  
   public static void main(String[] args) {
     Scanner cap = new Scanner(System.in);
      
   
      double centi = capturarTemp("CAPTURA LOS GRADOS CENTIGRADOS: ");
      System.out.println(centi + "C° = " + convertirCaF(centi) + " F°" );
      
      
      double far = capturarTemp("CAPTURA LOS GRADOS FAHRENHEIT: ");
      System.out.println(far + "C° = " + convertirFaC(far) + " C°" );
      
      
     double kelvin = capturarTemp("CAPTURA LOS GRADOS CENTIGRADOS: ");
      System.out.println(kelvin + "C° = " + convertirCaK(kelvin) + " K°" );
         
   }
   
   public static double convertirCaF(double centi){
   double resu = centi * 1.8 + 32;
   return resu;
   }
   public static double convertirFaC(double far){
   double resu = (far -32 ) / 1.8;
   return resu;
   }
   public static double convertirCaK(double kelvin){
   double resu = kelvin + 273.15;
   return resu;
   }
   public static double capturarTemp(String mensaje){
   Scanner cap = new Scanner(System.in);
      System.out.println(mensaje);
   double valor = cap.nextDouble();
   return valor;
   }
}
