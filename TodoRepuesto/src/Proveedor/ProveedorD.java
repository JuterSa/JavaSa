
package Proveedor;

/**
 *
 * @author Juter Sa
 */
public class ProveedorD {
    protected String tod_p_nombre;
    protected String tod_t_documento;
    protected long tod_n_documento;
    protected long tod_n_telefonico;
    protected String tod_sexo;
    protected String tod_c_electronico;   //Direccion
    protected String tod_direccion;

    public ProveedorD() {
    }

    public ProveedorD(String tod_p_nombre, String tod_t_documento, long tod_n_documento, long tod_n_telefonico, String tod_sexo, String tod_c_electronico, String tod_direccion) {
        this.tod_p_nombre = tod_p_nombre;
        this.tod_t_documento = tod_t_documento;
        this.tod_n_documento = tod_n_documento;
        this.tod_n_telefonico = tod_n_telefonico;
        this.tod_sexo = tod_sexo;
        this.tod_c_electronico = tod_c_electronico;
        this.tod_direccion = tod_direccion;
    }

    public String getTod_p_nombre() {
        return tod_p_nombre;
    }

    public void setTod_p_nombre(String tod_p_nombre) {
        this.tod_p_nombre = tod_p_nombre;
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

    public String getTod_c_electronico() {
        return tod_c_electronico;
    }

    public void setTod_c_electronico(String tod_c_electronico) {
        this.tod_c_electronico = tod_c_electronico;
    }

    public String getTod_direccion() {
        return tod_direccion;
    }

    public void setTod_direccion(String tod_direccion) {
        this.tod_direccion = tod_direccion;
    }
    

    
    
    
    /**
     *   `tod_p_nombre` varchar(200) NOT NULL,
  `tod_t_documento` varchar(3) NOT NULL COMMENT 'CC para Cedula ciudadania ; CE Cedula extranjera; PA para pasaporte',
  `tod_n_documento` int NOT NULL,
  `tod_n_telefonico` int NOT NULL,
  `tod_sexo` varchar(3) NOT NULL COMMENT 'M para masculino ; F para femenino; O para otros',
  `tod_c_electronico` varchar(50) NOT NULL,
  `tod_direccion` varchar(50) NOT NULL,
     
     */

}
