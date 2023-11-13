import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Punto_16 {
    public static void main(String[] args) {
        int mes, dmes;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número correspondiente a un mes (del 1 al 12): ");
        mes = sc.nextInt();

        if (mes >= 1 && mes <= 12){
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                dmes = 31;
            }
            else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                dmes = 30;
            }
            else {
                dmes = 28;
            }
            switch (mes){
                case 1:
                    System.out.println("El mes '"+mes+"' es Enero con "+dmes+" días");
                    break;
                case 2:
                    System.out.println("El mes '"+mes+"' es Febrero con "+dmes+" días");
                    break;
                case 3:
                    System.out.println("El mes '"+mes+"' es Marzo con "+dmes+" días");
                    break;
                case 4:
                    System.out.println("El mes '"+mes+"' es Abril con "+dmes+" días");
                    break;
                case 5:
                    System.out.println("El mes '"+mes+"' es Mayo con "+dmes+" días");
                    break;
                case 6:
                    System.out.println("El mes '"+mes+"' es Junio con "+dmes+" días");
                    break;
                case 7:
                    System.out.println("El mes '"+mes+"' es Julio con "+dmes+" días");
                    break;
                case 8:
                    System.out.println("El mes '"+mes+"' es Agosto con "+dmes+" días");
                    break;
                case 9:
                    System.out.println("El mes '"+mes+"' es Septiembre con "+dmes+" días");
                    break;
                case 10:
                    System.out.println("El mes '"+mes+"' es Octubre con "+dmes+" días");
                    break;
                case 11:
                    System.out.println("El mes '"+mes+"' es Noviembre con "+dmes+" días");
                    break;
                case 12:
                    System.out.println("El mes '"+mes+"' es Diciembre con "+dmes+" días");
                    break;
            }
        }
        else {
            System.out.println("El mes ingresado no es válido");
        }
    }
}
