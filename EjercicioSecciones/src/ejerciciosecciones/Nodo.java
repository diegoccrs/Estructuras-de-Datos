package ejerciciosecciones;

public class Nodo<T>{
    T data;
    Nodo next;
    
    public Nodo(T data){
        this.data = data;
        next = null;
    }
}