
package clases;


public class Vehiculo {
    private String marca;
    private String modelo;
    
    // Constructor

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    //Settt and get

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void encender(){
        System.out.println("** Vehiculo encendido_____Velocidad KM/h = 0 **");
    }
    public void apagar(){
        System.out.println("** Vehiculo sin encender______Velocidad KM/h = 0**");
    }
    
}
