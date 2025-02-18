package relacion10.ejercicio3;

import java.util.Scanner;

import relacion10.ejercicio2.Articulo;

public class prueba {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Articulo art1 = new Articulo("B001", "Disco de Hockey");
        Articulo art2 = new Articulo("B002", "Zapatillas Senderismo");

        int tamaño = 2;

        PruebaArticulo prueba = new PruebaArticulo(tamaño);

        prueba.Almacena(art1);
        prueba.Almacena(art2);

        System.out.println(prueba);

        entrada.close();
    }
}
