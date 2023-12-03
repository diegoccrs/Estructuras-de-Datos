/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepa2;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Funciones {
    
    private int num1;
    private int num2;

    public Funciones(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public Funciones(){
    }
    
    public String pedir_nombre(){
        String  nombre = JOptionPane.showInputDialog(null,"Nombre: ");
        return nombre;
    }
    
    public int pedir_numero(){
        int numero= Integer.parseInt(JOptionPane.showInputDialog(null,"Numero: "));
        return numero;
    }
    
    public int suma(int num1,int num2){
        return num1+num2;
    }
    
    public void mostrar_resultado(Object palabra){
        JOptionPane.showMessageDialog(null, palabra);
    }
            
}
