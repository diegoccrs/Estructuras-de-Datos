package ejerciciosecciones;

public class Main {
    
    static public void buscarSeccion(Lista<Seccion> secciones, String salon){
        Nodo<Seccion> current = secciones.head;
        while(current != null){
            if(current.data.salon.equals(salon)){
                current.data.print();
                return;
            }
            current = current.next;
        }
        System.out.println("Este salon no existe");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista<Seccion> secciones = new Lista<>();
        Seccion C1 = new Seccion("1", "Juanito", "Estructura de Datos");
        Seccion C2 = new Seccion("2", "Juanito 2", "Sistemas Operativos");
        
        Estudiante e1 = new Estudiante("Victor");
        Estudiante e2 = new Estudiante("Maria");
        
        secciones.insert(C1);
        secciones.insert(C2);
        
        C1.agregarEstudiante(e1);
        C1.agregarEstudiante(e2);
        C2.agregarEstudiante(e1);
        
        buscarSeccion(secciones, "1");
        
        }
        
}