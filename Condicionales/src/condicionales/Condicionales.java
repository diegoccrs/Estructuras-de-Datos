/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

/**
 *
 * @author User
 */
public class Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//  CONDICIONALES 
    int x= 4;
    
    if(x<3){
        System.out.println(x+" es menor que 3");
    }else if(x>5){
        System.out.println(x+" es mayor que 5");
    }else{
        System.out.println(x+" no es menor que 3 ni mayor que 5");
    }
    
//   USO DEL SWITCH
     int y= 3;
     switch(y){
         case 1:
             System.out.println("Es el numero 1");
             break;
         case 2:
             System.out.println("Es el numero 2");
             break;
         default:
             System.out.println("Es otro numero distinto de 2 y 1");
     }
             
            
        
    }
    
}
