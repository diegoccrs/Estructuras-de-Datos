/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_simples_ejemployoutube;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Listas_simples_ejemployoutube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista listica = new Lista();
        int opcion=0,el;
        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"1.- Agregar un elemento al inicio de la lista: \n2.- Mostrar los datos de la lista\n3.- Salir"));
                switch(opcion){
                    case 1:
                        try{
                            el = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento: "));
                            //Agregando al Nodo
                            listica.agregarAlInicio(el);
                        }catch(NumberFormatException n){
                            JOptionPane.showMessageDialog(null,"Error"+n.getMessage());
                        }
                        break;
                    case 2:
                        listica.mostrarLista();
                        break;
                    case 3:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Opcion Incorrrecta");
                        
                }
            }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
            }
        }while(opcion!=3);
             
        
        
      
        
    }
    
}
