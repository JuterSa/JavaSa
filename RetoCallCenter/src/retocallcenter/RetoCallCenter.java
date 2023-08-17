
package retocallcenter;

import clases.*;
import modelo.*;
import java.util.ArrayList;


public class RetoCallCenter {

    public static void main(String[] args) {
        CallCenter liquidacion = new CallCenter();
        
        
        ArrayList<Double> nominas = new ArrayList<>();
        ArrayList<Double> prestaciones = new ArrayList<>();
        ArrayList<Empleado> listEmpleado = new ArrayList<>(); //lista como objeto..Por eso soporta varios tipos de datos
       Empleado userCero = new Empleado();
       listEmpleado.add(userCero);
       Empleado userOne = new Empleado(1,"Iron Man","Man", 40000, true, 1500000);
       listEmpleado.add(userOne);
       modeloEmpleado mod = new modeloEmpleado();
       listEmpleado.add(mod.consultaEmpleadoId("1"));
        System.out.println("LIQUIDACION NOMINA_ Ejercicio clase");
        nominas = liquidacion.liquidarNomina(listEmpleado);
        for(int i = 0; i < nominas.size(); i++) {
            System.out.println("Nombre: "+listEmpleado.get(i).getNombre()+ " Total a pagar: "+ Math.round(nominas.get(i)));
        }
        System.out.println("Prestaciones sociales:________");
        prestaciones = liquidacion.liquidarPrestacionesEmp(listEmpleado);
        for(int i = 0; i < prestaciones.size(); i++){
            System.out.println("Nombre: "+listEmpleado.get(i).getNombre()+ " Total a pagar: "+ Math.round(prestaciones.get(i)));
        }
    }
    
}
