import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Punto_15 {
    public static void main(String[] args) {
        int h, m, s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese las horas: ");
        h = sc.nextInt();
        System.out.print("Ingrese los minutos: ");
        m = sc.nextInt();
        System.out.print("Ingrese los segundos: ");
        s = sc.nextInt();
        if (h <= 24 && h >= 1) {
            if (m <= 60 && m >= 0) {
                if (s <= 60 && s >= 0) {
                    System.out.println("La hora ingresada (" + h + ":" + m + ":" + s + ") es una hora válida");
                } else {
                    System.out.println("Los segundos ingresados no son válidos");
                }
            } else {
                System.out.println("Los minutos ingresados no son válidos");
            }
        } else {
            System.out.println("Las horas ingresadas no son válidas");
        }
    }
}
