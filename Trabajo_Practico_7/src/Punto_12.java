import java.util.Arrays;
import java.util.Collections;
import java.lang.reflect.Array;
public class Punto_12 {
    public static void main(String[] args) {
        int[] array = {1,7,3,2,5,10,9,8,4,6};
        int izquierda = 0, derecha = Array.getLength(array)-1;
        mergesort(array, izquierda, derecha);
        System.out.println(Arrays.toString(array));
    }
    public static void mergesort(int[] A, int izq, int der){
        if (izq < der){
            int m=(izq+der)/2;
            mergesort(A,izq, m);
            mergesort(A,m+1, der);
            merge(A,izq, m, der);
        }
    }
    public static void merge(int A[],int izq, int m, int der){
        int i, j, k;
        int [] B = new int[A.length];
        for (i=izq; i<=der; i++)
            B[i]=A[i];

        i=izq; j=m+1; k=izq;

        while (i<=m && j<=der)
            if (B[i]<=B[j])
                A[k++]=B[i++];
            else
                A[k++]=B[j++];

        while (i<=m)
            A[k++]=B[i++];
    }
}
