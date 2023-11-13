import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Punto_4 {
    public static void main(String[] args) {
        int contador = 1;
        int[] pares = new int[20];
        for (int i = 0; i <= 19; i += 1) {
            if (contador % 2 == 0){pares[i] = contador;}
            else {i -= 1;}
            contador += 1;
        }
        System.out.println("Elementos del array 'pares': ");
        for (int i = 0; i <= 19; i+= 1){
            System.out.println((i+1)+"- "+pares[i]);
        }
    }
}
