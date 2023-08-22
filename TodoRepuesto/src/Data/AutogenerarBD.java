
package Data;
import Clientes.ClientesD;
import com.mysql.cj.x.protobuf.MysqlxSql;
import com.mysql.cj.xdevapi.SqlUpdateResult;
import com.mysql.jdbc.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Juter Sa
 */
public class AutogenerarBD {
           //Connection conn = null;
                   Connection conn = null;
                   Statement stmt = null;
                   ResultSet rs = null;
                   ClientesD clientes;
           public  void Autogenerate(){        
                   //try/catch para conexion a servidor
                    try {
                        conn =
                           DriverManager.getConnection("jdbc:mysql://localhost/?" + "user=root&password");
                                                       
                       //String sql = "CREATE DATABAS todo_repuestos";
                      
                    } catch (SQLException ex) {
                        // handle any errors
                        System.out.println("SQLException: " + ex.getMessage());
                        System.out.println("SQLState: " + ex.getSQLState());
                        System.out.println("VendorError: " + ex.getErrorCode());
                    }
                    //Creacion de base de datos
                    try {
                        stmt = conn.createStatement();

                        if (stmt.execute("CREATE  DATABASE IF NOT EXISTS todo_repuestos; "    
                                )){
                           
                            System.out.println("No se creo la base de datos: "+ rs);
                        }else{
                            rs = stmt.getResultSet();
                            System.out.println("Database creada con exito");
                        }         
                    }
                    catch (SQLException ex){
                        // handle any errors
                        System.out.println("SQLException: " + ex.getMessage());
                        System.out.println("SQLState: " + ex.getSQLState());
                        System.out.println("VendorError: " + ex.getErrorCode());
                    }
                    try{
                          if (stmt.execute("CREATE TABLE IF NOT EXISTS  todo_repuestos.tod_productos ( "
                                          + " `nmid` int(11) NOT NULL AUTO_INCREMENT,\n" +
                                         "  `tod_nombre` varchar(200) NOT NULL,\n" +
                                         "  `tod_descripcion` varchar(30) NOT NULL,\n" +
                                         "  `tod_codigo_barra` BIGINT(22) NOT NULL,\n" +
                                         "  `tod_valor_unitario` decimal(7,0) DEFAULT NULL,\n" +
                                         " `tod_valor_iva` decimal(4,0) DEFAULT NULL,\n" +
                                         " `tod_valor_descuento` decimal(4,0) DEFAULT NULL,\n" +
                                         "  `tod_stock` BIGINT(22) NOT NULL,\n" +
                                         "  `cdestado` varchar(5) NOT NULL COMMENT 'D para disponible ; A para inactivo',\n" +
                                         "  `nmid_proveedor` int(11) NOT NULL,\n" +
                                         "  `dtfechacreacion` timestamp NOT NULL DEFAULT current_timestamp(),\n" +
                                         "  `dtfechamodificacion` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),\n" +
                                         "  PRIMARY KEY (`nmid`)\n" +
                                         ") ENGINE=InnoDB DEFAULT CHARSET=utf8;  ")){
  
                            System.out.println("No se crearon las tablas: "+ rs);
                        }else{
                            rs = stmt.getResultSet();
                            System.out.println("Tabla producto creada con exito OK!");
                        }
                         if(stmt.execute("CREATE TABLE IF NOT EXISTS  todo_repuestos.tod_proveedor (\n" +
                                        "  `nmid` int(11) NOT NULL AUTO_INCREMENT,\n" +
                                        "  `tod_p_nombre` varchar(200) NOT NULL,\n" +
                                        "  `tod_t_documento` varchar(3) NOT NULL COMMENT 'CC para Cedula ciudadania ; CE Cedula extranjera; PA para pasaporte',\n" +
                                        "  `tod_n_documento` BIGINT(22) NOT NULL,\n" +
                                        "  `tod_n_telefonico` BIGINT(22) NOT NULL,\n" +
                                        "  `tod_sexo` varchar(5) NOT NULL COMMENT 'M para masculino ; F para femenino; O para otros',\n" +
                                        "  `tod_c_electronico` varchar(50) NOT NULL,\n" +
                                        "  `tod_direccion` varchar(50) NOT NULL,\n" +
                                        "  `dtfechacreacion` timestamp NOT NULL DEFAULT current_timestamp(),\n" +
                                        "  `dtfechamodificacion` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),\n" +
                                        "  PRIMARY KEY (`nmid`)\n" +
                                        ") ENGINE=InnoDB DEFAULT CHARSET=utf8;")){                                   
                                      }else{
                                            rs = stmt.getResultSet();
                                            System.out.println("Tabla proveedor creada con exito OK!");
        
                                      }  
                            if(stmt.execute("CREATE TABLE IF NOT EXISTS todo_repuestos.tod_clientes (\n" +
                                    "  `nmid` int NOT NULL AUTO_INCREMENT,\n" +
                                    "   `tod_c_nombre` varchar(200) NOT NULL,\n" +
                                    "  `tod_t_documento` varchar(3) NOT NULL COMMENT 'CC para Cedula ciudadania ; CE Cedula extranjera ; PA para pasaporte',\n" +
                                    "  `tod_n_documento` BIGINT(22) NOT NULL,\n" +
                                    "  `tod_n_telefonico` BIGINT(22) NOT NULL,\n" +
                                    "  `tod_sexo` varchar(3) NOT NULL COMMENT 'M para masculino ; F para femenino; O para otros',\n" +
                                    "  `tod_d_cliente` varchar(200) DEFAULT NULL,\n" +
                                    "  `tod_estado` varchar(1) NOT NULL COMMENT 'A para Activo ; I para inactivo',\n" +
                                     "  `dtfechacreacion` timestamp NOT NULL DEFAULT current_timestamp(),\n" +
                                      "  `dtfechamodificacion` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),\n" +
                                       "  PRIMARY KEY (`nmid`)\n" +
                                    ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;")){                                   
                                      }else{
                                            rs = stmt.getResultSet();
                                            System.out.println("Tabla clientes creada con exito OK!");
        
                                      }
                               if(stmt.execute("CREATE TABLE IF NOT EXISTS todo_repuestos.tod_ventas (\n" +
                                        "  `nmid` int NOT NULL AUTO_INCREMENT,\n" +
                                        "  `tod_descripcion` varchar(200) NOT NULL,\n" +
                                        "  `nmid_producto` int(11) NOT NULL,\n" +
                                        "  `nmid_cliente` int(11)  NULL,\n" +
                                        "  `tod_n_cliente` varchar(200)  NOT NULL,\n" +
                                        "  `tod_cc_cliente` varchar(200) NOT NULL,\n" +
                                        "  `tod_cajero` varchar(200)  NOT NULL,\n" +
                                        "  `tod_vendedor` varchar(200)  NOT NULL,\n" +
                                        "  `tod_cantidad` BIGINT(22)  NOT NULL,\n" +
                                        "  `tod_total_iva` decimal(4,0) DEFAULT NULL,\n" +
                                        "  `tod_valor_total` decimal(7,0) DEFAULT NULL,\n" +
                                        "  `tod_pago` varchar(3) NOT NULL COMMENT 'E para efectivo ; T para transaccion',\n" +
                                        "  `tod_estado` varchar(3) NOT NULL COMMENT 'P para procesada ; S para sin procesar',\n" +
                                     "  `dtfechacreacion` timestamp NOT NULL DEFAULT current_timestamp(),\n" +
                                        "  `dtfechamodificacion` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),\n" +
                                        "  PRIMARY KEY (`nmid`)\n" +
                                        ") ENGINE=InnoDB DEFAULT CHARSET=utf8;")){                                   
                                      }else{
                                            rs = stmt.getResultSet();
                                            System.out.println("Tabla ventas creada con exito OK!");
        
                                      }
                                   
                                  //Alteracion de tablas    
                                    ResultSet result = stmt.executeQuery("SELECT IF( ( SELECT COUNT(CONSTRAINT_NAME) FROM INFORMATION_SCHEMA.KEY_COLUMN_USAGE WHERE TABLE_NAME = 'tod_ventas' AND CONSTRAINT_NAME != 'PRIMARY') > 0 , \"Foreing Keys Existentes\", \"No existe ninguna Foreing Key\" ) AS existencia_de_keys;");
                                      String existenciaKey =" ";
                                     while(result.next()){
                                          existenciaKey = result.getString("existencia_de_keys");
                                          //System.out.println("Key si:" + existenciaKey);
                                      }
                                     if("Foreing Keys Existentes".equals(existenciaKey)){
                                         System.out.println("Las Key existen");
 
                                     }else if("No existe ninguna Foreing Key".equals(existenciaKey)){
                                      stmt.execute( "ALTER TABLE todo_repuestos.tod_productos ADD CONSTRAINT FK_nmproveedor_proveedor FOREIGN KEY (nmid_proveedor) REFERENCES tod_proveedor (nmid);");
                                      stmt.execute("ALTER TABLE  todo_repuestos.tod_ventas ADD CONSTRAINT FK_nmproducto_producto FOREIGN KEY (nmid_producto) REFERENCES tod_productos (nmid);");
                                      stmt.execute("ALTER TABLE   todo_repuestos.tod_ventas ADD CONSTRAINT FK_nmcliente_producto FOREIGN KEY (nmid_cliente) REFERENCES tod_clientes (nmid);");
                                         
                                     }else{
                                         System.out.println("Database actualizada");
                                     }
                                
                    
                    }
                    catch (SQLException ex){
                        // handle any errors
                        System.out.println("Excepcion SQL: " + ex.getMessage());
                        System.out.println("Estado SQL: " + ex.getSQLState());
                        System.out.println("Error de usuario: " + ex.getErrorCode());
                        System.out.println("Localizacion de mensaje: " +  ex.getLocalizedMessage());
                    }
                    finally {
          
                        if (rs != null) {
                            try {
                                rs.close();
                            } catch (SQLException sqlEx) { } // ignore

                            rs = null;
                        }

                        if (stmt != null) {
                            try {
                                stmt.close();
                            } catch (SQLException sqlEx) { } // ignore

                            stmt = null;
                        }
                    

   }

}
           
public void InsertarCliente(String tod_c_nombre,String tod_t_documento, long tod_n_documento,  long tod_n_telefonico,String tod_sexo,
String tod_d_cliente,String tod_estado){
    String query = "INSERT INTO `tod_clientes`(`tod_c_nombre`, `tod_t_documento`, `tod_n_documento`, `tod_n_telefonico`, `tod_sexo`, `tod_d_cliente`, `tod_estado`) "+ "VALUES (?,?,?,?,?,?,?)";
    try (
            
       PreparedStatement pstmt = conn.prepareStatement(query)) {
                                        pstmt.setString(1, tod_c_nombre);
                                        pstmt.setString(2, tod_t_documento);
                                        pstmt.setLong(3, tod_n_documento);
                                        pstmt.setLong(4, tod_n_telefonico);
                                        pstmt.setString(5, tod_sexo);
                                        pstmt.setString(6, tod_d_cliente);
                                        pstmt.setString(7, tod_estado);
                                        
                   int affectedRows = pstmt.executeUpdate();
                   if(affectedRows>0){
                                        JOptionPane.showMessageDialog(null, null, "Registro de cliente exitoso", JOptionPane.OK_OPTION);
                   }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
}
public void Conexion(){
        try{
          //  Class.forName("org.gjt.mm.mysql.Driver");
            conn =  DriverManager.getConnection("jdbc:mysql://localhost/todo_repuestos","root", "");
            if(conn!=null){
                System.out.println("Conexion exitosa");
            }
        } catch (SQLException sqlEx) {
            System.out.println("Hay un error en la conexion: "+ sqlEx.getMessage());
             System.out.println("Hay un error en la conexion: "+ sqlEx.getSQLState());
              System.out.println("Hay un error en la conexion: "+ sqlEx.getLocalizedMessage());
        } 
    }
     public Connection connect() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost/todo_repuestos","root", "");
    }
           
}
/*
CREATE TABLE IF NOT EXISTS  `raf_pendiente` (
  `nmid` int(11) NOT NULL AUTO_INCREMENT,
  `dtfechareporte` timestamp NOT NULL DEFAULT current_timestamp(),
  `dspendiente` varchar(200) NOT NULL,
  `dsreportado` varchar(30) NOT NULL,
  `dtfechagestion` timestamp NULL DEFAULT NULL,
  `dsgestion` varchar(200) NOT NULL,
  `cdestado` varchar(5) NOT NULL COMMENT 'P para pendiente ;R para reportado; C para cerrado ; N para no aplica; S para Sin gestion',
  `nmbitacora` int(11) NOT NULL,
  `dtfechacreacion` timestamp NOT NULL DEFAULT current_timestamp(),
  `dtfechamodificacion` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  PRIMARY KEY (`nmid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `raf_pendiente` ADD CONSTRAINT FK_nmbitacoraid_pendinete FOREIGN KEY (nmbitacora) REFERENCES raf_bitacora (nmid)

stmt.execute("CREATE TABLE IF NOT EXISTS  `tod_productos` (
  `nmid` int(11) NOT NULL AUTO_INCREMENT,
  `tod_nombre` varchar(200) NOT NULL,
  `tod_descripcion` varchar(30) NOT NULL,
  `tod_codigo_barra` int NOT NULL,
  `tod_valor_unitario` decimal(7,0) DEFAULT NULL,
  `tod_stock` int NOT NULL,
  `cdestado` varchar(5) NOT NULL COMMENT 'D para disponible ; A para inactivo,
  `nmid_proveedor` int(11) NOT NULL,
  `dtfechacreacion` timestamp NOT NULL DEFAULT current_timestamp(),
  `dtfechamodificacion` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  PRIMARY KEY (`nmid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;");

CREATE TABLE IF NOT EXISTS  `tod_proveedor` (
  `nmid` int(11) NOT NULL AUTO_INCREMENT,
  `tod_p_nombre` varchar(200) NOT NULL,
  `tod_t_documento` varchar(3) NOT NULL COMMENT 'CC para Cedula ciudadania ; CE Cedula extranjera; PA para pasaporte',
  `tod_n_documento` int NOT NULL,
  `tod_n_telefonico` int NOT NULL,
  `tod_sexo` varchar(3) NOT NULL COMMENT 'M para masculino ; F para femenino; O para otros',
  `tod_c_electronico` varchar(50) NOT NULL,
  `tod_direccion` varchar(50) NOT NULL,
  `dtfechacreacion` timestamp NOT NULL DEFAULT current_timestamp(),
  `dtfechamodificacion` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  PRIMARY KEY (`nmid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `tod_clientes` (
  `nmid` int NOT NULL AUTO_INCREMENT,
   `tod_c_nombre` varchar(200) NOT NULL,
  `tod_t_documento` varchar(3) NOT NULL COMMENT 'CC para Cedula ciudadania ; CE Cedula extranjera; PA para pasaporte,
  `tod_n_documento` int NOT NULL,
  `tod_n_telefonico` int NOT NULL,
  `tod_sexo` varchar(3) NOT NULL COMMENT 'M para masculino ; F para femenino; O para otros,
  `tod_d_cliente` varchar(200) DEFAULT NULL,
  `tod_estado` varchar(1) NOT NULL COMMENT 'A para Activo ; I para inactivo',
  `dtfechacreacion` timestamp NOT NULL DEFAULT current_timestamp(),
  `dtfechamodificacion` timestamp NULL DEFAULT NULL current_timestamp() ON UPDATE current_timestamp(),
  PRIMARY KEY (`nmid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

CREATE TABLE IF NOT EXISTS `tod_ventas` (
  `nmid` int NOT NULL AUTO_INCREMENT,
  `tod_descripcion` varchar(200) NOT NULL,
  `nmid_producto` int(11) NOT NULL,
  `nmid_cliente` int(11)  NULL,
  `tod_n_cliente` varchar(200)  NOT NULL,
  `tod_cc_cliente` varchar(200) NOT NULL,
  `tod_cajero` varchar(200)  NOT NULL,
  `tod_vendedor` varchar(200)  NOT NULL,
  `tod_cantidad` int(11)  NOT NULL,
  `tod_total_iva` decimal(4,0) DEFAULT NULL,
  `tod_valor_total` decimal(7,0) DEFAULT NULL,
  `tod_pago` varchar(3) NOT NULL COMMENT 'E para efectivo ; T para transaccion',
  `tod_estado` varchar(3) NOT NULL COMMENT 'P para procesada ; S para sin procesar',
  `dtfechacreacion` timestamp NOT NULL DEFAULT current_timestamp(),
  `dtfechamodificacion` timestamp NULL DEFAULT NULL current_timestamp() ON UPDATE current_timestamp(),
  PRIMARY KEY (`nmid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

ALTER TABLE `tod_productos` ADD CONSTRAINT FK_nmproveedor_proveedor FOREIGN KEY (nmid_proveedor) REFERENCES tod_proveedor (nmid);
ALTER TABLE `tod_ventas` ADD CONSTRAINT FK_nmproducto_producto FOREIGN KEY (nmid_producto) REFERENCES tod_productos (nmid);
ALTER TABLE `tod_ventas` ADD CONSTRAINT FK_nmcliente_producto FOREIGN KEY (nmid_cliente) REFERENCES tod_clientes (nmid);
*/

//Necesito un campo multiple en los id(nmid_producto) para las ventas para cada cliente.

