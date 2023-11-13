import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Punto_10 {
    public static void main(String[] args) {
        int f, c;
        System.out.print("Ingrese el número de filas de las matrices: ");
        f = leerEntero();
        System.out.print("Ingrese el número de columnas de las matrices: ");
        c = leerEntero();

        int[][] matriz1 = crearMatriz(f, c);
        int[][] matriz2 = crearMatriz(f, c);

        System.out.println("Ingrese los valores de la primera matriz: ");
        llenarMatriz(matriz1);
        System.out.println("Ingrese los valores de la segunda matriz: ");
        llenarMatriz(matriz2);

        int[][] matriz3 = sumarMatriz(matriz1, matriz2);

        System.out.println("La primera matriz es: ");
        mostrarMatriz(matriz1);
        System.out.println("La segunda matriz es: ");
        mostrarMatriz(matriz2);
        System.out.println("La suma de las matrices es: ");
        mostrarMatriz(matriz3);
    }
    public static int leerEntero(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return n;
    }
    public static int[][] crearMatriz(int filas, int columnas){
        int[][] matriz = new int[filas][columnas];
        return matriz;
    }
    public static void llenarMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i += 1){
            for (int j = 0; j < matriz[i].length; j += 1){
                System.out.print("Elemento ["+i+"] ["+j+"]: ");
                matriz[i][j] = leerEntero();
            }
        }
    }
    public static void mostrarMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i += 1){
            for (int j = 0; j < matriz[i].length; j += 1){
                System.out.printf("%5d", matriz[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] sumarMatriz(int[][] matrizUno, int [][] matrizDos){
        int [][] matrizSuma = crearMatriz(matrizUno.length, matrizUno[0].length);
        for (int i = 0; i < matrizUno.length; i += 1){
            for (int j = 0; j < matrizUno[i].length; j += 1){
                matrizSuma[i][j] = matrizUno[i][j] + matrizDos[i][j];
            }
        }
        return matrizSuma;
    }
}
