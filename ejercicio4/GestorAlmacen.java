package relacion10.ejercicio4;
import relacion10.ejercicio2.Articulo;
import relacion10.ejercicio3.PruebaArticulo;
import java.util.*;

public class GestorAlmacen {
    
    private PruebaArticulo almacen;
    private Scanner entrada=new Scanner(System.in);

    public GestorAlmacen(int tamañoArray){
        almacen=new PruebaArticulo(tamañoArray);
    }

    public void entradaAutomatizada(){
        almacen.Almacena(new Articulo("1", "Tornillo"));
        almacen.Almacena(new Articulo("2", "Martillo"));
        almacen.Almacena(new Articulo("3", "Sierra"));
        almacen.Almacena(new Articulo("4", "Clavos"));
        System.out.println("Se añadieron articulos de prueba");
    }

    public void lista(){
        System.out.println(almacen.toString());
    }

    public void alta(){
        System.out.print("Código: ");
        String codigo = entrada.nextLine();
        System.out.print("Descripción: ");
        String descripcion = entrada.nextLine();
        Articulo nuevArticulo=new Articulo(codigo, descripcion);

        System.out.print("Precio de compra: ");
        nuevArticulo.setPrecioCompra(entrada.nextInt());
        System.out.print("Precio de venta: ");
        nuevArticulo.setPrecioVenta(entrada.nextInt());
        System.out.print("Stock inicial: ");
        nuevArticulo.setStock(entrada.nextInt());
        entrada.nextLine();
    
        if (almacen.Almacena(nuevArticulo)){
            System.out.println("Artículo añadido correctamente.");
        } else {
            System.out.println("No hay espacio en el almacén.");
        }
    }

    public void baja(){
        System.out.print("Código del artículo a eliminar: ");
        String codigo = entrada.nextLine();
        if (almacen.Eliminar(codigo)) {
            System.out.println("Artículo eliminado correctamente.");
        } else {
            System.out.println("Artículo no encontrado.");
        }
    }

    public void entradaMercancia() {
        System.out.print("Código del artículo: ");
        String codigo = entrada.nextLine();
        System.out.print("Cantidad a añadir: ");
        int cantidad = entrada.nextInt();

        Articulo articulo=almacen.buscar(codigo);
        if (articulo!=null) {
            articulo.setStock(articulo.getStock()+cantidad);
            System.out.println("Stock actualizado correctamente.");
        } else {
            System.out.println("Artículo no encontrado.");
        }
    }

    public void salidaMercancia() {
        System.out.print("Código del artículo");
        String codigo=entrada.nextLine();
        System.out.println("Cantidad a retirar: ");
        int cantidad=entrada.nextInt();
        entrada.nextLine();

        Articulo articulo=almacen.buscar(codigo);
        if (articulo!=null){
            if (cantidad > articulo.getStock()){
                System.out.println("No hay suficiente stock disponible.");
            } else {
                articulo.setStock(articulo.getStock()-cantidad);
                System.out.println("Stock actualizado correctamente.");
            }
        } else {
            System.out.println("Artículo no encontrado.");
        }
    }
}
