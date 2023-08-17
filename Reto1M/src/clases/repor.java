/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author USER
 */
public class repor {
        int compra[];

    public repor(int[] compra) {
        this.compra = compra;
        //reporte(int[] venta);
    }

    public int[] getCompra() {
        return compra;
    }    
    //logica
    public int[] reporte(int[] compra){
        int productoMasCaro = 0;
        int totalCompra = 0;
        int productoMasBarato = 0;
        productoMasCaro=productoMasBarato= compra[0]; //Valido los campos.
        //System.out.println(venta.length);
        for(int i=0;i<compra.length;i++){
            //System.out.println(compra1[i]);
            totalCompra +=compra[i];
            //System.out.println(venta[i]);
            if(compra[i]>productoMasCaro){
                productoMasCaro = compra[i];
            }else if(compra[i]<productoMasBarato){
                productoMasBarato = compra[i];
                //System.out.println(venta[i]);// Elemento mas pequeño..
            }
        }
        int reporte[]={totalCompra,productoMasBarato,productoMasCaro};
        System.out.println(reporte[0]+" "+reporte[1]+" "+reporte[2]);
        System.out.println("----------------------------------------");
    return reporte; 
       
    }
    
    
}
