/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploparcial;

/**
 *
 * @author User
 */
public class Inscripcion {
    
    private Estudiante estudiante;
    private Materia materias[] = new Materia[5];
    private int total;

    public Inscripcion(Estudiante estudiante, Materia[] materias) {
        this.estudiante = estudiante;
        this.materias = materias;
        this.total = calculateTotal(materias);
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Materia[] getMaterias() {
        return materias;
    }

    public void setMaterias(Materia[] materias) {
        this.materias = materias;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    public static int calculateTotal(Materia materias[]) {
        int total = 0;
        for (Materia materia: materias) {
            if (materia == null) {
                continue;
            }
            total += materia.getPrecio()* materia.getCreditos();
            
        }
        return total;
    }
    
    
    
}
