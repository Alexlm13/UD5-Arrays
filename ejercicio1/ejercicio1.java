package relacion10.ejercicio1;
import java.util.*;
import relacion9.ejercicio4.*;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Autobus[] autobuses = new Autobus[4];

        for (int i = 0; i < autobuses.length; i++) {
            autobuses[i] = new Autobus();
            System.out.println("Introduce los datos del autobus "+(i+1)+":");
            System.out.println("Matrícula: ");
            autobuses[i].matricula=entrada.nextLine();
            System.out.println("Modelo: ");
            autobuses[i].modelo=entrada.nextLine();
            System.out.println("Caballos(CV): ");
            autobuses[i].potenciaCV=entrada.nextInt();
            System.out.println("Plazas: ");
            autobuses[i].numeroPlazas=entrada.nextInt();
            System.out.println(" ");
            entrada.nextLine();
        }

        System.out.println("Los datos de los buses son:");
        for(Autobus autobus:autobuses){
            System.out.println("Matrícula: "+autobus.obtenerMatricula()+", Modelo: " + autobus.obtenerModelo() + ", Potencia: " + autobus.obtenerPotenciaCV() + " CV, Plazas: " + autobus.obtenerPlazas());
        }
        entrada.close();
    }    
}
    
