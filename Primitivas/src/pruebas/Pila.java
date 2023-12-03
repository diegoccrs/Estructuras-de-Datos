/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author reina
 */
public class Pila<T> {

    private Nodo<T> pCima;
    private int size;

    public Pila() {
        this.pCima = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return pCima == null;

    }

    public void push(T data) {
        Nodo pAux = new Nodo(data);
        if (this.isEmpty()) {
            this.pCima = pAux;
        } else {
            pAux.setpNext(pCima);
            pCima = pAux;
        }
        size++;
    }

    public Nodo getPop() {
        if (!this.isEmpty()) {
            Nodo pAux;
            pAux = pCima;
            pCima = pCima.getpNext();
            size--;
            return pAux;
        }
        return null;
    }

    public void print() {
        if (this.isEmpty()) {
            System.out.println("//");
        } else {
            Nodo aux = this.getPop();
            System.out.println(aux.getData());
            this.print();
            this.push((T) aux.getData());
        }
    }
    
    public Pila<T> copy(Pila pi) {
        if (this.isEmpty()) {
            
        } else {
            Nodo aux = this.getPop();
            this.copy(pi);
            pi.push((T) aux.getData());
            this.push((T) aux.getData());
        }
        return pi;
    }
    
    public void submerge(T data){
        if (this.isEmpty()) {
            this.push(data);
            return;
        } else {
            Nodo aux = this.getPop();
            this.submerge(data);
            this.push((T) aux.getData());
        }
    }
    
    public void invertir(){
        if (this.isEmpty()) {
            return;
        } else {
            Nodo aux = this.getPop();
            this.invertir();
            this.submerge((T) aux.getData());
            
        }
    }
    
    
    static void eliminarMedio(Pila stack, int n, int current){
        if(stack.isEmpty() || current == n){
            return;   
        }
        Nodo dato = stack.peek();
        stack.getPop();
        eliminarMedio(stack, n, current+1);
        if (current != n/2) {
            stack.push(dato.getData());
        }
    }
    
    public Nodo peek(){
    return pCima;
    
    }
    

    public Nodo<T> getpCima() {
        return pCima;
    }

    public void setpCima(Nodo<T> pCima) {
        this.pCima = pCima;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
