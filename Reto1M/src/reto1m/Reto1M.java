
package reto1m;

import clases.repor;

public class Reto1M {

    public static void main(String[] args) {
        System.out.println("Saul");
        int compra1[]={2700,9500,300,15000,1800,10000,400,3000,400};
        int compra2[]={6800};
        repor venta= new repor(compra1);
        repor venta2 = new repor(compra2);
        
        venta.reporte(compra1);
        venta2.reporte(compra2);
    }
    
}
