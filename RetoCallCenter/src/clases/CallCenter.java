
package clases;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
public class CallCenter {
    //Atributos
    //Relacion= Agregacion 1 CallCenter tiene 1..* Empleados
    private ArrayList<Empleado> empleados = new ArrayList<>();

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    //Metodos logica.
    public  ArrayList<Double>liquidarNomina(ArrayList<Empleado> empleados){
        ArrayList<Double> nomina = new ArrayList<>();
        if(empleados==null){ //Valida si el arrayList esta vacio o no.
            return null;
        }else{
            for (Empleado empleado : empleados) { //Ciclo for loop
              double neto=0;
              double valorHorasExtra = empleado.getHorasExtra();
              double salario = empleado.getSalario();
              boolean auxTran = empleado.isAuxilioTransporte();
              
              double aporte = (salario+valorHorasExtra) *0.08;
              if(auxTran){ //Automaticamente carga si es false o ver ya que es un dato boolean
                  neto = (salario + valorHorasExtra  + 106454)  - aporte;
              }else{
                  neto = (salario + valorHorasExtra)  - aporte;
              }
              nomina.add(neto);
            }
        }
     return nomina;  
    }
   
    public ArrayList<Double>liquidarPrestacionesEmp(ArrayList<Empleado> empleados){
        ArrayList<Double> prestaciones = new ArrayList<>();
        if(empleados==null){
            return null;
        }else{
            for(Empleado empleado : empleados){
              double vlrPrestaciones,primas,cesantias,intCesantias,vacaciones;
              int vlrAuxTrans = 106454;
              double valorHorasExtra = empleado.getHorasExtra();
              double salario = empleado.getSalario();
              boolean auxTran = empleado.isAuxilioTransporte(); 
              //Calcular las prestaciones
              if(auxTran){
                  primas= (valorHorasExtra+salario+vlrAuxTrans)* 0.0833; // 8.33% = 0.0833
                  cesantias= (valorHorasExtra+salario+vlrAuxTrans)* 0.0833; // 8.33% = 0.0833
                  intCesantias = (cesantias*0.12);
                  vacaciones = (salario* 0.0416);
              }else{
                  primas= (valorHorasExtra+salario)* 0.0833; // 8.33% = 0.0833
                  cesantias= (valorHorasExtra+salario+vlrAuxTrans)* 0.0833; // 8.33% = 0.0833
                  intCesantias = (cesantias*0.12);
                  vacaciones = (salario* 0.0416);
              }
              vlrPrestaciones = (primas+cesantias+intCesantias+vacaciones);
              prestaciones.add(vlrPrestaciones);
            }
            
        }
        return prestaciones;
    }
        // (Liquidacion Nomina 1 Empleado) -- Sobre Carga de Metodos
    public ArrayList<Double> liquidarNominaEmp(Empleado empleado){
        ArrayList<Double> nomina = new ArrayList<>();
        if(empleado==null){
            return null;
        }else{
 
            double neto;
            double valorHoraExtra = empleado.getHorasExtra();
            double salario = empleado.getSalario();
            boolean auxTran = empleado.isAuxilioTransporte();
            double aportes = (salario + valorHoraExtra) * 0.08;

            if(auxTran){
                neto  = (salario + valorHoraExtra + 106454) - aportes; 
            }else{
                neto  = (salario + valorHoraExtra) - aportes; 
            }

            nomina.add(neto);                
        }
        return nomina;
    }
    
    public ArrayList<Double> liquidarPrestacionesEmp(Empleado empleado){
        ArrayList<Double> prestacion = new ArrayList<>();
        
        if(empleado==null){
            return null;
        }else{
            
            double vlrPrestaciones, primas, cesantias, intCesantias, vacaciones;
            int vlrAuxTrans = 106454;
            double valorHoraExtra = empleado.getHorasExtra();
            double salario = empleado.getSalario();
            boolean auxTran = empleado.isAuxilioTransporte();

            // Calcular las prestaciones
            if(auxTran){
                primas = (salario + valorHoraExtra + vlrAuxTrans) * 0.0833;
                cesantias = (salario + valorHoraExtra + vlrAuxTrans) * 0.0833;
                intCesantias = (cesantias * 0.12);
                vacaciones = (salario * 0.0416);
            }else{
                primas = (salario + valorHoraExtra) * 0.0833;
                cesantias = (salario + valorHoraExtra) * 0.0833;
                intCesantias = (cesantias * 0.12);
                vacaciones = (salario * 0.0416);
            }

            vlrPrestaciones = ( primas + cesantias + intCesantias + vacaciones );
            prestacion.add(vlrPrestaciones);
        
        }
        
        return prestacion;
    }
public HashMap<Integer, ArrayList> procesoMasivoNominaPrestaciones(LinkedList<Empleado> empleadoLista){
 HashMap<Integer, ArrayList> ListaNominas = new HashMap<Integer, ArrayList>();
                
        if(empleadoLista != null){
            
            for (Empleado empleado : empleadoLista) {
                
                ArrayList LiqEmpleado = new ArrayList<>();
                
                ArrayList<Double> nomina = new ArrayList<>();
                ArrayList<Double> prestacion = new ArrayList<>();
                
                int  id = empleado.getId();
                String nombre = empleado.getNombre() + " " + empleado.getApellido();

                nomina = liquidarNominaEmp(empleado);
                prestacion = liquidarPrestacionesEmp(empleado);

                LiqEmpleado.add(id);
                LiqEmpleado.add(nombre);
                LiqEmpleado.add(Math.round(nomina.get(0)));
                LiqEmpleado.add(Math.round(prestacion.get(0)));
                // Lista { id : (id - nombre empleado + apellido + nomina + prestacion) }
                ListaNominas.put(id, LiqEmpleado);
            
            }
            
        }else{
            return null;
        }
        
        return ListaNominas;
}
}
