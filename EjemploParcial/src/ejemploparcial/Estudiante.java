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
public class Estudiante {
    
    private String nombre;
    private int dni;
    private String nivelEstudio;

    public Estudiante(String nombre, int dni, String nivelEstudio) {
        this.nombre = nombre;
        this.dni = dni;
        this.nivelEstudio = nivelEstudio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNivelEstudio() {
        return nivelEstudio;
    }

    public void setNivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }
    
    
    public static Estudiante registrarEstudiante() {
        
        String nombre = Utils.askStringInput("Ingrese su nombre: ");
        int dni = Utils.askNumberInput("Ingrese su cedula: ");
        String niveldeEstudio = Utils.askNivelEstudio();
        
        return new Estudiante(nombre,dni,niveldeEstudio);
                
    
    }
    
}
