/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepa2;

/**
 *
 * @author User
 */
public class Lista {
    private Nodo pfirst;
    private Nodo plast;
    private int size;

    public Lista() {
        this.pfirst = null;
        this.plast = null;
        this.size = 0;
    }
    
    public boolean EsVacio(){
        return pfirst==null;
    }
    
    public void InsertarFinal(Object data){
        Nodo nuevo = new Nodo(data);
        if (EsVacio()){
            pfirst = nuevo;
            plast = nuevo;
        }else{
            Nodo aux= plast;
            aux.setpNext(nuevo);
            plast = nuevo;
        }size+=1;
    }
    
    public void Imprimir(){
        if(!EsVacio()){
            Nodo aux=pfirst;
            for (int i = 0; i < size; i++) {
                System.out.println(aux.getElement()+" ");
                aux=aux.getpNext();
                
            }
        }else{
            System.out.println("La lista esta vacia");
        }
    }
    
    public void EliminarInicio(){
        if(!EsVacio()){
            pfirst=pfirst.getpNext();
            size= size-1;
        }
    }

    public Nodo getPfirst() {
        return pfirst;
    }

    public void setPfirst(Nodo pfirst) {
        this.pfirst = pfirst;
    }

    public Nodo getPlast() {
        return plast;
    }

    public void setPlast(Nodo plast) {
        this.plast = plast;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
    
    
    
}
