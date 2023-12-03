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
public class Postgrado extends Materia{
    
    private String diplomado;

    public Postgrado(String nombre, int creditos, String diplomado) {
        super(nombre, creditos, 75);
        this.diplomado = diplomado;
    }

    public String getDiplomado() {
        return diplomado;
    }

    public void setDiplomado(String diplomado) {
        this.diplomado = diplomado;
    }
    
    
    
    
    
    
}
