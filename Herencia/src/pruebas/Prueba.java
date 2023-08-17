
package pruebas;

import clases.*;


public class Prueba {

    public static void main(String[] args) {
        
        Camion cm1 = new Camion(1000, "2022", "fERRARI_gt");
        cm1.encender();
        cm1.setModelo("5000");
        System.out.println(cm1.getModelo());
        Avion av1 = new Avion(6, "Avianca Airlains", "2022");
        av1.ValidarPeso(3000);
    }
    
}
