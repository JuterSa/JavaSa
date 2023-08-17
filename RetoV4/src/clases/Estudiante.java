
package clases;

import java.util.ArrayList;
import javax.naming.event.ObjectChangeListener;

public class Estudiante {
    private String nombreCompleto;
    private String documentoIdentidad;
    private double nota;
    private int grado;
    private int edad;
    
    public Estudiante(String nombreCompleto, String documentoIdentidad, double nota, int grado, int edad) {
        this.nombreCompleto = nombreCompleto;
        this.documentoIdentidad = documentoIdentidad;
        this.nota = nota;
        this.grado = grado;
        this.edad = edad;
    }
    
    //

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
   
   ///////////////////////////////////////////
  
    public static Object[] reportes(ArrayList<Estudiante> grupo) {
   //EN ESTE ESPACIO PONER SU LÓGICA
        ArrayList<Object> reportes = new ArrayList<>();
        double porcentaje =0;
        double notaMayor = 0;
        double notaLess = 0;
        String estudianteBig= "";
        String estudianteLow="";
        for(Estudiante estu:grupo){
            if (estu.getNota()>notaMayor){
                notaMayor = estu.getNota();
                estudianteBig= estu.getNombreCompleto();
            } 
        }
        notaMayor=notaLess=notaMayor;
        for(Estudiante estudiante: grupo){
           porcentaje += estudiante.getNota();
            //notaMayor=estudiante.getNota();
            //notaLess=estudiante.getNota();
           if (estudiante.getNota()<notaLess){
                notaLess = estudiante.getNota();
                estudianteLow= estudiante.getNombreCompleto();
            }   
           }
         double porcent = porcentaje/grupo.size();
        reportes.add(Double.toString(porcent));
        reportes.add(estudianteLow);
        reportes.add(Double.toString(notaLess));
        reportes.add(estudianteBig);
        reportes.add(Double.toString(notaMayor));
    return reportes.toArray(); 
    }
    
}
