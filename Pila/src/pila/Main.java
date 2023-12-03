package pila;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila pila = new Pila();
        
        pila.push(1);
        pila.push(2);
        pila.push(3);
        
        pila.print();
        
        Pila copiaPila = new Pila();
        
        copiaPila = pila.reverse(pila, copiaPila);
        
        copiaPila.print();
    }
    
}