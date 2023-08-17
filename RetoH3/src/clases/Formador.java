
package clases; 
public class Formador extends usuarioMoodle {
    private String escalafon;

    public Formador(String escalafon, String nombreCompleto, String documentoIdentidad, String password, String correo, String descripcion) {
        super(nombreCompleto, documentoIdentidad, password, correo, descripcion);
        this.escalafon = escalafon;
    }
    
     public void calificar(Tripulante tripulanteACalificar, int k){
         
        if(tripulanteACalificar.getEntregas()[k]==true){
            tripulanteACalificar.getCalificaciones()[k]= 5;
            
         }else{
            tripulanteACalificar.getCalificaciones()[k]= 0;
        }
        
    }
    
    public String getEscalafon() {
        return escalafon;
    }

    public void setEscalafon(String escalafon) {
        this.escalafon = escalafon;
    }
    
    
}
