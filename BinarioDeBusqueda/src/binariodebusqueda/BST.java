package binariodebusqueda;

public class BST {
      private Nodo root;

    public BST() {
        this.root = null;
    }
    
    public BST(Nodo node) {
        this.root = node;
    }

    public Nodo getRoot() {
        return this.root;
    }

    public void setRoot(Nodo root) {
        this.root = root;
    }
    
    public void insert(Nodo root, Nodo newNode) {
        if (this.root == null) {
            this.root = newNode;
        } else {
            if (newNode.getData() < root.getData()) {
                if (root.getLeft() == null) {
                    root.setLeft(newNode);
                } else {
                    insert(root.getLeft(), newNode);
                }
            } else if (newNode.getData() > root.getData()) {
                if (root.getRight() == null) {
                    root.setRight(newNode);
                } else {
                    insert(root.getRight(), newNode);
                }
            } else {
                System.out.println("El elemento ya se encuentra en el Árbol");
            }
        }
    }
    
    
    public Nodo search(Nodo aux, int data) {
        if (aux == null) return null;
        
        if (aux.getData() == data) {
            return aux;
        } else if(data < aux.getData()) {
            return search(aux.getLeft(), data);
        } else {
            return search(aux.getRight(), data);
        }
    }
    
    public int getNodeLevel(Nodo aux, int data, int level) {
        if (aux == null) return -1;
        
        if (aux.getData() == data) {
            return level;
        } else if (data < aux.getData()) {
            return getNodeLevel(aux.getLeft(), data, level + 1);
        } else {
            return getNodeLevel(aux.getRight(), data, level + 1);
        }
    }
    
    
    public boolean isInTheTree(Nodo aux, int data) {
        if (aux == null) return false;
        
        if (aux.getData() == data) 
            return true;
        else
            return (isInTheTree(aux.getLeft(), data) || isInTheTree(aux.getRight(), data));
    }
    
    
    public void inOrder(Nodo root) {
        if (root != null) {
            inOrder(root.getLeft());
            System.out.print(root.getData() + ",");
            inOrder(root.getRight());
        }
    }
    
    public void preOrder(Nodo root) {
        if (root != null) {
            System.out.print(root.getData() + ",");
            inOrder(root.getLeft());
            inOrder(root.getRight());
        }
    }
    
    public void postOrder(Nodo root) {
        if (root != null) {
            inOrder(root.getLeft());
            inOrder(root.getRight());
            System.out.print(root.getData() + ",");
        }
    }
    

    /**
     * ========================================================================
     * METODOS DE BORRADOS, ESTOS NO LOS VOY A EVALUAR
     * ========================================================================
     */
    
    /**
     * SuprimeIzq Metodo para borrar el hijo izquerdo del nodo p
     *
     * @param p
     * @return
     */
    public Nodo deleteLeft(Nodo p) {
        if (p.getLeft() != null) {
            Nodo aux = p.getLeft();
            p.setLeft(null);
            if (aux.getLeft() != null && aux.getRight() != null) {
                Nodo aux2 = aux.getLeft();
                p.setLeft(aux.getLeft());
                while (aux2.getRight() != null) {
                    aux2 = aux2.getRight();
                }
                aux2.setRight(aux.getRight());
            } else if (aux.getLeft() != null) {
                p.setLeft(aux.getLeft());
            } else if (aux.getRight() != null) {
                p.setLeft(aux.getRight());
            }
            return aux;
        }
        return null;

    }


    public Nodo deleteRoot() {
        Nodo aux = this.root;
        this.root = null;
        if (aux.getLeft() != null && aux.getRight() != null) {
            this.root = aux.getRight();
            Nodo aux2 = aux.getRight();
            while (aux2.getLeft() != null) {
                aux2 = aux2.getLeft();
            }
            aux2.setLeft(aux.getLeft());
            return aux;
        } else if (aux.getLeft() != null) {
            this.root = aux.getLeft();
            return aux;
        } else if (aux.getRight() != null) {
            this.root = aux.getRight();
            return aux;
        }
        return null;
    }

    public Nodo delete(Nodo p, int data) {
        if (this.root != null && this.root.getData() == data) {
            return deleteRoot();
        } else if (p.getLeft() != null && p.getLeft().getData() == data) {
            return deleteLeft(p);
        } else if (p.getRight() != null && p.getRight().getData() == data) {
            return deleteRight(p);
        }
        return null;
    }

    public Nodo deleteRight(Nodo p) {
        if (p.getRight() != null) {
            Nodo aux = p.getRight();
            p.setRight(null);

            if (aux.getLeft() != null && aux.getRight() != null) {
                Nodo aux2 = aux.getRight();
                p.setRight(aux.getRight());
                while (aux2.getLeft() != null) {
                    aux2 = aux2.getLeft();
                }
                aux2.setLeft(aux.getLeft());
            } else if (aux.getLeft() != null) {
                p.setRight(aux.getLeft());
            } else if (aux.getRight() != null) {
                p.setRight(aux.getRight());
            }
            return aux;
        }
        return null;
    }
}