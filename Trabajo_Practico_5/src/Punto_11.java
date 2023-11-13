import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Punto_11 {
    public static void main(String[] args) {
        char caracter;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un carácter: ");
        caracter = sc.next().charAt(0);
        if (caracter >= 48 && caracter <= 57){
            System.out.print("El carácter ingresado es un dígito numérico");
        }
        else{
            System.out.print("El carácter ingresado NO es un dígito numérico");
        }
    }
}
