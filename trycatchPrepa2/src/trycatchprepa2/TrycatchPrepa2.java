/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatchprepa2;

/**
 *
 * @author User
 */
public class TrycatchPrepa2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cad = "150g";
        
        try{
            Integer.parseInt(cad);
        }catch(Exception e){
            System.out.println("No es un numero");
    }
    
        
    }
}

