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
public class Nodo {
    public int dato;
    public Nodo siguiente; //Puntero enlace
    //Constructor para insertar al Final
    public Nodo(int d){
        this.dato=d;
    }
    //Constructor para insertar al Inicio
    public Nodo(int d,Nodo n){
        dato=d;
        siguiente=n;
    }
    
    
}
