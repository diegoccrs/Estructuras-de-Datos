package registroestudiantessolucion1;

public class Nodo<T>{
    private T data;
    private Nodo pNext;

    public Nodo(T dato) {
        this.data = dato;
        this.pNext = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Nodo getpNext() {
        return pNext;
    }

    public void setpNext(Nodo pNext) {
        this.pNext = pNext;
    }
    
}