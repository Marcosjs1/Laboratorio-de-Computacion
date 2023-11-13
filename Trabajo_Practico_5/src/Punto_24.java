import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Punto_24 {
    public static void main(String[] args) {
        int n, i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        n = sc.nextInt();
        System.out.println("Números de 1 hasta "+n+" con while: ");
        while (i <= n){
            System.out.println(i);
            i += 1;
        }
        i = 1;
        System.out.println("Números de 1 hasta "+n+" con do-while: ");
        do{
            System.out.println(i);
            i += 1;
        }
        while (i <= n);
        i = 1;
        System.out.println("Números de 1 hasta "+n+" con for: ");
        for (i = 1; i <= n; i +=1){
            System.out.println(i);
        }
    }
}
