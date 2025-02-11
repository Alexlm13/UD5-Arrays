package relacion10.ejercicio2;

public class prueba2 {
    public static void main(String[] args) {
        Articulo [] articulo= new Articulo[3];
        articulo[0]= new Articulo("C01","Camiseta");
        articulo[1]= new Articulo("C02", "Pantalón");
        articulo[2]= new Articulo("C03", "Zapatillas");

        for (Articulo articulo2 : articulo) {
            System.out.println(articulo2);
        }
    }
}
