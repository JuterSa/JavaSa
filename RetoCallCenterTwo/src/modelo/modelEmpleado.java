package modelo;
import java.sql.*;

import controlador.Empleado;
import java.util.LinkedList;
import javax.swing.JOptionPane;


public class modelEmpleado extends DbData {
    
    public Empleado validarCedula(String cedula){
        Empleado empleado = null;
        
        try (Connection connection = DriverManager.getConnection(getUrl(), getUser(), getPassword())) {
            
            String query = "SELECT * FROM `tb_empleado` WHERE cedula = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, cedula);
            ResultSet resul = stmt.executeQuery();
            while(resul.next()){
                
                int empId = resul.getInt(1);
                String nombre = resul.getString(2);
                String apellido = resul.getString(7);
                int vlrHoraExtra = resul.getInt(3);
                String auxTransp = resul.getNString(4);
                int salarioEmpl = resul.getInt(5);
                
                //mostrarDatos(empId,nombre,apellido,vlrHoraExtra,auxTransp,salarioEmpl);
                
                switch (auxTransp) {
                    case "true" -> empleado = new Empleado(empId, nombre, apellido, vlrHoraExtra, true, salarioEmpl);
                    case "false" -> empleado = new Empleado(empId, nombre, apellido, vlrHoraExtra, false, salarioEmpl);
                    default -> throw new AssertionError();
                }   
            }
            
            stmt.close();
            resul.close();
            
            return empleado;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());  
        }
        return empleado;
        
    }
    
    public void mostrarDatos(int empId, String nombre, String apellido, int vlrHoraExtra, String auxTransp, int salarioEmpl){
        System.out.println("ID empleado: " + empId + 
                                   "\nNombre empleado: "+ nombre +
                                   "\nApellido empleado: "+ apellido +
                                   "\nHoras Extras: "  + vlrHoraExtra +
                                   "\nAuxilio Transporte: " + auxTransp +
                                   "\nSalario: " + salarioEmpl);
        System.out.println("");
    }
    
    public Empleado consultaEmpleadoId(String id){
        Empleado emp = null;
        
        try (Connection connection = DriverManager.getConnection(getUrl(), getUser(), getPassword())) {
            
            String query = "SELECT * FROM `tb_empleado` WHERE id = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, id);
            ResultSet resul = stmt.executeQuery();
            while(resul.next()){
                
                int empId = resul.getInt(1);
                String nombre = resul.getString(2);
                String apellido = resul.getString(7);
                int vlrHoraExtra = resul.getInt(3);
                String auxTransp = resul.getNString(4);
                int salarioEmpl = resul.getInt(5);
                
                //mostrarDatos(empId,nombre,apellido,vlrHoraExtra,auxTransp,salarioEmpl);
                
                switch (auxTransp) {
                    case "true" -> emp = new Empleado(nombre, apellido, vlrHoraExtra, true, salarioEmpl);
                    case "false" -> emp = new Empleado(nombre, apellido, vlrHoraExtra, false, salarioEmpl);
                    default -> throw new AssertionError();
                }
                
                stmt.close();
                resul.close();
            }
            return emp;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());  
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
            
            String query = "INSERT INTO `tb_empleado`(`nombre`, `horas_extra`, `aux_transp`, `salario`, `apellido`, `cedula` ) "
                         + "VALUES (?,?,?,?,?,?)";
            
            PreparedStatement stmt = connection.prepareStatement(query);
            
            stmt.setString(1, nombre);
            stmt.setString(5, apellido);
            stmt.setInt(2, vlrHoraExtra);
            stmt.setString(3, aux_transp);
            stmt.setInt(4, salarioEmpl);
            stmt.setString(6, cedula);
            
            stmt.executeUpdate();
            stmt.close();
            
            return true;
           
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());  
        }
        
        return false;
        
    }
    
    public boolean editarEmpleado(int id, String nombre, String apellido, int vlrHoraExtra, boolean auxTransp, int salarioEmpl){
        
        try (Connection connection = DriverManager.getConnection(getUrl(), getUser(), getPassword())) {
            
            String aux_transp;
            
            if(auxTransp){
                aux_transp = "true";
            }else{
                aux_transp = "false";
            }
            
            String query = "UPDATE `tb_empleado` \n" +
                           "SET `nombre`=?,`apellido`=?,`horas_extra`=?,`aux_transp`=?,`salario`=? WHERE id = ?";
            
            PreparedStatement stmt = connection.prepareStatement(query);
            
            stmt.setString(1, nombre);
            stmt.setString(2, apellido);
            stmt.setInt(3, vlrHoraExtra);
            stmt.setString(4, aux_transp);
            stmt.setInt(5, salarioEmpl);
            stmt.setInt(6, id);
            
            stmt.executeUpdate();
            stmt.close();
            
            return true;
           
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());  
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
                System.out.println("Error: " + e.getMessage());  
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
            
            String query = "SELECT id, nombre, apellido, horas_extra, aux_transp, salario FROM `tb_empleado`";
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
                    case "true" -> empleado = new Empleado(empId, nombre, apellido, vlrHoraExtra, true, salarioEmpl);
                    case "false" -> empleado = new Empleado(empId, nombre, apellido, vlrHoraExtra, false, salarioEmpl);
                    default -> throw new AssertionError();
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
