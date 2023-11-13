import java.util.Arrays;
import java.util.Collections;
import java.lang.reflect.Array;
import java.util.Scanner;
public class Punto_14 {
    public static void main(String[] args) {
        int[] array = new int[20];
        String metodoUtilizado = "";
        byte orden = 0, metodo = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los números que contendrá el array");
        for (int i = 0; i <= Array.getLength(array)-1; i += 1){
            System.out.print(i+1+"- ");
            array[i] = sc.nextInt();
        }

        System.out.println("¿De que forma desea ordenar el array?");
        while (orden < 1 || orden > 2) {
            System.out.println("Seleccione una opción: ");
            System.out.println("1. Ascendente");
            System.out.println("2. Descendente");
            orden = sc.nextByte();
            if (orden < 1 || orden > 2) {
                System.out.println("La opción ingresada es inválida");
            }
        }
        System.out.println("¿Que método desea aplicar?");
        while (metodo < 1 || metodo > 3) {
            System.out.println("Seleccione una opción: ");
            System.out.println("1. Inserción");
            System.out.println("2. Burbuja");
            System.out.println("3. Selección");
            metodo = sc.nextByte();
            if (metodo < 1 || metodo > 3) {
                System.out.println("La opción ingresada es inválida");
            }
        }
        System.out.println("El array ingresado es: ");
        System.out.println(Arrays.toString(array));
        if (metodo == 1){array = inserción(array, orden); metodoUtilizado = "inserción";}
        if (metodo == 2){array = burbuja(array, orden); metodoUtilizado = "burbuja";}
        if (metodo == 3){array = seleccion(array, orden); metodoUtilizado = "selección";}
        System.out.println("El array ordenado mediante el método '"+metodoUtilizado+"' es: ");
        System.out.println(Arrays.toString(array));
    }
    public static int[] inserción(int[] A, byte ord){
        int pos, j;
        int aux;
        if (ord == 1){
            for (pos = 1; pos < A.length; pos++){
                aux = A[pos];
                j = pos - 1;
                while ((j >= 0) && (aux < A[j])){
                    A[j + 1] = A[j];
                    j--;
                }
                A[j + 1] = aux;
            }
            return A;
        }
        if (ord == 2){
            for (pos = 1; pos < A.length; pos++){
                aux = A[pos];
                j = pos - 1;
                while ((j >= 0) && (aux > A[j])){
                    A[j + 1] = A[j];
                    j--;
                }
                A[j + 1] = aux;
            }
            return A;
        }
        return A;
    }
    public static int[] burbuja(int[] A, byte ord){
        int i, j, aux;
        if (ord == 1){
            for (i = 0; i < A.length - 1; i++) {
                for (j = 0; j < A.length -i - 1; j++) {
                    if (A[j + 1] < A[j]) {
                        aux = A[j + 1];
                        A[j + 1] = A[j];
                        A[j] = aux;
                    }
                }
            }
            return A;
        }
        if (ord == 2){
            for (i = 0; i < A.length - 1; i++) {
                for (j = 0; j < A.length -i - 1; j++) {
                    if (A[j + 1] > A[j]) {
                        aux = A[j + 1];
                        A[j + 1] = A[j];
                        A[j] = aux;
                    }
                }
            }
            return A;
        }
        return A;
    }
    public static int[] seleccion(int[] A, byte ord){
        int i, j, pos, aux;
        if (ord == 1){
            int menor;
            for (i = 0; i < A.length - 1; i++) {
                menor = A[i];
                pos = i;
                for (j = i + 1; j < A.length; j++){
                    if (A[j] < menor) {
                        menor = A[j];
                        pos = j;
                    }
                }
                if (pos != i){
                    aux = A[i];
                    A[i] = A[pos];
                    A[pos] = aux;
                }
            }
            return A;
        }
        if (ord == 2){
            int mayor;
            for (i = 0; i < A.length - 1; i++) {
                mayor = A[i];
                pos = i;
                for (j = i + 1; j < A.length; j++){
                    if (A[j] > mayor) {
                        mayor = A[j];
                        pos = j;
                    }
                }
                if (pos != i){
                    aux = A[i];
                    A[i] = A[pos];
                    A[pos] = aux;
                }
            }
        }
        return A;
    }
}
