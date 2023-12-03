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
public class Cola<T> {

    private Nodo<T> pHead;
    private int size;
    private Nodo<T> pTail;

    public Cola() {
        this.pHead = this.pTail = null;
        this.size = 0;
    }

    private boolean isEmpty() {
        return this.pHead == null;
    }

    public void enColar(T datum) {
        Nodo<T> n = new Nodo(datum);
        this.size++;
        if (isEmpty()) {
            this.pHead = this.pTail = n;
        } else {
            this.pTail.setpNext(n);
            this.pTail = n;
        }
    }

    public T desEnColar() {
        if (isEmpty()) {
            return null;
        }

        Nodo<T> temp = this.pHead;
        this.pHead = temp.getpNext();
        temp.setpNext(null);
        this.size--;
        return temp.getData();
    }

    public void reverse() {

        T aux;

        if (!isEmpty()) {
            aux = this.desEnColar();
            reverse();
            this.enColar(aux);

        }

    }
    public void print() {

        for (int i = 0; i < size; i++) {
            T aux = this.desEnColar();
            System.out.println(aux);
            this.enColar(aux);
        }
    }
    public Cola<T> copy() {
        Cola copy = new Cola();
        for (int i = 0; i < this.size; i++) {
            T aux = this.desEnColar();
            copy.enColar(aux);
            this.enColar(aux);
        }
        return copy;

    }
    
    

    public Nodo<T> getpHead() {
        return pHead;
    }

    public void setpHead(Nodo<T> pHead) {
        this.pHead = pHead;
    }

    public Nodo<T> getpTail() {
        return pTail;
    }

    public void setpTail(Nodo<T> pTail) {
        this.pTail = pTail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
