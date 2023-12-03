/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//  CICLO WHILE
    int x= Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero entre 1 y 6: "));
    
    while(x<1 || x>6){
        JOptionPane.showMessageDialog(null, "error");
        x= Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero entre 1 y 6: "));
        
    }
    
//   CICLO FOR
     for (int i = 0; i < 10; i++) {
         System.out.println(i);
        }
      
    }
    
}
