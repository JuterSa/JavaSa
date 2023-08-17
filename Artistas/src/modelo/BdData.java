
package modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;


public class BdData {
    private String driver = "com.mysql.cj.jdbc.Driver";  //com.mysql.cj.jdbc.Driver
    private String user = "root";
    private String password = "";
    private String url = "jdbc:mysql://localhost:3306/sistemadenomina";
    //String url ="";
    Connection conexionBase= null;
    public void Conexion(){
        try{
            Class.forName(driver);
            conexionBase = DriverManager.getConnection(url,user,password);
            if(conexionBase!=null){
                System.out.println("Conexion exitosa");
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Hay un error en la conexion"+ ex.getMessage());
        } catch (SQLException e){
            System.out.println("Hay una exepcion "+ e.getMessage());
        }
    }

    public Connection getConexionBase() {
        return conexionBase;
    }

    public void setConexionBase(Connection conexionBase) {
        this.conexionBase = conexionBase;
    }
    
    public void MostrarTabla(){
        int ids = 1;
        String query = "SELECT *FROM tb_empleado WHERE id ="+ids;
        //Connection consulta= null;
         try {
        //String SQL = "SELECT * FROM table_name";
        Statement consuBase = conexionBase.createStatement();
        ResultSet resultadoBase = consuBase.executeQuery(query);

        while (resultadoBase.next()) {
         System.out.println(resultadoBase.getString("nombre") + ", " + resultadoBase.getString("horas_estras"));
            }
  
        resultadoBase.close();
        consuBase.close();
        }
        catch (SQLException e) {
            System.out.println("La tabla indicada no existe" + e.getMessage());
        }
   
    }  
    public void Insertar(String nombre, int horas, String auxilio, int salario ){
        PreparedStatement inser;
        String query ="INSERT INTO `tb_empleado`(`nombre`, `horas_estras`, `aux_transp`, `salario`) VALUES(?,?,?,?)";
        try{
            //sql = "insert into datos(nombre, edad, sexo) values(?,?,?)";
            inser = conexionBase.prepareStatement(query);
            inser.setString(1, nombre);
            inser.setInt(2, horas);
            inser.setString(3, auxilio);
            inser.setInt(4, salario);
            inser.executeUpdate();
            JOptionPane.showMessageDialog(null, "Sus datos se han insertado"+
                    "\nMuchas gracias");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }
    }
    
    public void llenardatos(){
        PreparedStatement consulta;
        //ArrayList lista = new ArrayList();
        String query ="SELECT *FROM tb_empleado";
           try {
        //String SQL = "SELECT * FROM table_name";
        Statement consuBase = conexionBase.createStatement();
        ResultSet resultadoBase = consuBase.executeQuery(query);

        while (resultadoBase.next()) {
         //System.out.println(resultadoBase.getString("nombre") + ", " + resultadoBase.getString("horas_estras"));
         JOptionPane.showMessageDialog(null, resultadoBase.getString("nombre") + " __ " + resultadoBase.getString("horas_estras")+ "__" +resultadoBase.getString("salario"));
        }
  
        resultadoBase.close();
        consuBase.close();
        }
        catch (SQLException e) {
            System.out.println("La tabla indicada no existe" + e.getMessage());
        }

    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
