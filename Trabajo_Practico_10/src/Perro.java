public class Perro {
    private String nombre;
    private String raza;
    private int edad;

    public Perro(String nombre, String raza, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }
    public void crearPerro(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Raza: "+raza);
        System.out.println("Edad: "+edad);
    }
    public void ladrar(){
        System.out.println("Guau, Guau");
    }
    public static void main(String [] args){
        Perro perro1 = new Perro("Ricardo", "Pitbull",2);
        perro1.crearPerro();
        perro1.ladrar();
    }
}
