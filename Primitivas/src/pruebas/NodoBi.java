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
public class NodoBi {
    private Object dato;
    private NodoBi hijoIzq;
    private NodoBi hijoDer;
    private NodoBi padre;

    public NodoBi(Object dato, NodoBi padre) {
        this.dato = dato;
        this.hijoIzq = this.hijoDer = null;
        this.padre = padre;
    }
    
    public NodoBi(Object dato) {
        this.dato = dato;
        this.hijoIzq = this.hijoDer = null;
        this.padre = null;
    }
    
    public NodoBi() {
        this.dato = null;
        this.hijoIzq = this.hijoDer = null;
        this.padre = null;
    }

    public boolean isfull(){
        return  this.hijoDer != null && this.hijoIzq != null;
    }
    
    
    
    public NodoBi getPadre() {
        return padre;
    }

    public void setPadre(NodoBi padre) {
        this.padre = padre;
    }
    

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoBi getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(NodoBi hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public NodoBi getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(NodoBi hijoDer) {
        this.hijoDer = hijoDer;
    }
}
