public class Circulo {
    private double radio;
    public Circulo(double radio){
        this.radio = radio;
    }
    public void crearCirculo(){
        System.out.println("El radio del círculo es: "+radio);
    }
    public void calcularArea(){
        String area = String.format("%.2f", Math.PI * Math.pow(radio,2));
        System.out.println("El area del círculo es: "+area);
    }
    public void calcularCircunferencia(){
        String circunferencia = String.format("%.2f", 2 * Math.PI * radio);
        System.out.println("La circunferencia del círculo es: "+circunferencia);
    }
    public static void main(String [] args){
        Circulo cir1 = new Circulo(7.14);
        cir1.crearCirculo();
        cir1.calcularArea();
        cir1.calcularCircunferencia();
    }
}