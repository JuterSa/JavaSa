
package managerpasajeavion;
import clases.PasajeAvion;

public class ManagerPasajeAvion {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Calcular valor de la ocupacion de destino:");
        //Celular cel1 = new Celular("Huawei", "Verde Turqui", "P_45678", 2022);
        PasajeAvion pasajero = new PasajeAvion(99,"Broqueles United", 99);
        pasajero.verificarOcupacion();
        System.out.println("___Fin del programa___");
    }
        //System.out.println("Calcular valor de la ocupacion de destino:");
}
