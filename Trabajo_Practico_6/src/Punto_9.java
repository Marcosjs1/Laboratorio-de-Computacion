import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Punto_9 {
    public static void main(String[] args) {
        int desdeNum, hastaNum, tamArray;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el intervalo de números aleatorios que llenará el array:");
        System.out.print("Desde: ");
        desdeNum = sc.nextInt();
        System.out.print("Hasta: ");
        hastaNum = sc.nextInt();
        System.out.print("Ingrese el tamaño del array: ");
        tamArray = sc.nextInt();
        int [] array = new int[tamArray];
        array = llenarArrayAleatorio(desdeNum,hastaNum,tamArray);
        System.out.println("Valores del array: ");
        for (int i = 0; i <= tamArray-1; i += 1){
            System.out.println((i+1)+"- "+array[i]);
        }
    }
    public static int [] llenarArrayAleatorio(int desde, int hasta, int tam){
        int[] numeros = new int[tam];
        Random rnd = new Random();
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = rnd.nextInt(hasta - desde + 1) + desde;
        }
        return numeros;
    }
}
