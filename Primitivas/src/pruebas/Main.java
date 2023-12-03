/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import javax.swing.JOptionPane;
import static pruebas.Funciones.isNumber;

/**
 *
 * @author reina
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista_Circular myList = new Lista_Circular<Integer>();
        myList.AddBeginningCL(5);
        myList.AddBeginningCL(4);
        myList.AddEndCL(7);
        myList.AddBeginningCL(3);
        myList.AddBeginningCL(2);
        myList.AddBeginningCL(1);
        myList.AddPosCL(9, 1);
        myList.EliminateEndCL();
        myList.EliminateBeginningCL();
        myList.EliminatePosCL(9);
        
        
        Cola MyCola = new Cola<Integer>();
        MyCola.enColar(1);
        MyCola.enColar(2);
        MyCola.enColar(3);
        MyCola.enColar(4);
        MyCola.enColar(5);
        MyCola.enColar(6);
        
        
        Pila MyPila = new Pila<Integer>();
        
        MyPila.push(1);
        MyPila.push(2);
        MyPila.push(3);
        MyPila.push(4);
        MyPila.push(5);
        MyPila.push(6);
        
        System.out.println("");
        Pila MyPila2 = new Pila<Integer>();
        MyPila.getPop();
        MyPila.getPop();
        MyPila.submerge(9);
        
        
        BST myB = new BST();
        myB.insertd(null, 8);
        myB.insertd(myB.getRoot(), 4);
        myB.insertd(myB.getRoot(), 12);
        myB.insertd(myB.getRoot(), 14);
        myB.insertd(myB.getRoot(), 10);
        myB.insertd(myB.getRoot(), 6);
        myB.insertd(myB.getRoot(), 2);
        
       
        
       
    }

    

}
