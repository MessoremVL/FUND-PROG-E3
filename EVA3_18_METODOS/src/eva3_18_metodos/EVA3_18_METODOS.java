
package eva3_18_metodos;


public class EVA3_18_METODOS {

  
   public static void main(String[] args) {
      
      //LLAMAR O INVOCAR EL METODO
      mostrarMensaje("HOLA MUNDO!!");
      mostrarMensaje("Marco Ibarvo");
      mostrarMensaje("Fundamentos de programación");
      mostrarMensaje("Sistemas Computacionales");
      
      //QUE HACER CON METODOS QUE REGRESAN VALORES
      //1. RECUPERAR EL VALORA PARA USARLO DESPUES
      int resultado = sumar(10,20);
      System.out.println("suma de 10 + 20 = " + resultado);
      //2. USARLO DIRECTAMENTE
      System.out.println("suma de 10 + 20 = " + sumar(10,20));
      //3. NO IMPORTA EL VALOR DE RETORNO
      sumar(10,20);
   }
   //modificadores(public y static), valor de retorno(void, int, string, double)
                                                //debe ser un verbo infinitivo
//                                              //varias palabras: iniciar en minusculas, demas iniciar en mayusculas
   public static void mostrarMensaje(String mensaje)//cabecera
   {//cuerpo del metodo o implementacion
      System.out.println(mensaje);
   
   }
   public static int sumar(int val1, int val2){
      int resu = val1+ val2;
      return resu;
   }
   
}
