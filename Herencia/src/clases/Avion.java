/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author USER
 */
public class Avion extends Vehiculo {
    private int NumAlas;

    public Avion(int NumAlas, String marca, String modelo) {
        super(marca, modelo);
        this.NumAlas = NumAlas;
    }

    public int getNumAlas() {
        return NumAlas;
    }

    public void setNumAlas(int NumAlas) {
        this.NumAlas = NumAlas;
    }
    
    //Metodos de logica
    public void ValidarPeso(int peso){
        if(peso<=3000){
            System.out.println("Puede despegar_________No olvide abrocharce su cinturon");
        }else{
            System.out.println("El peso excede al extablecido....Houston tenemos problemas");
        }
    }
}
