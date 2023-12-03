package cola;

public class Cola<T>{
    private Nodo<T> head;
    private Nodo<T> tail;
    private int size;

    public Cola() {
        this.head = this.tail = null;
        this.size = 0;
    }

    public Cola(T dato) {
        Nodo<T> n = new Nodo(dato);
        this.head = this.tail = n;
        this.size = 1;
    }
    
    private boolean esVacio() {
        return this.head == null;
    }
    
    //PONE UN NUEVO ELEMENTO EN LA COLA 
    //LA DATA QUE SE VA A AÑADIR A LA COLA
    //COMPLEJIDAD 0(1)
   
    public void encolar(T dato) {
        Nodo<T> n = new Nodo(dato);
        this.size++;
        if (esVacio()) {
            this.head = this.tail = n;
        } else {
            this.tail.setNext(n);
            this.tail = n;
        }
    }
    
    //ELIMINA EL PRIMER ELEMENTO EN LA COLA Y DEVUELVE SU DATA
    //COMPLEJIDAD 0(1)
    
    public T desencolar() {
        if (esVacio()) {
            return null;
        }

        Nodo<T> temp = this.head;
        this.head = temp.getNext();
        temp.setNext(null);
        this.size--;
        return temp.getDato();
    }
    
    //DEVUELVE LA CABEZA DE LA COLA
    public Nodo<T> getHead() {
        return head;
    }

    //DEVUELVE LA COLA DE LA COLA
    public Nodo<T> getTail() {
        return tail;
    }

    //DEVUELVE EL TAMAÑO DE LA COLA 
    public int getSize() {
        return size;
    }
    
    //INVIERTE LA COLA
    public void reverse() {

        T aux;

        if (!esVacio()) {
            aux = desencolar();
            reverse();
            encolar(aux);

        }

    }
    
    //IMPRIME LA COLA
    public void print() {
        for (int i = 0; i < size; i++) {
            T aux = desencolar();
            System.out.println(aux);
            encolar(aux);
        }
    }
    
    //HACE UNA COPIA DE LA COLA 
    public Cola copy() {
        Cola copy = new Cola();
        for (int i = 0; i < this.size; i++) {
            T aux = desencolar();
            copy.encolar(aux);
            encolar(aux);
        }
        
        return copy;

    }
}