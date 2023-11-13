import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Punto_12 {
    public static void main(String[] args) {
        float num1, num2,resultado;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el dividendo: ");
        num1 = sc.nextFloat();
        System.out.print("Ingrese el divisor: ");
        num2 = sc.nextFloat();
        if (num2 == 0){
            System.out.println("El divisor no puede ser cero, intente de nuevo");
        }
        else{
            resultado = num1 / num2;
            System.out.println("El resultado de la división: "+num1+" / "+num2+" = "+resultado);
        }
    }
}
