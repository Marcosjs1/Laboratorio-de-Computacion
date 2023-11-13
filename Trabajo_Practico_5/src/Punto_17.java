import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Punto_17 {
    public static void main(String[] args) {
        float nota;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la nota: ");
        nota = sc.nextFloat();
        if (nota >= 0 && nota <= 10){
            if (nota >= 0 && nota < 5){
                System.out.println("Nota: insuficiente");
            }
            if (nota >= 5 && nota < 6){
                System.out.println("Nota: suficiente");
            }
            if (nota >= 6 && nota < 7){
                System.out.println("Nota: Bien");
            }
            if (nota >= 7 && nota < 9){
                System.out.println("Nota: notable");
            }
            if (nota >= 9 && nota < 10){
                System.out.println("Nota: sobresaliente");
            }
        }
        else {
            System.out.println("La nota ingresada no es válida");
        }
    }
}
