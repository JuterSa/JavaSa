
package Clientes;

import java.util.ArrayList;

/**
 *
 * @author Juter Sa
 */
public class ClientesD {
    protected String tod_c_nombre;
    protected String tod_t_documento;
    protected long tod_n_documento;
    protected long tod_n_telefonico;
    protected String tod_sexo;
    protected String tod_d_cliente;   //Direccion
    protected String tod_estado;

    public ClientesD() {
    }

    public ClientesD(String tod_c_nombre, String tod_t_documento, long tod_n_documento, long tod_n_telefonico, String tod_sexo, String tod_d_cliente, String tod_estado) {
        this.tod_c_nombre = tod_c_nombre;
        this.tod_t_documento = tod_t_documento;
        this.tod_n_documento = tod_n_documento;
        this.tod_n_telefonico = tod_n_telefonico;
        this.tod_sexo = tod_sexo;
        this.tod_d_cliente = tod_d_cliente;
        this.tod_estado = tod_estado;
    }

    public String getTod_c_nombre() {
        return tod_c_nombre;
    }

    public void setTod_c_nombre(String tod_c_nombre) {
        this.tod_c_nombre = tod_c_nombre;
    }

    public String getTod_t_documento() {
        return tod_t_documento;
    }

    public void setTod_t_documento(String tod_t_documento) {
        this.tod_t_documento = tod_t_documento;
    }

    public long getTod_n_documento() {
        return tod_n_documento;
    }

    public void setTod_n_documento(long tod_n_documento) {
        this.tod_n_documento = tod_n_documento;
    }

    public long getTod_n_telefonico() {
        return tod_n_telefonico;
    }

    public void setTod_n_telefonico(long tod_n_telefonico) {
        this.tod_n_telefonico = tod_n_telefonico;
    }

    public String getTod_sexo() {
        return tod_sexo;
    }

    public void setTod_sexo(String tod_sexo) {
        this.tod_sexo = tod_sexo;
    }

    public String getTod_d_cliente() {
        return tod_d_cliente;
    }

    public void setTod_d_cliente(String tod_d_cliente) {
        this.tod_d_cliente = tod_d_cliente;
    }

    public String getTod_estado() {
        return tod_estado;
    }

    public void setTod_estado(String tod_estado) {
        this.tod_estado = tod_estado;
    }

    
    

    /**
     `tod_c_nombre` varchar(200) NOT NULL,
  `tod_t_documento` varchar(3) NOT NULL COMMENT 'CC para Cedula ciudadania ; CE Cedula extranjera; PA para pasaporte,
  `tod_n_documento` int NOT NULL,
  `tod_n_telefonico` int NOT NULL,
  `tod_sexo` varchar(3) NOT NULL COMMENT 'M para masculino ; F para femenino; O para otros,
  `tod_d_cliente` varchar(200) DEFAULT NULL,
  `tod_estado` varchar(1) NOT NULL COMMENT 'A para Activo ; I para inactivo',
     */
    
  
   
}

/**

public class Main {

    private String url = "jdbc:postgresql://localhost/dvdrental";
    private String user = "postgres";
    private String password = "postgres";

   
    public Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }


    public int updateLastName(int id, String lastName) {
        String SQL = "UPDATE actor "
                + "SET last_name = ? "
                + "WHERE actor_id = ?";

        int affectedrows = 0;

        try (Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(SQL)) {

            pstmt.setString(1, lastName);
            pstmt.setInt(2, id);

            affectedrows = pstmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return affectedrows;
    }


}
 
 */
