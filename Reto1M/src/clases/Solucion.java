package clases;

public class Solucion{
    //ESTA CLASE NO TIENE MAIN
    
    
    public static int [] reporte(int [] compra){
        //EN ESTE ESPACIO PONER SU LÓGICA
        System.out.println("______________________");
        int productoMasCaro = 0;
        int totalCompra = 0;
        int productoMasBarato = 0;
        int compra1[]={};
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
        return reporte;
        
        
        
        
    }
}