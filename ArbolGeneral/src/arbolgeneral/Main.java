package arbolgeneral;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArbolG hola = new ArbolG (1);
       hola.Insertar(hola.getRoot(), 2);
       hola.Insertar(hola.getRoot(), 3);
       Nodo este= hola.Buscar(hola.getRoot(), 2);
       hola.Insertar(este, 5);
       System.out.println(hola.Preorden(hola.getRoot(), ""));
    }
    
}