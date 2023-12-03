package binariodebusqueda;

public class Nodo {
       private int data;
    private Nodo left;
    private Nodo right;
    
    
    public Nodo(int data) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Nodo getLeft() {
        return left;
    }

    public void setLeft(Nodo left) {
        this.left = left;
    }

    public Nodo getRight() {
        return right;
    }

    public void setRight(Nodo right) {
        this.right = right;
    }
    
    //CHEQUEA SI EL NODO ES HOJA O NO 
    public boolean isLeaf() {
        return (this.left == null && this.right == null);
    }

    //IMPRIME EL CONTENIDO DEL NODO
    public void printNode() {
        System.out.println(this.data);
    }
}
