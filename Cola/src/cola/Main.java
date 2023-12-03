package cola;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cola cola = new Cola();
        
        cola.encolar(1);
        cola.encolar(2);
        cola.encolar(3);
        
        cola.print();
        
        cola.reverse();
        
        Cola copiaCola = new Cola();
        copiaCola = cola.copy();
        
        copiaCola.print();
        
        
    }
    
}