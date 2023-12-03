/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_simples_ejemployoutube;

/**
 *
 * @author User
 */
public class Lista {
    protected Nodo inicio,fin; //Punteros para saber donde esta el inicio y el fin 
    public Lista(){
        inicio = null;
        fin = null;        
    }
    // Metodo para Agregar un Nodo al Inicio de la Lista
    public void agregarAlInicio(int elemento){
        //Creando Nodo
        inicio = new Nodo(elemento,inicio);
        if(fin==null){
            fin = inicio;
        }
    }
    //Metodo para mostrar los datos
    public void mostrarLista(){
        Nodo recorrer=inicio;
        System.out.println();
        while(recorrer!=null){
            System.out.print("["+recorrer.dato+"]--->");
            recorrer = recorrer.siguiente;
            
        }
    }
    
}