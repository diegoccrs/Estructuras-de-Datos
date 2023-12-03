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
public class Lista_Doble<T> {

    private Nododoble<T> pFirst;
    private Nododoble<T> pLast;
    private int size;

    public Lista_Doble() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;

    }

    public Lista_Doble(Nododoble<T> nuevo) {
        this.pFirst = this.pLast = nuevo;
    }

    public boolean IsEmpty() {
        return pFirst == null;
    }

    public void AddEndDL(T datum) {
        Nododoble<T> nuevo = new Nododoble(datum);
        if (!IsEmpty()) {
            pLast.setpNext(nuevo);
            nuevo.setpPrev(pLast);
            pLast = nuevo;

        } else {
            pFirst = pLast = nuevo;
        }
        size++;
    }

    public void AddEndD(T datum) {
        Nododoble<T> nuevo = new Nododoble(datum);
        Nododoble aux = pFirst;
        if (!IsEmpty()) {
            for (int i = 0; i < size; i++) {
                if (aux.getpNext() != null) {
                    aux = aux.getpNext();
                } else {
                    aux.setpNext(nuevo);
                    nuevo.setpPrev(aux);
                }
            }
        } else {
            pFirst = nuevo;
        }
        size++;
    }

    public void AddBeginningDL(T datum) {
        Nododoble<T> nuevo = new Nododoble(datum);
        if (!IsEmpty()) {
            nuevo.setpNext(pFirst);
            pFirst.setpPrev(nuevo);
            pFirst = nuevo;
        } else {
            pLast = pFirst = nuevo;

        }
        size++;
    }

    public void AddBeginningD(T datum) {
        Nododoble<T> nuevo = new Nododoble(datum);
        if (!IsEmpty()) {
            nuevo.setpNext(pFirst);
            pFirst.setpPrev(nuevo);
            pFirst = nuevo;
        } else {
            pFirst = nuevo;

        }
        size++;
    }

    public void EliminateEndDL() {
        if (!IsEmpty()) {
            Nododoble aux = pLast;
            aux = aux.getpPrev();
            aux.setpNext(null);
            pLast.setpPrev(null);
            pLast = aux;

        } else {
            pLast = pFirst = null;
        }
        size--;

    }

    public void EliminateEndD() {
        Nododoble aux = pFirst;
        Nododoble temp = null;
        if (!IsEmpty()) {
            for (int i = 0; i < size; i++) {
                if (aux.getpNext() != null) {
                    aux = aux.getpNext();
                } else {
                    aux.getpPrev();
                    aux.setpNext(temp);
                    temp.setpPrev(null);
                    aux.setpNext(null);
                }
            }
        } else {
            pFirst = null;
        }
        size--;
    }

    public void EliminateBeginningDL() {
        if (!IsEmpty()) {
            Nododoble aux = pFirst;
            pFirst = pFirst.getpNext();
            aux.setpNext(null);
            pFirst.setpPrev(null);
        } else {
            pFirst = pLast = null;
        }
        size--;
    }

    public void EliminateBeginningD() {
        if (!IsEmpty()) {
            Nododoble aux = pFirst;
            pFirst = pFirst.getpNext();
            aux.setpNext(null);
            pFirst.setpPrev(null);
        } else {
            pFirst = null;
        }
        size--;
    }

    public void AddPosDL(T datum, int pos) {
        Nododoble<T> nuevo = new Nododoble(datum);
        if (IsEmpty() || pos <= 1) {
            AddBeginningDL(datum);
            return;
        } else if (pos >= size + 1) {
            AddEndDL(datum);
            return;
        } else if (!IsEmpty()) {
            Nododoble aux = pFirst;
            Nododoble temp;
            for (int i = 0; i < size; i++) {
                aux = aux.getpNext();
                if (pos - 2 == i) {
                    temp = aux.getpPrev();
                    temp.setpNext(nuevo);
                    nuevo.setpPrev(temp);
                    nuevo.setpNext(aux);
                    aux.setpPrev(nuevo);
                }
            }
        }
        size++;
    }

    public void EliminatePosDL(int pos) {
        if (IsEmpty() || pos <= 1) {
            EliminateBeginningDL();
            return;
        } else if (pos >= size) {
            EliminateEndDL();
            return;
        } else if (!IsEmpty()) {
            Nododoble aux = pFirst;
            Nododoble temp;
            for (int i = 0; i < size; i++) {
                aux = aux.getpNext();
                if (pos - 2 == i) {
                    temp = aux.getpPrev();
                    aux = aux.getpNext();
                    temp.setpNext(aux);
                    aux.setpPrev(temp);

                    size--;
                    return;
                }
            }
        }

    }

    public void ReverseD() {
        if (IsEmpty()) {
            return;
        } else {
            Nododoble<T> aux = pFirst;
            Nododoble<T> next = aux.getpNext();
            aux.setpNext(null);
            aux.setpPrev(next);
            while (next != null) {

                next.setpPrev(next.getpNext());
                next.setpNext(aux);
                aux = next;
                next = next.getpPrev();
            }
            pFirst = aux;
            Nododoble<T> aux2 = pFirst;
            while (aux2.getpNext() != null) {
                aux2 = aux2.getpNext();
            }
            pLast = aux2;

        }

    }

    public void PrintD() {
        if (!IsEmpty()) {
            Nododoble aux = pFirst;
            for (int i = 0; i < size; i++) {
                System.out.println(aux.getData() + "");
                aux = aux.getpNext();
            }
        }

    }

}
