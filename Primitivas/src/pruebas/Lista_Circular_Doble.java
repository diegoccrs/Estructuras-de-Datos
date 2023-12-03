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
public class Lista_Circular_Doble {
    private Nododoble pFirst;
    private Nododoble pLast;
    private int size;

    public Lista_Circular_Doble() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }

    

    public boolean IsEmpty() {
        return pFirst == null;
    }

    public void AddEndCDL(Object data) {
        Nododoble nuevo = new Nododoble(data);
        if (!IsEmpty()) {
            pLast.setpNext(nuevo);
            nuevo.setpPrev(pLast);
            nuevo.setpNext(pFirst);
            pFirst.setpPrev(nuevo);
            pLast = nuevo;

        } else {
            pFirst = pLast = nuevo;
        }
        size++;
    }
}
