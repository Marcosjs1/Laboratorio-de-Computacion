import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Punto_25 {
    public static void main(String[] args) {
        int n, aux;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        n = sc.nextInt();
        aux = n;
        System.out.println("Números de "+n+" hasta 1 con while: ");
        while (n >= 1){
            System.out.println(n);
            n -= 1;
        }
        n = aux;
        System.out.println("Números de "+n+" hasta 1 con do-while: ");
        do{
            System.out.println(n);
            n -= 1;
        }
        while (n >= 1);
        n = aux;
        System.out.println("Números de "+n+" hasta 1 con for: ");
        for (n = n; n >= 1; n -=1){
            System.out.println(n);
        }
    }
}
