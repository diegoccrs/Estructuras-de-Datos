/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepa2;

/**
 *
 * @author User
 */
public class Prepa2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Funciones func = new Funciones(); //aca estas creando el objeto, pasa asi poder usar todos los metodos de Funciones en esta clase
//        
//        int num1=func.pedir_numero();
//        int num2=func.pedir_numero();
//        func.mostrar_resultado(func.suma(num1, num2));
        Object num=13;
        
        Nodo nodo= new Nodo(num);
        
        System.out.println(nodo.getElement());
        System.out.println(nodo.getpNext());
        
        nodo.setElement(20);
        System.out.println(nodo.getElement());
        
        Object num0= 10;
        Nodo nodo0= new Nodo(num0);
        nodo.setpNext(nodo0);
        System.out.println(nodo.getpNext().getElement());
        System.out.println(nodo.getpNext().getpNext());
        
        
        System.out.println();
        Nodo nodito_1 = new Nodo("Valeria");
        Nodo nodito_2 = new Nodo("Andreina",nodito_1);
        
        System.out.println(nodito_2.getpNext().getElement());
        System.out.println(nodito_2.getpNext().getpNext());
        
        
        System.out.println();
        
        Lista myList = new Lista();
        myList.InsertarFinal(1);
        myList.InsertarFinal(2);
        myList.InsertarFinal(3);
        myList.InsertarFinal(4);
        myList.Imprimir();
        
        System.out.println();
        
        myList.EliminarInicio();
        myList.Imprimir();
        
    }
    
}