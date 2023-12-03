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
public class Lista<T> {

    private Nodo<T> pFirst;
    private Nodo<T> pLast;
    private int size;

    public Lista() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }

    public Lista(Nodo<T> nuevo) {
        this.pFirst = this.pLast = nuevo;
    }

    public boolean IsEmpty() {
        return pFirst == null;

    }

    public void AddEndL(T datum) {
        Nodo<T> nuevo = new Nodo(datum);
        if (!IsEmpty()) {
            Nodo aux = pLast;
            aux.setpNext(nuevo);
            pLast = nuevo;

        } else {
            pFirst = nuevo;
            pLast = nuevo;
        }
        size++;
    }

    public void AddEnd(T datum) {
        Nodo<T> nuevo = new Nodo(datum);
        if (!IsEmpty()) {
            Nodo aux = pFirst;
            for (int i = 0; i < size; i++) {
                if (aux.getpNext() != null) {
                    aux = aux.getpNext();
                } else {
                    aux.setpNext(nuevo);
                }

            }

        } else {
            pFirst = nuevo;
        }
        size++;

    }

    public void AddBeginningL(T datum) {
        Nodo<T> nuevo = new Nodo(datum);
        if (!IsEmpty()) {
            nuevo.setpNext(pFirst);
            pFirst = nuevo;
        } else {
            pFirst = nuevo;
            pLast = nuevo;
        }
        size++;

    }

    /**
     *
     * @param data
     */
    public void AddBeginning(T datum) {
        Nodo<T> nuevo = new Nodo(datum);
        if (!IsEmpty()) {
            nuevo.setpNext(pFirst);
            pFirst = nuevo;
        } else {
            pFirst = nuevo;

        }
        size++;

    }

    public void Print() {
        if (IsEmpty()) {
            System.out.println("Vacia");
        } else {
            Nodo aux = this.pFirst;
            while (aux != null) {
                System.out.println(aux.getData());
                aux = aux.getpNext();
            }
            System.out.println("");
        }
    }

    public void EliminateBeginningL() {
        if (!IsEmpty()) {
            Nodo aux = pFirst;
            pFirst = aux.getpNext();
            aux = null;
        } else {
            pFirst = pLast = null;

        }
        size--;
    }

    public void EliminateBeginning() {
        if (!IsEmpty()) {
            pFirst = pFirst.getpNext();
        } else {
            pFirst = null;

        }
        size--;
    }

    public void EliminateEndL() {
        if (IsEmpty()) {
            pFirst = pLast = null;
        } else {
            Nodo<T> aux = pFirst;

            while (aux.getpNext().getpNext() != null) {
                aux = aux.getpNext();
            }
            pLast = aux;
            aux.setpNext(null);

        }
        size--;

    }

    public void EliminateEnd() {
        if (IsEmpty()) {
            pFirst = null;
        } else {
            Nodo<T> aux = pFirst;

            while (aux.getpNext().getpNext() != null) {
                aux = aux.getpNext();
            }
            pLast = aux;
            aux.setpNext(null);

        }
        size--;
    }

    public void AddPosL(T datum, int i) {
        if (IsEmpty() || i <= 1) {
            this.AddBeginningL(datum);
            return;
        } else if (i >= (size + 1)) {
            this.AddEndL(datum);
            return;
        } else {
            Nodo<T> n = new Nodo(datum);
            Nodo<T> aux = this.pFirst; // Nodo previo
            int count = 0;
            while (count < i - 2) {
                aux = aux.getpNext();
                count++;
            }
            n.setpNext(aux.getpNext());
            aux.setpNext(n);
        }
        size++;

    }

    public void AddPos(T datum, int i) {
        if (IsEmpty() || i <= 1) {
            this.AddBeginning(datum);
            return;
        } else if (i >= (size + 1)) {
            this.AddEnd(datum);
            return;
        } else {
            Nodo<T> n = new Nodo(datum);
            Nodo aux = this.pFirst; // Nodo previo
            int count = 0;
            while (count < i - 2) {
                aux = aux.getpNext();
                count++;
            }
            n.setpNext(aux.getpNext());
            aux.setpNext(n);
        }
        size++;

    }

    public void EliminatePosL(int pos) {
        if (IsEmpty()) {
            pFirst = pLast = null;

        } else if (pos >= size) {
            EliminateEndL();
            return;
        } else if (pos <= 1) {
            EliminateBeginningL();
            return;
        } else if (!IsEmpty()) {
            Nodo<T> aux = pFirst;
            Nodo<T> temp = null;

            int count = 0;
            while (count < pos - 1) {
                temp = aux;
                aux = aux.getpNext();
                count++;
            }
            aux = aux.getpNext();
            temp.setpNext(aux);

        }
        size--;
    }

    public void EliminatePos(int pos) {
        if (IsEmpty()) {
            pFirst = null;

        } else if (pos >= size) {
            EliminateEndL();
            return;
        } else if (pos <= 1) {
            EliminateBeginningL();
            return;
        } else if (!IsEmpty()) {
            Nodo<T> aux = pFirst;
            Nodo<T> temp = null;

            int count = 0;
            while (count < pos - 1) {
                temp = aux;
                aux = aux.getpNext();
                count++;
            }
            aux = aux.getpNext();
            temp.setpNext(aux);

        }
        size--;
    }

    public boolean Search(T Dato) {
        boolean result = false;
        Nodo<T> aux = pFirst;
        while (aux.getpNext() == null) {

            if (aux.getData() == Dato) {
                result = true;

            }
            aux = aux.getpNext();
        }
        return result;
    }

    public void Reverse() {
        if (IsEmpty()) {
            return;
        } else {
            Nodo<T> aux = pFirst;
            Nodo<T> prev = null;
            Nodo<T> next = null;
            while (aux != null) {
                next = aux.getpNext();
                aux.setpNext(prev);
                prev = aux;
                aux = next;
            }
            pFirst = prev;
            Nodo<T> aux2 = pFirst;
            while (aux2.getpNext() != null) {
                aux2 = aux2.getpNext();
            }
            pLast = aux2;

        }

    }

    public Lista Copiar() {
        Nodo<T> aux = pFirst;
        Lista ListaCopia = new Lista();
        if (IsEmpty()) {
            return null;
        } else {
            for (int i = 0; i < size; i++) {
                ListaCopia.AddEndL(aux.getData());
                aux = aux.getpNext();
            }
        }
        return ListaCopia;
    }

}
