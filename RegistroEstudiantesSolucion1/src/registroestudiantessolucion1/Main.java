/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroestudiantessolucion1;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Seccion secc1 = new Seccion("sl-001", "Luis", "EDD");
        Seccion secc2 = new Seccion("sl-002", "Andres", "AyP");

        Estudiante e1 = new Estudiante("Pedro", "Sistemas");
        Estudiante e2 = new Estudiante("Maria", "Sistemas");

        Lista<Estudiante> estudiantesSecc1 = new Lista<Estudiante>();
        
        
        estudiantesSecc1.insertarAlfinal(e2);
        estudiantesSecc1.insertarAlfinal(e1);
        
        secc1.setEstudiantes(estudiantesSecc1);

        Lista<Seccion> misSecciones = new Lista<Seccion>();
        misSecciones.insertarAlfinal(secc1);
        misSecciones.insertarAlfinal(secc2);

        misSecciones.printEstudiantesDadoSalon("sl-001");

    }
 }
    