/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author USER
 */
public class Camion extends Vehiculo {
    private int CapacidadCarga;

    public Camion(int CapacidadCarga, String marca, String modelo) {
        super(marca, modelo);
        this.CapacidadCarga = CapacidadCarga;
    }

    public int getCapacidadCarga() {
        return CapacidadCarga;
    }

    public void setCapacidadCarga(int CapacidadCarga) {
        this.CapacidadCarga = CapacidadCarga;
    }
    
    
    
}
