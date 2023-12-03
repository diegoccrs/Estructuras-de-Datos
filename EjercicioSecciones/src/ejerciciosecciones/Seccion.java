package ejerciciosecciones;

public class Seccion {
    String salon, profesor, materia;
    Lista<Estudiante> estudiantes;
    
    public Seccion(String salon, String profesor, String materia){
        this.salon = salon;
        this.profesor = profesor;
        this.materia = materia;
        estudiantes = new Lista<>();
    }
    
    public void agregarEstudiante(Estudiante e){
        e.agregarMateria(materia);
        estudiantes.insert(e);
    }
    
    public void print(){
        System.out.println("Salon: " + salon);
        System.out.println("Profesor: " + profesor);
        System.out.println("Materia: " + materia);
        System.out.println("Estudiantes: ");
        
        Nodo<Estudiante> current = estudiantes.head;
        while(current != null){
            System.out.println(" - " + current.data.nombre);
            current = current.next;
        }
    }
}