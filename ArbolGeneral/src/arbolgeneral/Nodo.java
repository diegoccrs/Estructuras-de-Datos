package arbolgeneral;

public class Nodo {
    private Object dato;
    private Nodo hijoIzq;
    private Nodo hermanoDer;

    public Nodo(Object dato) {
        this.dato = dato;
        hijoIzq = null;
        hermanoDer = null;
    }

    public Object getDato() {return dato;}

    public void setDato(Object dato) {this.dato = dato;}

    public Nodo getHijoIzq() {return hijoIzq;}

    public void setHijoIzq(Nodo hijoIzq) {this.hijoIzq = hijoIzq;}

    public Nodo getHermanoDer() {return hermanoDer;}

    public void setHermanoDer(Nodo hermanoDer) {this.hermanoDer = hermanoDer;}
    
    public boolean EsHoja(){return this.getHijoIzq() == null;}
    
}