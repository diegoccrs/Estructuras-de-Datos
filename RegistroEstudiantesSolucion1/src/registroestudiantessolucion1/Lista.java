package registroestudiantessolucion1;

public class Lista<T>{
    private Nodo<T> head;
    private Nodo<T> tail;

    public Lista() {
        this.head = null;
        this.tail = null;
    }

    public Nodo<T> getHead() {
        return head;
    }

    public void setHead(Nodo<T> head) {
        this.head = head;
    }

    public Nodo<T> getTail() {
        return tail;
    }

    public void setTail(Nodo<T> tail) {
        this.tail = tail;
    }
    
    public Boolean esVacio() {
        return head == null;
    }
    
    public void insertarAlfinal(T data) {
        Nodo nuevo = new Nodo(data);

        if (esVacio()) {
            this.head = nuevo;
            this.tail = nuevo;

        } else {
            Nodo aux = tail;
            aux.setpNext(nuevo);
            tail = nuevo;

        }

    }
    
    public void print() {
        if (!esVacio()) {
            Nodo pAux = head;
            while (pAux != null) {
                System.out.println(pAux.getData());
                pAux = pAux.getpNext();
            }
        } else {
            System.out.println("La lista esta vacia");
        }

    }
    
    public void printSecciones() {
        if (!esVacio()) {
            Nodo pAux = head;
            while (pAux != null) {
                Seccion mySecc = (Seccion) pAux.getData();
                mySecc.print();

                pAux = pAux.getpNext();
            }
        } else {
            System.out.println("La lista esta vacia");
        }

    }
    
     public void printEstudiantesDadoSalon(String salon) {
        if (!esVacio()) {
            Nodo pAux = head;
            while (pAux != null) {
                Seccion mySecc = (Seccion) pAux.getData();
                if (mySecc.getSalon().equals(salon)) {
                    mySecc.print();
                    System.out.println("");
                    Nodo auxEstudiante = mySecc.getEstudiantes().getHead();
                    while (auxEstudiante != null) {
                        Estudiante myStudent = (Estudiante) auxEstudiante.getData();
                        myStudent.print();
                        
                        auxEstudiante = auxEstudiante.getpNext();
                    }

                }
                pAux = pAux.getpNext();
            }
        } else {
            System.out.println("La lista esta vacia");
        }

    }

}