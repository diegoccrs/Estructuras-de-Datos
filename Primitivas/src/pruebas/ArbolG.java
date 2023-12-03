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
public class ArbolG {

    private NodoAG root;

    public ArbolG() {
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(Object data, NodoAG parent) {
        NodoAG newNode = new NodoAG(data);
        if (!isEmpty()) {
            parent.addSon(newNode);
        }
    }

    public String postOrden(NodoAG root) {
        String toPrint = "";
        if (root != null) {
            NodoAG temp = root.getpSon();
            while (temp != null) {
                toPrint += postOrden(temp);
                temp = temp.getpSib();
            }
            toPrint += root.getData() + ", ";
        }
        return toPrint;

    }

    public String inOrden(NodoAG root) {
        String toPrint = "";
        if (root != null) {
            NodoAG temp = root.getpSon();
            toPrint += inOrden(temp);
            toPrint += root.getData() + ", ";
            while (temp != null) {
                temp = temp.getpSib();
                toPrint += inOrden(temp);
            }

        }
        return toPrint;

    }

    public String preOrden(NodoAG root) {
        String toPrint = "";
        if (root != null) {
            toPrint += root.getData() + ", ";
            toPrint += preOrden(root.getpSon());
            toPrint += preOrden(root.getpSib());
        }
        return toPrint;
    }

    public void create(Object data) {
        NodoAG newNode = new NodoAG(data);
        this.setRoot(newNode);
    }

    public NodoAG search(Object data, NodoAG root) {
        NodoAG found = null;
        if(root != null){
            if(root.getData() == data){
                found = root;
            }else{
                found = search(data, root.getpSon());
                if (found == null) {
                    found = search(data, root.getpSib());
                }
            }
        }
        return found;
    }
    
    public void delete(NodoAG remove,NodoAG newParent ){
        NodoAG sons = remove.getpSon();
        newParent.addSon(sons);
        NodoAG parent = this.getParent(remove.getData(), this.getRoot());
        if (remove.getData() == parent.getpSon().getData()) {
            parent.setpSon(remove.getpSib());
        }else{
            NodoAG temp = parent.getpSon();
            NodoAG sib = temp;
            while(temp!= null){
                if (temp.getData()== remove.getData()) {
                    sib.setpSib(remove.getpSib());
                }
                sib = temp;
                temp = temp.getpSib();
            }
        }
    }
    
    public void deleteLeaf(NodoAG remove){
        NodoAG parent = this.getParent(remove.getData(), this.getRoot());
        if (remove.getData() == parent.getpSon().getData()) {
            parent.setpSon(remove.getpSib());
        }else{
            NodoAG temp = parent.getpSon();
            NodoAG sib = temp;
            while(temp!= null){
                if (temp.getData()== remove.getData()) {
                    sib.setpSib(remove.getpSib());
                }
                sib = temp;
                temp = temp.getpSib();
            }
        }
    }
    
    public NodoAG getParent(Object data, NodoAG parent){
        NodoAG found = null;
        if (parent!= null) {
            NodoAG sib = parent.getpSon();
            while(sib!= null){
                if (sib.getData() == data) {
                    found=parent;
                }
                if (found== null) {
                    found = this.getParent(data, sib);
                }
                sib =sib.getpSib();
            }
        }
        return found;
    }
    
    public boolean isLeaf(NodoAG idNodo){
        return idNodo.getpSon() == null;
    }
    
    public boolean hasSibling(NodoAG idNodo){
        return idNodo.getpSib() == null;
    }
        
        

    public NodoAG getRoot() {
        return root;
    }

    public void setRoot(NodoAG root) {
        this.root = root;
    }

}
