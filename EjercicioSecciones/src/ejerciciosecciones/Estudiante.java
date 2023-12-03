package ejerciciosecciones;

public class Estudiante {
    String nombre;
    Lista<String> materias;
    
    public Estudiante(String nombre){
        this.nombre = nombre;
        materias = new Lista<>();
    }
    
    public void agregarMateria(String materia){
        materias.insert(materia);
    }
    
    public void print(){
        Nodo<String> current = materias.head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}