
package retoh3;
import clases.*;
public class RetoH3 {
    public static void main(String[] args) {
        // TODO code application logic here
    usuarioMoodle estudiante_uno = new usuarioMoodle("Julio","1003097593","Viviana2003","Sauljteran@gmail.com","Programacion II");
    estudiante_uno.mostrar();
        System.out.println("************************");
    //Modificacion
    estudiante_uno.editarPerfil("Julio","1003097593","Viviana2003","Sauljteran@gmail.com","Editado exitoso");
    estudiante_uno.mostrar();
    
    Tripulante saul = new Tripulante("Julio","1003097593","Viviana2003","Sauljteran@gmail.com","Editado exitoso",5);
    Formador memin = new Formador("Decano","Pedro Pablo","77", "5", "Saul@","Calificador");
    //saul.resolverReto(0); Verdadero
    saul.resolverReto(1);
    saul.resolverReto(2);
    saul.resolverReto(3);
    for(int i=0;i<5;i++){
        memin.calificar(saul, i);
    } 
    saul.mostrar();
        
    }
    
}
