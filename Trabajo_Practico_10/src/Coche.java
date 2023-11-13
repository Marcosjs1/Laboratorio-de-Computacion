public class Coche {
    private String marca;
    private String modelo;
    private int añoFab;
    public Coche(String marca, String modelo, int añoFab){
        this.marca = marca;
        this.modelo = modelo;
        this.añoFab = añoFab;
    }
    public void infoCoche(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Año de fabricación: "+añoFab);
    }
    public void acelerar(){
        System.out.println("El coche ha acelerado");
    }
    public void frenar(){
        System.out.println("El coche ha frenado");
    }
    public static void main(String [] args){
        Coche c1 = new Coche("Chevrolet", "Camaro", 2016);
        c1.infoCoche();
        c1.acelerar();
        c1.frenar();
    }
}