package arbolbinario;

public class ArbolB {
    private Nodo Root;

    public Nodo getRoot() {
        return Root;
    }

    public ArbolB() {
        this.Root = null;
    }

    public ArbolB(Nodo raiz) {
        Root = raiz;
    }

    public void InsertarRoot(Object dato) {
        Root = new Nodo(dato);
    }

    public boolean EsVacio(Nodo node) {
        return node == null;
    }

    public void InsertarIzq(int padre, int valor) {
        Nodo temp = Buscar(Root, padre);
        Nodo hijoIzq = new Nodo(valor, temp);
        temp.setHijoIzq(hijoIzq);
    }

    public void InsertarDer(int padre, int valor) {
        Nodo temp = Buscar(Root, padre);
        Nodo hijoDer = new Nodo(valor, temp);
        temp.setHijoDer(hijoDer);
    }

    public void Preorden(Nodo root) {
        if (root != null) {
            System.out.print(root.getDato() + " ");
            Preorden(root.getHijoIzq());
            Preorden(root.getHijoDer());
        }
    }

    public void Posorden(Nodo root) {
        if (root != null) {
            Posorden(root.getHijoIzq());
            Posorden(root.getHijoDer());
            System.out.print(root.getDato() + " ");
        }
    }

    public void Inorden(Nodo root) {
        if (root != null) {
            Inorden(root.getHijoIzq());
            System.out.print(root.getDato() + " ");
            Inorden(root.getHijoDer());
        }
    }

    public Nodo Buscar(Nodo mynode, int valor) {
        Nodo buscado = null;
        if (mynode != null && EsVacio(Root) == false) {
            if ((int) mynode.getDato() == valor) {
                return mynode;
            }
            if (mynode.getHijoIzq() != null) {
                buscado = Buscar(mynode.getHijoIzq(), valor);
            }
            if (buscado == null) {
                buscado = Buscar(mynode.getHijoDer(), valor);
            }
            return buscado;
        } else {
            return null;
        }

    }

    public Nodo Padre(Nodo mynode, Nodo root) {
        if (root == null || mynode == null) {
            return null;
        } else if ((root.getHijoDer() != null && root.getHijoDer() == mynode) || (root.getHijoIzq() != null && root.getHijoIzq() == mynode)) {
            return root;
        } else {
            Nodo encontrado = Padre(mynode, root.getHijoIzq());
            if (encontrado == null) {
                encontrado = Padre(mynode, root.getHijoDer());
            }
            return encontrado;
        }
    }

    public int Size(Nodo root) {
        if (root == null) {
            return 0;
        }
        return Math.max(Size(root.getHijoIzq()), Size(root.getHijoDer())) + 1;
    }

    public boolean EsHoja(int num) {
        Nodo mynode = Buscar(Root, num);
        return mynode.getHijoDer() == null && mynode.getHijoIzq() == null;
    }

    public void Borrar(int num) {
        Nodo borrar = Buscar(Root, num);
        BorrarNodo(borrar, Root);
    }

    public Nodo Sucesor(Nodo mynode) {
        if (mynode.getHijoIzq() != null) {
            return Sucesor(mynode.getHijoIzq());
        } else {
            return mynode;
        }

    }

    public void BorrarNodo(Nodo aborrar, Nodo root) {
        Nodo padre;
        if (!EsVacio(aborrar)) {
            if (aborrar.getHijoIzq() == null) {
                if (aborrar == root) {
                    root = aborrar.getHijoDer();
                } else {
                    padre = Padre(aborrar, root);
                    if (padre.getHijoIzq() == aborrar) {
                        padre.setHijoIzq(aborrar.getHijoDer());
                    } else {
                        padre.setHijoDer(aborrar.getHijoDer());
                    }
                }

            } else {
                if (aborrar.getHijoDer() == null) {
                    if (aborrar == root) {
                        root = aborrar.getHijoIzq();
                    } else {
                        padre = Padre(aborrar, root);
                        if (padre.getHijoIzq() == aborrar) {
                            padre.setHijoIzq((aborrar.getHijoIzq()));
                        } else {
                            padre.setHijoDer(aborrar.getHijoIzq());
                        }
                    }
                } else {
                    Nodo sucesor = Sucesor(aborrar);
                    padre = Padre(sucesor, Root);
                    if (aborrar == padre) {
                        padre.setHijoDer(sucesor.getHijoDer());
                    } else {
                        padre.setHijoIzq(sucesor.getHijoDer());
                    }

                }
            }
        }
    }

}
