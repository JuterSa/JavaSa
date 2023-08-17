
package modelo;
import java.sql.*;
import clases.*;
import java.util.LinkedList;

public class modeloEmpleado extends BdData {  
    public Empleado validarCedula(String cedula){
         Empleado empleado = null;
        try (Connection connection = DriverManager.getConnection(getUrl(), getUser(), getPassword())) {        
            String query = "SELECT * FROM tb_empleado WHERE cedula = ?";
            ResultSet resul;
             try (PreparedStatement stmt = connection.prepareStatement(query)) {
                 stmt.setString(1, cedula);
                 resul = stmt.executeQuery();
                 while(resul.next()){
                     
                     int empId = resul.getInt(1);
                     String nombre = resul.getString(2);
                     String apellido = resul.getString(3);
                     int vlrHoraExtra = resul.getInt(4);
                     String auxTransp = resul.getNString(5);
                     int salarioEmpl = resul.getInt(6);
                     
                     //mostrarDatos(empId,nombre,apellido,vlrHoraExtra,auxTransp,salarioEmpl);
                     
                     switch (auxTransp) {
                         case "true" :
                             empleado = new Empleado(empId, nombre, apellido, vlrHoraExtra, true, salarioEmpl);
                             break;
                         case "false":
                             empleado = new Empleado(empId, nombre, apellido, vlrHoraExtra, false, salarioEmpl);
                             break;
                         default:
                             throw new AssertionError();
                     }
                 }}
            resul.close();
            
            return empleado;
        } catch (Exception e) {
            System.out.println("Error con el codigo: " + e.getMessage());  
        }
        return empleado;
    
    }
    public Empleado consultaEmpleadoId(String id){
       Empleado emp = null;
        try(Connection conexionBase = DriverManager.getConnection(getUrl(), getUser(), getPassword())) {
            String query = "SELECT * FROM tb_empleado WHERE id = ?";
            PreparedStatement stmt = conexionBase.prepareStatement(query);
            stmt.setString(1, id);
            ResultSet resul = stmt.executeQuery();
            while(resul.next()){
                int empId = resul.getInt(1);
                String nombre = resul.getString(2);
                String apellido = resul.getString(3);
                int vlrHorasExtras = resul.getInt(4);
                String auxTransporte = resul.getString(5);
                int salario = resul.getInt(6);
                int bono = resul.getInt(7);
                String cedula = resul.getString(8);
                System.out.println("ID Empleado " + empId+
                        "\nNombre: "+ nombre+
                        "\nApellido: "+ apellido+
                        "\nValor Horas Extras: "+ vlrHorasExtras+
                        "\nAuxilio Transporte: "+ auxTransporte+
                        "\nSalario Total: "+ salario+
                        "\nBono de diciembre: "+ bono
                );   
            switch(auxTransporte) {
                case "true":
                    emp = new Empleado(empId, nombre, apellido, vlrHorasExtras, true, salario,cedula);
                    break;
                case "false":
                    emp = new Empleado(empId, nombre, apellido, vlrHorasExtras, false, salario,cedula);
                    break;
                default:
                    throw new AssertionError();
            }
            
            }
            resul.close();
            stmt.close();
            
            return emp;
        } catch (Exception e) {
            System.out.println("Papi hay un error.."+ e.getMessage());
        }
       
        return emp;
    }
    public boolean crearEmpleado(String nombre, String apellido, int vlrHoraExtra, boolean auxTransp, int salarioEmpl, String cedula){
        
        try (Connection connection = DriverManager.getConnection(getUrl(), getUser(), getPassword())) {
            
            String aux_transp;
            
            if(auxTransp){
                aux_transp = "true";
            }else{
                aux_transp = "false";
            }
            
            String query = "INSERT INTO tb_empleado(`nombre`, `apellido`, `horas_estras`, `aux_transp`, `salario`, `cedula`) VALUES (?,?,?,?,?,?)";
            
            try (PreparedStatement stmt = connection.prepareStatement(query)) {
                stmt.setString(1, nombre);
                stmt.setString(2, apellido);
                stmt.setInt(3, vlrHoraExtra);
                stmt.setString(4, aux_transp);
                stmt.setInt(5, salarioEmpl);
                stmt.setString(6, cedula);
                
                stmt.executeUpdate();
            }
            
            return true;
           
        } catch (Exception e) {
            System.out.println("Hubo un problema al intentar generar el registro: " + e.getMessage());  
        }
        
        return false;
        
    }
    public boolean editarEmpleado(int id, String nombre, String apellido, int vlrHoraExtra, boolean auxTransp, int salarioEmpl, String cedula){
        
        try (Connection connection = DriverManager.getConnection(getUrl(), getUser(), getPassword())) {
            
            String aux_transp;
            
            if(auxTransp){
                aux_transp = "true";
            }else{
                aux_transp = "false";
            }
            
            String query = "UPDATE `tb_empleado` \n" +
                           "SET `nombre`=?,`apellido`=?,`horas_estras`=?,`aux_transp`=?,`salario`=?,`cedula`=? WHERE id = ?";
            
            PreparedStatement stmt = connection.prepareStatement(query);
            
            stmt.setString(1, nombre);
            stmt.setString(2, apellido);
            stmt.setInt(3, vlrHoraExtra);
            stmt.setString(4, aux_transp);
            stmt.setInt(5, salarioEmpl);
            stmt.setString(6, cedula);
            stmt.setInt(7, id);
            
            stmt.executeUpdate();
            stmt.close();
            
            return true;
           
        } catch (Exception e) {
            System.out.println("No se puede ejecutar esta instruccion, revise los campos: " + e.getMessage());  
        }
        
        return false;
    }
    
    public boolean eliminarEmpleado(String id){
    
        Empleado empleado = consultaEmpleadoId(id);
        
        if(empleado != null ){
            
            try (Connection connection = DriverManager.getConnection(getUrl(), getUser(), getPassword())) {
            
                String query = "DELETE \n" +
                               "FROM `tb_empleado` \n" +
                               "WHERE id = ?";

                PreparedStatement stmt = connection.prepareStatement(query);

                stmt.setString(1, id);

                stmt.executeUpdate();
                stmt.close();

                return true;

            } catch (Exception e) {
                System.out.println("No se puede eliminar este elemnto: " + e.getMessage());  
            }
        }else{
            return false;
        }
        
        return false;       
    }
  public LinkedList<Empleado> listaEmpleado(){
        LinkedList<Empleado> empleadoLista = new LinkedList<>();
        Empleado empleado = null;
        
        try (Connection connection = DriverManager.getConnection(getUrl(), getUser(), getPassword())) {
            
            String query = "SELECT id, nombre, apellido, horas_estras, aux_transp, salario FROM `tb_empleado`";
            Statement stmt = connection.createStatement();
            ResultSet resul = stmt.executeQuery(query);
            
            while(resul.next()){
                
                int empId = resul.getInt(1);
                String nombre = resul.getString(2);
                String apellido = resul.getString(3);
                int vlrHoraExtra = resul.getInt(4);
                String auxTransp = resul.getNString(5);
                int salarioEmpl = resul.getInt(6);
                
                switch (auxTransp) {
                    case "true" :
                        empleado = new Empleado(empId, nombre, apellido, vlrHoraExtra, true, salarioEmpl);
                        break;
                    case "false":
                        empleado = new Empleado(empId, nombre, apellido, vlrHoraExtra, false, salarioEmpl);
                        break;
                    default: throw new AssertionError();
                }
                
                empleadoLista.add(empleado);
            }
            
            stmt.close();
            resul.close();
            
            return empleadoLista;
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());  
        }
        
        return empleadoLista;
    }   
        
}