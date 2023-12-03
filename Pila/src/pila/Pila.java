package pila;

public class Pila<T> {
    private Nodo<T> head;

    public Pila() {
        this.head = null;
    }

    public Pila(T dato) {
        Nodo<T> n = new Nodo(dato);
        this.head = n;
    }
    
    private boolean esVacio() {
        return this.head == null;    
    }
    
    //AÑADE NUEVO ELEMENTO A LA PILA 
    //COMPLEJIDAD 0(1)
    
    public void push(T dato) {
        Nodo <T> n = new Nodo(dato);
        if (esVacio()) {
            this.head = n;
        }else {
            n.setNext(this.head);
            this.head = n;
        }
    }
    
    //ELIMINA EL ULTIMO ELEMENTO DE LA LISTA Y DEVUELVE SU DATA
    //COMPLEJIDAD 0(1)
    public T pop() {
        if (esVacio()) {
            return null;
        }

        Nodo<T> temp = this.head;
        this.head = temp.getNext();
        temp.setNext(null);
        return temp.getDato();
    }
    
    
    //OBTIENE LA DATA CONTENIDA EN EL ULTIMO ELEMENTO DE LA PILA
    public T peek() {
        if (esVacio()) {
            return null;
        }

        Nodo<T> temp = this.head;
        return temp.getDato();
    }
    
    //IMPRIME LA PILA
     public void print() {
        T aux;

        if (esVacio()) {
            System.out.println("Pila Vacia");
        } else {

            aux = pop();
            System.out.println(aux);
            print();
            push(aux);

        }

    }
     
    //INVIERTE LA PILA 
    public Pila reverse(Pila origin, Pila copy) {

        T aux;

        if (!esVacio()) {
            aux = peek();
            pop();
            copy.push(aux);
            reverse(origin, copy);
            origin.push(aux);

        }

        return copy;

    }
    
    //COPIA LA PILA
    public Pila copy(Pila origin, Pila result) {
        T aux;

        if (!esVacio()) {
            aux = peek();
            pop();
            copy(origin, result);
            result.push(aux);

            origin.push(aux);

        }

        return result;
    }  
}