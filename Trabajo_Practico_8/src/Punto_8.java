import java.util.Scanner;
import java.util.Arrays;
public class Punto_8 {
    public static void main(String[] args) {
        int f, c, filaASumar;
        System.out.print("Ingrese el número de filas de la matriz: ");
        f = leerEntero();
        System.out.print("Ingrese el número de columnas de la matriz: ");
        c = leerEntero();

        int[][] matriz1 = crearMatriz(f, c);

        System.out.println("Ingrese los valores de la matriz: ");
        llenarMatriz(matriz1);

        System.out.println("La matriz es: ");
        mostrarMatriz(matriz1);

        System.out.print("Ingrese la fila de la cual desea sumar los elementos: ");
        filaASumar = leerEntero();

        System.out.print("La suma de los elementos de la fila "+filaASumar+" de la matriz es: "+sumarElementosFila(filaASumar, matriz1));
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

    public static int sumarElementosFila (int fila, int[][] matriz) {
        int suma = 0;
        fila -= 1;
        for (int i = 0; i < matriz.length; i += 1) {
            suma += matriz[fila][i];
        }
        return suma;
    }
}
