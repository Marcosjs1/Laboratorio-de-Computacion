import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Punto_29 {
    public static void main(String[] args) {
        int m;
        String km;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Ingrese una distancia en millas (ingrese un 0 para terminar): ");
            m = sc.nextInt();
            if(m == 0){break;}
            km = String.format("%.2f", m * 1.6093);
            System.out.println("La distancia ingresada equivale a "+km+" kilómetros");
        }
        while (m != 0);
    }
}
