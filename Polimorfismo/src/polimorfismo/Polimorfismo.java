
package polimorfismo;

import clases.*;

public class Polimorfismo {

    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo mVehiculo[] = new Vehiculo[4]; //Instancia clase padre
        
        mVehiculo[0] = new Vehiculo("HFE-12", "Mazda", "AX89"); //
        
        //Instancia clases hijas
        mVehiculo[1] = new VehiculoDeportivo(500,"XXX-99", "Renault", "AX99");
        mVehiculo[2] = new VehiculoFurgoneta(2000,"DDD-34", "Lamborgini", "99XA");
        mVehiculo[3] = new VehiculoTurismo(5,"OOO-52", "Buggati-Leron", "AX55");
       
        for(Vehiculo vehiculo : mVehiculo){ //Ciclo for loop
            System.out.println(vehiculo.mostrarDatos());
            System.out.println("_______________________________________juter_____________________________________________");
        }
        
        
        
    }
    
}
