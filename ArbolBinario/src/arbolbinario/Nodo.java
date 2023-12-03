package arbolbinario;


public class Nodo {
    private Object dato;
    private Nodo hijoIzq;
    private Nodo hijoDer;
    private Nodo padre;

    public Nodo(Object dato) {
        this.dato = dato;
        hijoIzq=hijoDer=null;
        padre= null;
    }
    
    public Nodo(Object dato,Nodo padre) {
        this.dato = dato;
        hijoIzq=hijoDer=null;
        this.padre= padre;
    }
    
    
    public Object getDato() {return dato;}

    public void setDato(Object dato) {this.dato = dato;}

    public Nodo getHijoIzq() {return hijoIzq;}

    public void setHijoIzq(Nodo hijoIzq) {this.hijoIzq = hijoIzq;}

    public Nodo getHijoDer() {return hijoDer;}

    public void setHijoDer(Nodo hijoDer) {this.hijoDer = hijoDer;}

   public Nodo getPadre() {return padre;}

   public void setPadre(Nodo padre) {this.padre = padre;}
    
}
