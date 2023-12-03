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
public class NodoBST {
    private int data;
    private NodoBST left;
    private NodoBST right;
    
    
    public NodoBST(int data) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
    
    public boolean hasLeft(){
        return this.getLeft() != null;
    }
    public boolean hasRight(){
        return this.getRight() != null;
    }
    
    
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodoBST getLeft() {
        return left;
    }

    public void setLeft(NodoBST left) {
        this.left = left;
    }

    public NodoBST getRight() {
        return right;
    }

    public void setRight(NodoBST right) {
        this.right = right;
    }
    
    /**
     * Checks whether a node is leaf or not
     *
     * @return
     */
    public boolean isLeaf() {
        return (this.left == null && this.right == null);
    }

    /**
     * Prints the node content
     */
    public void printNode() {
        System.out.println(this.data);
    }
}
