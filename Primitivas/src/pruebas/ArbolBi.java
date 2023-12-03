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
public class ArbolBi {
    private NodoBi root;

    public ArbolBi(NodoBi root) {
        this.root = root;
    }

    public ArbolBi() {
        this.root = null;
    }

    public NodoBi getRoot() {
        return root;
    }

    public void setRoot(NodoBi root) {
        this.root = root;
    }

    public boolean esVacio(NodoBi node) {
        return node == null;
    }
    
    public void vaciar(){
        this.root = null;
    }

    public NodoBi buscar(NodoBi myNode, int valor) {
        NodoBi buscando = null;
        if (myNode != null && !(this.esVacio(root))) {

            if ((int) myNode.getDato() == valor) {
                return myNode;
            }
            if (myNode.getDato() != null) {
                buscando = buscar(myNode.getHijoIzq(), valor);
            }
            if (buscando == null) {
                buscando = buscar(myNode.getHijoDer(), valor);

            }
            return buscando;

        } else {
            return null;
        }

    }

    public void insertarIzq(int padre, int valor) {
        NodoBi temp = buscar(root, padre);
        NodoBi hijoIzq = new NodoBi(valor, temp);
        temp.setHijoIzq(hijoIzq);

    }

    public void insertarDer(int padre, int valor) {
        NodoBi temp = buscar(root, padre);
        NodoBi hijoDer = new NodoBi(valor, temp);
        temp.setHijoIzq(hijoDer);

    }

    public void preOrden(NodoBi root) {
        if (root != null) {
            System.out.println(root.getDato() + ",");
            preOrden(root.getHijoIzq());
            preOrden(root.getHijoDer());
        }

    }

    public void inOrden(NodoBi root) {
        if (root != null) {
            inOrden(root.getHijoIzq());
            System.out.println(root.getDato() + ",");
            inOrden(root.getHijoDer());
        }

    }
    public void postOrden(NodoBi root) {
        if (root != null) {
            postOrden(root.getHijoIzq());
            postOrden(root.getHijoDer());
            System.out.println(root.getDato() + ",");
        }

    }
}
