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
public class Nodo {
    private Object element;
    private Nodo pNext;

    public Nodo(Object element, Nodo pNext) {
        this.element = element;
        this.pNext = pNext;
    }

    public Nodo(Object element) {
        this.element = element;
        this.pNext = null;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public Nodo getpNext() {
        return pNext;
    }

    public void setpNext(Nodo pNext) {
        this.pNext = pNext;
    }
    
    
    
    
}
