
  package eva3_22_areas;

  
import java.util.Scanner;

public class EVA3_22_AREAS {

    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("--- MENÚ DE ÁREAS ---");
            System.out.println("1. Area del Circulo");
            System.out.println("2. Area del Triangulo");
            System.out.println("3. Area del Rectangulo");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            opcion = cap.nextInt();

            switch (opcion) {
                case 1:
                    double circulo = capturarDatos("DAME EL RADIO DEL CIRCULO: ");
                    System.out.println("EL AREA DEL CIRCULO ES: " + areaCirculo(circulo));
                    break;
                case 2:
                    double triangulob = capturarDatos("DAME LA BASE DEL TRIANGULO: ");
                    double trianguloa = capturarDatos("DAME LA ALTURA DEL TRIANGULO: ");
                    System.out.println("EL AREA DEL TRIANGULO ES: " + areaTriangulo(triangulob, trianguloa));
                    break;
                case 3:
                    double rectangulob = capturarDatos("DAME LA BASE DEL RECTANGULO: ");
                    double rectanguloa = capturarDatos("DAME LA ALTURA DEL RECTANGULO: ");
                    System.out.println("EL AREA DEL RECTANGULO ES: " + areaRectangulo(rectangulob, rectanguloa));
                    break;
                 
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 3);
    }

    public static double areaCirculo(double circulo) {
        double resu = Math.pow(circulo, 2) * Math.PI;
        return resu;
    }

    public static double areaTriangulo(double base, double altura) {
        double resu = (base * altura) / 2;
        return resu;
    }

    public static double areaRectangulo(double base, double altura) {
        double resu = base * altura;
        return resu;
    }

    public static double capturarDatos(String mensaje) {
        Scanner cap = new Scanner(System.in);
        System.out.println(mensaje);
        double valor = cap.nextDouble();
        return valor;
    }
}
