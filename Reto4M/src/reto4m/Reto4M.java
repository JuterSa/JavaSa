package reto4m;

import java.util.ArrayList;
import java.util.Arrays;

public class Reto4M {
    
    public static void main(String[] args) {
     ArrayList<Estudiante> grupo = new ArrayList<>();
       grupo.add(new Estudiante("Mateo", "3626578", 4.1, 11, 28));
       
        Object [] retorno = Estudiante.reportes(grupo);
        System.out.println(Arrays.toString(retorno));
    }
    
}
