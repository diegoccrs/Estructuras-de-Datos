package arbolbinario;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolB mytree = new ArbolB();
        mytree.InsertarRoot(10);
        // inserta a la derecha
        mytree.InsertarDer(10, 16);
        //inserta a la izquierda
        mytree.InsertarIzq(10, 5);
        // como quiero volver a la izquierda del 10 se sustituye el 5 por el 6
        mytree.InsertarIzq(10, 6);
        mytree.Preorden(mytree.getRoot());
    }

}