
package clases;
public class Tripulante extends usuarioMoodle{
    //Atributos
    private double calificaciones[]={0};
    private boolean entregas[]= {false};
    
    //Constructor
    public Tripulante(String nombreCompleto, String documentoIdentidad, String password, String correo, String descripcion, int n) {
        super(nombreCompleto, documentoIdentidad, password, correo, descripcion);
        entregas = new boolean[n];
        calificaciones = new double[n];
    }
    
    //Método
    public void resolverReto(int retoAEntregar){ //Recibe un uno 1
        entregas[retoAEntregar]=true;
    }

    public double[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(double[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    public boolean[] getEntregas() {
        return entregas;
    }

    public void setEntregas(boolean[] entregas) {
        this.entregas = entregas;
    }
    @Override
 public void mostrar(){
        for (int i = 0; i < entregas.length; i++) {
            System.out.println("\t"+entregas[i]);
            System.out.println("\t"+calificaciones[i]);
        }      
    }   

    
}
