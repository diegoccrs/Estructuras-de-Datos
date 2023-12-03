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
public class NodoAG {
    private Object data;
    private NodoAG pSon;
    private NodoAG pSib;

    public NodoAG(Object data) {
        this.data = data;
        this.pSon = null;
        this.pSib = null;
    }

    public void addSon(NodoAG newSon){
        if (this.getpSon() != null) {
            NodoAG temp = this.getpSon();
            NodoAG sibling = temp;
            while(temp!= null){
                sibling = temp;
                temp = temp.getpSib();
            }
            sibling.setpSib(newSon);
            
        }else{
            this.setpSon(newSon);
        }
    
    }
    
    
    
    
    
    
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public NodoAG getpSon() {
        return pSon;
    }

    public void setpSon(NodoAG pSon) {
        this.pSon = pSon;
    }

    public NodoAG getpSib() {
        return pSib;
    }

    public void setpSib(NodoAG pSib) {
        this.pSib = pSib;
    }
    
    
    
    
    
}
