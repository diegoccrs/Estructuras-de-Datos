/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepa1;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Prepa1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//      DECLARACION DE VARIABLES 
        String name= "Diego";
        System.out.println(name);
            
        int number= 19;
        System.out.println(number);
        
        float decimal=(float)19.6;
        System.out.println(decimal);
    
//      CONCATENAR 
        String x= "Hola";
        String y= "Mundo";
        System.out.println(x+" "+y);
        
//      CASTEO
        String number1= "190";
        int number2= Integer.parseInt(number1);
        System.out.println(number2);
        
        char ch= 'A';
        String str= Character.toString(ch);
        System.out.println(str);
        
//      PEDIR UNA ESPECIE DE INPUT (VENTANITA)
        String cadena= JOptionPane.showInputDialog("Introduzca una frase: ");
        JOptionPane.showMessageDialog(null, cadena);
        
//      INCREMENTO
        int z= Integer.parseInt(JOptionPane.showInputDialog("Numero 1: "));
        int w= Integer.parseInt(JOptionPane.showInputDialog("Numero 2: "));
        
        w=z++ ; //y=x=x+1
        
        JOptionPane.showMessageDialog(null, z);
        JOptionPane.showMessageDialog(null, w);
        
//      BUSCAR LA RAIZ CUADRADA DE UN NUMERO 
        double raiz= Math.sqrt(4);
        System.out.println(raiz);
        
//      OPERACION REDUCIDA 
        int n= 3;
        n -= 2;
        System.out.println(n);
        
//      VALOR DE UNA FRACCION 
        float valor= (float)1/2;
        System.out.println(valor);
        
        
    }
    
}
