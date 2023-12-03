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
public class Nododoble<T> {

    private T data;
    private Nododoble pNext;
    private Nododoble pPrev;

    public Nododoble(T datum) {
        this.data = datum;
        this.pNext = null;
        this.pPrev = null;

    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Nododoble getpNext() {
        return pNext;
    }

    public void setpNext(Nododoble pNext) {
        this.pNext = pNext;
    }

    public Nododoble getpPrev() {
        return pPrev;
    }

    public void setpPrev(Nododoble pPrev) {
        this.pPrev = pPrev;
    }

}
