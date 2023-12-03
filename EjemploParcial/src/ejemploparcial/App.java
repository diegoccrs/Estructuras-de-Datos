/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploparcial;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class App {
    
    private Pregrado materiasPregrado[] = new Pregrado[10];
    private int  contadorPregrado = 0;
    
    private Postgrado materiasPostgrado[] = new Postgrado[10];
    private int  contadorPostgrado = 0;
    
    private Estudiante estudiantes[] = new Estudiante[10];
    private int  contadorEstudiantes = 0;
    
    private Inscripcion inscripciones[] = new Inscripcion[10];
    private int contadorInscripcion = 0;
    
    
    public void menu(){
        boolean salir = false;
        
        while (!salir) {
            String menuOption = Utils.askStringInput("Ingrese una opción: \n 1-Registrar una materia \n 2-Inscribir un estudiante \n 3- Estadisiticas \n Otro para Salir");
            
            if (menuOption.equals("1")) {
                //registrar materia
                registrarMateria();
            }else if (menuOption.equals("2")) {
                //incribir estudiante
                inscribirEstudiante();
            }else if (menuOption.equals("3")) {
                //mostar estadisticas
                mostrarEstadisticas();
            }else{
                salir = true;
            }
        
        }
    
    }
    
    public void inscribirEstudiante() {
        
        Estudiante newEstudiante = Estudiante.registrarEstudiante();
        estudiantes[contadorEstudiantes] = newEstudiante;
        contadorEstudiantes +=1;
        
        //inscribir
        
        int numMaterias = Utils.askNumberInput("Cuantas materias desea inscribir");
        Materia materiasInscritas[] = new Materia[5];
        
        for (int i = 0; i < numMaterias; i++) {
            String listaMaterias = getListaMaterias(newEstudiante.getNivelEstudio());
            int materiaIdx = Utils.askNumberInput("Ingrese el numero de la materia \n" + listaMaterias);
            
            if (newEstudiante.getNivelEstudio().equals("pregrado")) {
                
                materiasInscritas[i] = materiasPregrado[materiaIdx];
            }else  {
                
                materiasInscritas[i] = materiasPostgrado[materiaIdx];
            }
        }
        inscripciones[contadorInscripcion] = new Inscripcion(newEstudiante, materiasInscritas);
        contadorInscripcion++;
    }
    
    public String getListaMaterias(String nivelEstudio) {
        
        String listaMaterias = "";
        
        if (nivelEstudio.equals("pregrado")) {
            for (int i = 0; i < contadorPregrado; i++) {
                listaMaterias = listaMaterias.concat(i+ " - "+materiasPregrado[i].getNombre()+"\n");
                
            }
        }else{
            for (int i = 0; i < contadorPostgrado; i++) {
                listaMaterias = listaMaterias.concat(i+ " - "+materiasPostgrado[i].getNombre()+"\n");
        }
 
        }
        return listaMaterias;

    }
    
    public void mostrarEstadisticas() {
        cantidadEstudiantesInscritos();
    }
    
    public void cantidadEstudiantesInscritos(){
        int contPregrado = 0;
        int contPostgrado = 0;
        
        for (Inscripcion inscripcion: inscripciones) {
            if (inscripcion == null){
                continue;
            }
            
            if (inscripcion.getEstudiante().getNivelEstudio().equals("pregrado")){
                contPregrado  += 1;
            }else{
                contPostgrado += 1;
            }
        }
        JOptionPane.showMessageDialog(null, "Estudiantes pregrado: "+ contPregrado+ "\n"+ "Estudiantes postgrado: "+contPostgrado);
    }

    public void registrarMateria() {
        String nivelEstudio = Utils.askNivelEstudio();
        String nombre = Utils.askStringInput("Nombre de la materia: ");
        int creditos = Utils.askNumberInput("Numero de creditos de la materia: ");
        
        if (nivelEstudio.equals("pregrado")) {
            
             String departamento = Utils.askStringInput("Departamento: ");
             Pregrado newMateriaPregrado = new Pregrado(nombre,creditos,departamento);
             materiasPregrado[contadorPregrado] = newMateriaPregrado;
             contadorPregrado +=1;
             
         
        }else{
            
            String diplomado = Utils.askStringInput("Diplomado: ");
            Postgrado newMateriaPostgrado = new Postgrado(nombre,creditos,diplomado);
            materiasPostgrado[contadorPostgrado] = newMateriaPostgrado;
            contadorPostgrado +=1;
        
        }
    
    }
}
