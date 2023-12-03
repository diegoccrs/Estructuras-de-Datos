package ejerciciosecciones;

public class Lista<T>{
    Nodo<T> head;
    
    public Lista(){
        head = null;
    }
    
    
    
    public void insert(T data){
        Nodo<T> newNode = new Nodo(data);
        
        if(head == null){
            head = newNode;
        } else{
            Nodo<T> current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    
    public void print(){
        Nodo<T> current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
    
}