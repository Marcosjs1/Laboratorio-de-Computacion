import java.util.ArrayList;
import java.util.Scanner;
public class Punto_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los 20 números que contendrá el array: ");
        ArrayList<Double> numList = new ArrayList<>();
        for (int i = 0 ; i < 20; i++){
            System.out.print(i+1+"- ");
            numList.add(sc.nextDouble());
        }
        System.out.println("La lista es: "+numList);
        double mayor = numList.get(0);
        double menor = numList.get(0);
        for (int i = 0; i < numList.size(); i++){
            if (numList.get(i) > mayor){mayor = numList.get(i);}
            if (numList.get(i) < menor){menor = numList.get(i);}
        }
        System.out.println("El número más grande del array es: "+mayor);
        System.out.println("El número más chico del array es: "+menor);
        System.out.println("El rango entre el mayor y el menor elemento del array es: "+(mayor-menor));
    }
}
