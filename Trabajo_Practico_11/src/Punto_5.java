import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Punto_5 {
    public static void main(String[] args) {
        double promArit = 0;
        Random r = new Random();
        ArrayList<Integer> numList = new ArrayList<>();
        ArrayList<Integer> igualPromArit = new ArrayList<>();
        ArrayList<Integer> mayorPromArit = new ArrayList<>();
        ArrayList<Integer> menorPromArit = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(1,100);
            if (num % 2 == 0){numList.add(num);}
            else{i--;}
        }
        System.out.println("El contenido del array es: " + numList);
        for (int i = 0; i < 20; i++) {
            promArit += numList.get(i);
        }
        promArit = promArit / numList.size();
        System.out.println("El promedio aritmético es: "+promArit);
        int mayorProm = 0;
        int menorProm = 0;
        int igualProm = 0;

        for (int i = 0; i < 20; i++) {
            if (numList.get(i) < promArit){menorPromArit.add(numList.get(i)); menorProm++;}
            else if (numList.get(i) > promArit) {mayorPromArit.add(numList.get(i)); mayorProm++;}
            else{igualPromArit.add(numList.get(i)); igualProm++;}
        }
        System.out.println("Hay "+menorProm+" números menores al promedio aritmético: "+menorPromArit);
        System.out.println("Hay "+mayorProm+" números mayores al promedio aritmético: "+mayorPromArit);
        if(igualPromArit.isEmpty()){System.out.println("No hay números iguales al promedio aritmético");}
        else{System.out.println("Hay "+igualProm+" números iguales al promedio aritmético: "+igualPromArit);}
    }
}
