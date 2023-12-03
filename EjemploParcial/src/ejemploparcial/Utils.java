/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploparcial;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Utils {
    
    public static String askNivelEstudio() {
        boolean valid = false;
        String input = "";
        while(!valid){
            input = askStringInput("Nivel de estudio: Pregrado o Postgrado ").toLowerCase();
            
            valid = input.equals("pregrado") || input.equals("postgrado");
        }
        return input;
    }
    
    public static String askStringInput(String message) {
        
        boolean valid = false;
        String input = "";
        
        while (!valid) {
            input = JOptionPane.showInputDialog(message);
            
            System.out.println(input);
            System.out.println(input.isEmpty());
            System.out.println(input.isBlank());
            
            if (input.isBlank() == false) {
                valid = true;  
            }else {
                JOptionPane.showMessageDialog(null, "Entrada invalida");
            
            }
        
        }
        return input;
    
    }
    
    public static int askNumberInput(String message) {
        
        boolean valid = false;
        String input = "";
        
        while(!valid) {
            
            try {
                
                input = JOptionPane.showInputDialog(message);
                Integer.parseInt(input);
                valid = true;
            
            }catch (Exception e) {
                
                JOptionPane.showMessageDialog(null, "Entrada invalida");
            }
        
        }
        return Integer.parseInt(input);
        
    
    }
}
