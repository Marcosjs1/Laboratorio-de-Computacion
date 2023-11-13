import java.util.Scanner;
import java.util.Arrays;
public class Punto_4 {
    public static void main(String[] args) {
        int f, c;
        System.out.print("Ingrese el número de filas de la matriz: ");
        f = leerEntero();
        System.out.print("Ingrese el número de columnas de la matriz: ");
        c = leerEntero();

        int[][] matriz1 = crearMatriz(f, c);

        System.out.println("Ingrese los valores de la matriz: ");
        llenarMatriz(matriz1);

        int [][] matrizT = crearMatrizTranspuesta(matriz1);

        System.out.println("La matriz es: ");
        mostrarMatriz(matriz1);
        System.out.println("La matriz transpuesta es: ");
        mostrarMatriz(matrizT);

        if (matrizIgualATranspuesta(matriz1, matrizT)) {
            System.out.println("La matriz ingresada es igual a su transpuesta");
        }
        else{
            System.out.println("La matriz ingresada NO es igual a su transpuesta");
        }

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
    public static int[][] crearMatrizTranspuesta(int[][] matriz){
        int [][] matrizTranspuesta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i += 1){
            for (int j = 0; j < matriz[i].length; j += 1){
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }
        return matrizTranspuesta;
    }
    public static boolean matrizIgualATranspuesta(int[][] matrizOriginal, int[][] matrizTranspuesta){
        if(Arrays.deepEquals(matrizOriginal, matrizTranspuesta)){
            return true;
        }
        else{
            return false;
        }
    }
}
