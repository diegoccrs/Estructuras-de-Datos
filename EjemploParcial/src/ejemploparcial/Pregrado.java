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
public class Pregrado extends Materia{
    
    private String departamento;
    
    public Pregrado(String nombre, int creditos, String departamento){
        super(nombre,creditos,65);
        this.departamento = departamento;
        
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
    
    
    
    
    
    
    
}
