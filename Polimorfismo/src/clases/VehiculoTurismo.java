
package clases;

/**
 *
 * @author USER
 */
public class VehiculoTurismo extends Vehiculo {
    private int numeroPuertas;

    public VehiculoTurismo(int numeroPuertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    
    @Override
     public String mostrarDatos(){
        
        //return "Matricula: "+matricula+"\nModelo: "+modelo+"\nMarca: "+marca+"\nNumero Puertas: "+;
        return "Vehiculo Turismo:\n"+ super.mostrarDatos()+"\nNumero Puertas: "+ numeroPuertas;
    }
    
}
