import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Punto_7 {
    public static void main(String[] args) {
        int cantPersonas;
        double promAltura = 0;
        int alturaMayorMedia = 0, alturaMenorMedia = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de personas: ");
        do{
            cantPersonas = sc.nextInt();
            if (cantPersonas <= 0){System.out.print("La cantidad de personas debe ser un número entero positivo, intente de nuevo: ");}
        }while (cantPersonas <= 0);
        double[] alturas = new double[cantPersonas];
        System.out.println("Ingrese las alturas: ");
        for (int i = 0; i <= cantPersonas-1; i += 1) {
            System.out.print((i + 1) + "- ");
            alturas[i] = sc.nextDouble();
            promAltura += alturas[i];
        }
        promAltura = promAltura / cantPersonas;
        System.out.println("Altura promedio: "+promAltura);
        for (int i = 0; i <= cantPersonas-1; i += 1) {
            if (alturas[i] > promAltura) {alturaMayorMedia += 1;}
            if (alturas[i] < promAltura) {alturaMenorMedia += 1;}
        }
        System.out.println("Cantidad de alturas ingresadas mayor a la media: "+alturaMayorMedia);
        System.out.println("Cantidad de alturas ingresadas menor a la media: "+alturaMenorMedia);
    }
}
