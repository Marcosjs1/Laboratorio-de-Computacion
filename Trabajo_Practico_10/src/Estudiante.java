public class Estudiante {
    private String nombre;
    private int edad;
    private int numeroIdentificacion;
    public Estudiante(String nombre, int edad, int numeroIdentificacion){
        this.nombre = nombre;
        this.edad = edad;
        this.numeroIdentificacion = numeroIdentificacion;
    }
    public void infoEstudiante(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Número de ID: "+numeroIdentificacion);
    }
    public static void main(String [] args){
        Estudiante est1 = new Estudiante("Matías rojas", 18, 781);
        est1.infoEstudiante();
    }
}
