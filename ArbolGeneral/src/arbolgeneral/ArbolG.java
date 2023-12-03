package arbolgeneral;

public class ArbolG {
    private Nodo root;
    private int size;

    public ArbolG(Object valor) {
        this.root = new Nodo(valor);
        this.size = 0;
    }
    
    public ArbolG() {
        this.root = null;
        this.size = 0;
    }
   
    public Nodo getRoot() {return root;}

    public void setRoot(Nodo root) {this.root = root;}

    public int getSize() {return size;}

    public void setSize(int size) {this.size = size;}
    
    public boolean EsVacio (){
        return root== null;
    }
    
    public void Insertar(Nodo padre, Object valor)
    {
        Nodo hijo = new Nodo(valor);
        if(padre!=null)
        {
            if (padre.getHijoIzq()==null)
            {
                padre.setHijoIzq(hijo);
                setSize(getSize()+1);
            }else
            {
                Nodo aux=padre.getHijoIzq();
                while (aux.getHermanoDer()!=null)
                {
                    aux=aux.getHermanoDer();
                }
                aux.setHermanoDer(hijo);
                setSize(getSize()+1);
            }
        }else
        {
            if(EsVacio())
            {
                setRoot(hijo);
            }else
            {
                System.out.println("No se puede introducir");
            }
        }
    }
    
     public String Preorden(Nodo root,String cadena)//    PROBAR DEVOLVIENDO LA CADENA
    {
        if(root!=null)
        {
            cadena=cadena+root.getDato();
            cadena=Preorden(root.getHijoIzq(),cadena);
            cadena=Preorden(root.getHermanoDer(),cadena);
        }
        return cadena;
    }
    
   

    public Nodo Buscar(Nodo root, Object valor)
    {
        Nodo buscado;
        if(root!=null)
        {
            if(root.getDato()==valor)
            {
                buscado=root;
            }else
            {
                buscado=Buscar(root.getHijoIzq(),valor);
                if(buscado==null)
                {
                    buscado=Buscar(root.getHermanoDer(),valor);
                }
            }
        }else
        {
            buscado=null;
        }
        return buscado;
    }

    
}