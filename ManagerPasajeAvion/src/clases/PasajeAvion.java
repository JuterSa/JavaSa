/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author USER
 */
public class PasajeAvion {
    //Atributos.
    int idPasaje;
    String nombreDestino;
    int ocupacionDestino;
    
    //Contructor _intancia los atributos..
    public PasajeAvion(int idPasaje, String nombreDestino, int ocupacionDestino) {
        this.idPasaje = idPasaje;
        this.nombreDestino = nombreDestino;
        this.ocupacionDestino = ocupacionDestino;
    }
    //Metodos get - Devouelve el valor del atributo

    public String getNombreDestino() {
        return nombreDestino;
    }

    public int getOcupacionDestino() {
        return ocupacionDestino;
    }
    
    public void verificarOcupacion(){
        if (ocupacionDestino<=30){
            System.out.println("El descuento de su pasaje hacia "+nombreDestino + "es igual al 40%: "+ ocupacionDestino);
        }else if(ocupacionDestino>30 && ocupacionDestino<=60){
            System.out.println("El descuento de su pasaje hacia "+nombreDestino + "es igual al 20%: "+ ocupacionDestino);
        }else{
            System.out.println("El descuento de su pasaje hacia "+nombreDestino + "es igual al 10%: "+ ocupacionDestino);
        }
    }
    
    
}

/*public class Solucion {

 
    public static void main(String[] args) {
        // TODO code application logic here
        //Costo total de la compra.
        //Costo del producto mas barato
        // Costo del producto mas caro.
        int productoMasCaro = 0;
        int totalCompra = 0;
        int productoMasBarato = 0;
        int compra[];
        int compra1[]={2700,9500,300,15000,1800,10000,400,3000,400};
        
        System.out.println(compra1.length);
        productoMasCaro=productoMasBarato= compra1[0]; //Valido los campos.
        //System.out.println(compra1.length);
        for(int i=0;i<compra1.length;i++){
            //System.out.println(compra1[i]);
            totalCompra +=compra1[i];
            if(compra1[i]>productoMasCaro){
                productoMasCaro = compra1[i];
            }else if(compra1[i]<productoMasBarato){
                productoMasBarato = compra1[i];  // Elemento mas pequeño..
            }
        }
        int reporte[]={totalCompra,productoMasBarato,productoMasCaro};
        for(int i=0;i<3;i++){
            System.out.println(reporte[i]);
        }
        System.out.println("Costo total de la compra. "+totalCompra);
        System.out.println("Costo del producto mas barato. "+productoMasBarato);
        System.out.println("Costo del producto mas caro. "+productoMasCaro);
        System.out.println();
*/
    