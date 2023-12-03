package registroestudiantessolucion1;

public class Seccion {
    private Lista estudiantes = new Lista<Estudiante>();
    private String salon;
    private String profesor;
    private String materia;

    public Seccion(String salon, String profesor, String materia) {
        this.salon = salon;
        this.profesor = profesor;
        this.materia = materia;
    }

    public Lista getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Lista estudiantes) {
        this.estudiantes = estudiantes;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

     void print() {

        System.out.println("materia: " + this.materia);
        System.out.println("profesor: " + this.profesor);
        System.out.println("salon: " + this.salon);

    }

    
}
