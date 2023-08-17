
package clases;


public class Automovil extends Vehiculo {
    private String numeroPuertas;

    public Automovil(String numeroPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public String getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(String numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    
    
}
