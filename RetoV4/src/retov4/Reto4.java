
package retov4;

import clases.Estudiante;
import java.util.ArrayList;
import java.util.Arrays;


public class Reto4 {
    //private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    public static void main(String[] args) {
       ArrayList<Estudiante> grupo = new ArrayList<>();
       //ArrayList<Double> notas = new ArrayList<>();
       grupo.add(new Estudiante("Jhon Doe", "3626578",5.0, 10, 28));
       grupo.add(new Estudiante("Jane Doe", "3626578", 4.1, 13, 28));
       grupo.add(new Estudiante("Pepito Perez", "3626578", 1.5, 12, 28));
       grupo.add(new Estudiante("Fulano de tal", "3626578", 2.3, 11, 28));
      
        Object [] retorno = Estudiante.reportes(grupo);
        System.out.println(Arrays.toString(retorno));
      
      
       
    }
    
}
