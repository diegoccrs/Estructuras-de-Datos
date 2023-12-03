package registroestudiantessolucion1;

public class Estudiante {
    String nombre;
    String carrera;

    public Estudiante(String nombre, String carrera) {
        this.nombre = nombre;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void print() {

        System.out.println("Nombre: " + this.nombre);
        System.out.println("Carrera: " + this.carrera);

    }  
}