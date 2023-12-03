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
public class BST {

    private NodoBST root;

    public BST() {
        this.root = null;
    }

    public BST(NodoBST node) {
        this.root = node;
    }

    public NodoBST getRoot() {
        return this.root;
    }

    public void setRoot(NodoBST root) {
        this.root = root;
    }

    public void insert(NodoBST root, NodoBST newNode) {
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

    public void insertd(NodoBST root, int data) {
        NodoBST newNode = new NodoBST(data);
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

    public NodoBST search(NodoBST aux, int data) {
        if (aux == null) {
            return null;
        }

        if (aux.getData() == data) {
            return aux;
        } else if (data < aux.getData()) {
            return search(aux.getLeft(), data);
        } else {
            return search(aux.getRight(), data);
        }
    }

    public int getNodeLevel(NodoBST aux, int data, int level) {
        if (aux == null) {
            return -1;
        }

        if (aux.getData() == data) {
            return level;
        } else if (data < aux.getData()) {
            return getNodeLevel(aux.getLeft(), data, level + 1);
        } else {
            return getNodeLevel(aux.getRight(), data, level + 1);
        }
    }

    public boolean isInTheTree(NodoBST aux, int data) {
        if (aux == null) {
            return false;
        }

        if (aux.getData() == data) {
            return true;
        } else {
            return (isInTheTree(aux.getLeft(), data) || isInTheTree(aux.getRight(), data));
        }
    }

    public void inOrder(NodoBST root) {
        if (root != null) {
            inOrder(root.getLeft());
            System.out.print(root.getData() + ",");
            inOrder(root.getRight());
        }
    }

    public void preOrder(NodoBST root) {
        if (root != null) {
            System.out.print(root.getData() + ",");
            inOrder(root.getLeft());
            inOrder(root.getRight());
        }
    }

    public void postOrder(NodoBST root) {
        if (root != null) {
            inOrder(root.getLeft());
            inOrder(root.getRight());
            System.out.print(root.getData() + ",");
        }
    }

    public NodoBST ancestro(NodoBST aux, NodoBST data1, NodoBST data2) {
        NodoBST ancestro = null;
        if (aux == null) {
            return null;
        }

        if (aux.getData() == data1.getData() || aux.getData() == data2.getData()) {
            if (getParent((int) aux.getData(), this.getRoot()) != null) {
                ancestro = getParent((int) aux.getData(), this.getRoot());
            } else {
                ancestro = aux;
            }

        } else if (data1.getData() == data2.getData()) {
            ancestro = this.getParent(data2.getData(), this.root);

        } else if (data1.getData() < aux.getData() && data2.getData() > aux.getData()) {
            return aux;

        } else if (data1.getData() > aux.getData() && data2.getData() < aux.getData()) {
            return aux;

        } else if (data1.getData() < aux.getData() && data2.getData() < aux.getData()) {
            return ancestro(aux.getLeft(), data1, data2);
        } else {
            return ancestro(aux.getRight(), data1, data2);
        }
        return ancestro;

    }

    public NodoBST ancestrod(NodoBST aux, int data1, int data2) {
        NodoBST ancestro = null;
        if (aux == null) {
            return null;
        }

        if (aux.getData() == data1 || aux.getData() == data2) {
            if (getParent((int) aux.getData(), this.getRoot()) != null) {
                ancestro = getParent((int) aux.getData(), this.getRoot());
            } else {
                ancestro = aux;
            }

        } else if (data1 == data2) {
            ancestro = this.getParent(data2, this.root);

        } else if (data1 < aux.getData() && data2 > aux.getData()) {
            return aux;

        } else if (data1 > aux.getData() && data2 < aux.getData()) {
            return aux;

        } else if (data1 < aux.getData() && data2 < aux.getData()) {
            return ancestrod(aux.getLeft(), data1, data2);
        } else {
            return ancestrod(aux.getRight(), data1, data2);
        }
        return ancestro;
    }

    public int ceiling(NodoBST root, int data) {
        NodoBST prueba = this.search(this.getRoot(), data);

        if (prueba != null) {
            return data;
        } else {
            if (root == null) {
                return -1;
            }
            if (root.getData() < data) {
                return ceiling(root.getRight(), data);
            } else {
                int techo = ceiling(root.getLeft(), data);
                if (techo >= data) {
                    return techo;
                }else{
                    return root.getData();
                }
                
            }
        }

    }
    public int floor(NodoBST root, int data) {
        NodoBST prueba = this.search(this.getRoot(), data);

        if (prueba != null) {
            return data;
        } else {
            if (root == null) {
                return -1;
            }
            if (root.getData() > data) {
                return floor(root.getLeft(), data);
            } else {
                int piso = floor(root.getRight(), data);
                if (piso <= data && piso != -1) {
                    return piso;
                }else{
                    return root.getData();
                }
                
            }
        }

    }
    
    public void fandC(NodoBST root, int data){
        int techo = this.ceiling(root, data);
        int piso = this.floor(root, data);
        System.out.println("Data: " + data + "  Piso: " + piso + "  Techo: " + techo);
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
    public NodoBST deleteLeft(NodoBST p) {
        if (p.getLeft() != null) {
            NodoBST aux = p.getLeft();
            p.setLeft(null);
            if (aux.getLeft() != null && aux.getRight() != null) {
                NodoBST aux2 = aux.getLeft();
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

    public NodoBST deleteRoot() {
        NodoBST aux = this.root;
        this.root = null;
        if (aux.getLeft() != null && aux.getRight() != null) {
            this.root = aux.getRight();
            NodoBST aux2 = aux.getRight();
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

    public NodoBST delete(NodoBST p, int data) {
        if (this.root != null && this.root.getData() == data) {
            return deleteRoot();
        } else if (p.getLeft() != null && p.getLeft().getData() == data) {
            return deleteLeft(p);
        } else if (p.getRight() != null && p.getRight().getData() == data) {
            return deleteRight(p);
        }
        return null;
    }

    public NodoBST deleteRight(NodoBST p) {
        if (p.getRight() != null) {
            NodoBST aux = p.getRight();
            p.setRight(null);

            if (aux.getLeft() != null && aux.getRight() != null) {
                NodoBST aux2 = aux.getRight();
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

    public NodoBST getParent(int data, NodoBST root) {
        NodoBST found = null;
        if (root != null) {
            if (root.hasLeft()) {
                if (root.getLeft().getData() == data) {
                    found = root;
                }
            }
            if (root.hasRight()) {
                if (root.getRight().getData() == data) {
                    found = root;
                }
            }

            if (found == null) {
                if (root.getData() > data) {
                    found = getParent(data, root.getLeft());
                } else {
                    found = getParent(data, root.getRight());
                }
            }
        }
        return found;
    }

}
