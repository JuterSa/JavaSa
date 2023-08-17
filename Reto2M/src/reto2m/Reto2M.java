
package reto2m;

import clases.*;
public class Reto2M {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String filaCoche []={"FNC901","ZZZ250","XXX706","QQQ503","III845","LLL560","GGG432","WWW254","ÑÑÑ243","NNN122","EEE484","AAA884","YYY948","NNN230"};
        Peaje taquillaPeaje = new Peaje(filaCoche);
        taquillaPeaje.agregarCocheFlyPass();
        taquillaPeaje.proximoCoche();
        taquillaPeaje.proximoCoche();
        taquillaPeaje.proximoCoche();
        taquillaPeaje.proximoCoche();
        System.out.println(taquillaPeaje.getCantidadCochesAtendidos());
        System.out.println(taquillaPeaje.getCocheEnAtencion());
        /*for(int i=0;i<filaCoche.length;i++){
            System.out.println(taquillaPeaje.getCantidadCochesAtendidos());
         }*/
        
        ////////////////////
        System.out.println("Antes de la ejecucion "+taquillaPeaje.isEstadoPeaje());
        taquillaPeaje.cambiarEstadoPeaje();
        System.out.println("Primera ejecucuin deberia ser verdadera "+taquillaPeaje.isEstadoPeaje());
        taquillaPeaje.cambiarEstadoPeaje();
        System.out.println("Tercera ejecucuin deberia ser falsa "+taquillaPeaje.isEstadoPeaje());
        
        
        
    }
    
}
