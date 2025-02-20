package relacion10.ejercicio4;
import java.util.*;
import relacion10.ejercicio2.Articulo;
import relacion10.ejercicio3.PruebaArticulo;

public class gestSimAlm {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        GestorAlmacen gestor = new GestorAlmacen(10);
        int opcion;

        do{
            System.out.println("Menú de gestión del almacén:");
            System.out.println("0. Entrada automatizada");
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Entrada de mercancía");
            System.out.println("5. Salida de mercancía");
            System.out.println("6. Salir");
            System.out.println("Seleccione una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 0:
                    gestor.entradaAutomatizada();
                    break;
                case 1:
                    gestor.lista();
                    break;
                case 2:
                    gestor.alta();
                    break;
                case 3:
                    gestor.baja();
                    break;
                case 4:
                    gestor.entradaMercancia();
                    break;
                case 5:
                    gestor.salidaMercancia();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");;
            }
        } while (opcion != 6);
        entrada.close();
    }
}
