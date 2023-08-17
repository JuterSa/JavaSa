
package reto4m;

import java.util.ArrayList;


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
    
    /////////////////////////////////////////////////////
 
    public static Object[] reportes(ArrayList<Estudiante> grupo) {
      Estudiante userEstudiante = null;
      double notaBig = 0;
      double notaLow = 0;
      double porcentaje = 0;
      String esLow="";
      String esBig="";
      ArrayList<Object> arrayDatos = new ArrayList<Object>();
      //Calculo la nota mayor
        for(int i = 0; i < grupo.size(); i++) {
            userEstudiante = grupo.get(i);
            if (userEstudiante.getNota()>notaBig){
                notaBig = userEstudiante.getNota();
                esBig= userEstudiante.getNombreCompleto();
            }else if(userEstudiante.getNota()==notaBig){
                 notaBig = userEstudiante.getNota();
                esBig= userEstudiante.getNombreCompleto();
            } 
            porcentaje += userEstudiante.getNota();
        }
      //Calculo la nota menor
      notaBig=notaLow=notaBig;
      for(int i = 0; i < grupo.size(); i++) {
            userEstudiante = grupo.get(i);
            if(userEstudiante.getNota()<notaLow){
                notaLow = userEstudiante.getNota();
                esLow= userEstudiante.getNombreCompleto();
            }else if(userEstudiante.getNota()==notaLow){
                notaLow = userEstudiante.getNota();
                esLow= userEstudiante.getNombreCompleto();
            }
        }
        double porcentajeEs = porcentaje/grupo.size();
        arrayDatos.add(porcentajeEs);
        arrayDatos.add(esLow);
        arrayDatos.add(notaLow);
        arrayDatos.add(esBig);
        arrayDatos.add(notaBig);
        return arrayDatos.toArray();
    }
}
