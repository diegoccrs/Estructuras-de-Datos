/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author reina
 * @param <T>
 */
public class Lista_Circular<T> {

    private Nodo<T> pFirst;
    private Nodo<T> pLast;
    private int size;

    public Lista_Circular() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }

    public Lista_Circular(Nodo<T> nuevo) {
        this.pFirst = this.pLast = nuevo;
    }

    public boolean IsEmpty() {
        return pFirst == null;

    }

    public void AddEndCL(T datum) {
        Nodo<T> nuevo = new Nodo(datum);
        if (!IsEmpty()) {
            Nodo aux = pLast;
            aux.setpNext(nuevo);
            pLast = nuevo;
            nuevo.setpNext(pFirst);
        } else {
            pLast = pFirst = nuevo;
        }
        size++;
    }

    public void AddBeginningCL(T datum) {
        Nodo<T> nuevo = new Nodo(datum);
        if (!IsEmpty()) {
            pLast.setpNext(nuevo);
            nuevo.setpNext(pFirst);
            pFirst = nuevo;
        } else {
            pLast = pFirst = nuevo;
        }
        size++;
    }

    public void EliminateBeginningCL() {
        if (!IsEmpty()) {
            Nodo aux = pFirst;
            pFirst = aux.getpNext();
            aux = null;
            pLast.setpNext(pFirst);
        } else {
            pFirst = pLast = null;

        }
        size--;
    }

    public void EliminateEndCL() {
        if (!IsEmpty()) {
            Nodo aux = pFirst;
            Nodo temp = null;
            for (int i = 0; i < size; i++) {
                if (aux.getpNext() != pFirst) {
                    temp = aux;
                    aux = aux.getpNext();
                } else {
                    aux = null;
                    pLast = temp;
                    temp.setpNext(pFirst);
                }
            }
        } else {
            pFirst = pLast = null;

        }
        size--;
    }

    public void AddPosCL(T datum, int pos) {
        Nodo<T> nuevo = new Nodo(datum);
        if (IsEmpty() ||  pos <= 1) {
            AddBeginningCL(datum);
            return;
        } else if (pos >= size + 1) {
            AddEndCL(datum);
            System.out.println("");
            return;
        } else if (!IsEmpty()) {
            Nodo aux = pFirst;
            Nodo temp = aux;
            for (int i = 0; i < size; i++) {
                temp = aux;
                aux = aux.getpNext();
                if (pos - 2 == i) {
                    temp.setpNext(nuevo);
                    nuevo.setpNext(aux);

                }
            }
        }
        size++;
    }

    public void EliminatePosCL(int pos) {
        if (IsEmpty()) {
            pFirst = pLast = null;

        } else if (pos >= size) {
            EliminateEndCL();
            return;
        } else if (pos <= 1) {
            EliminateBeginningCL();
            return;
        } else if (!IsEmpty()) {
            Nodo aux = pFirst;
            Nodo temp;
            for (int i = 0; i < size; i++) {
                temp = aux;
                aux = aux.getpNext();
                if (pos - 2 == i) {
                    aux = aux.getpNext();
                    temp.setpNext(aux);

                }
            }

        }
        size--;
    }
   
    
    
    
    public void PrintC() {
        if (!IsEmpty()) {
            Nodo aux = pFirst;
            for (int i = 0; i < size; i++) {
                System.out.println(aux.getData() + "");
                aux = aux.getpNext();
            }
        }

    }

}
