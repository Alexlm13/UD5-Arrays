package relacion10.ejercicio2;

public class prueba1 {
    public static void main(String[] args) {
        Articulo [] articulo=new Articulo[] {
            new Articulo("C01","Camiseta"),
            new Articulo("C02", "Pantalón"),
            new Articulo("C03","Zapatillas")
        };

        for (Articulo articulo2 : articulo) {
            System.out.println(articulo2);
        }
    }
}
