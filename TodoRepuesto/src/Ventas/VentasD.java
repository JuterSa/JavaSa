
package Ventas;

import java.util.Date;


/**
 *
 * @author Juter Sa
 */
public class VentasD {
    protected int nmid;
    protected String tod_descripcion;
    protected int nmid_cliente;
    protected String tod_n_cliente;
    protected String tod_cc_cliente;
    protected String tod_cajero;
    protected String tod_vendedor;
    protected int tod_cantidad;
    protected Double tod_valor_unitario;
    protected Double tod_valor_total;
    protected String tod_pago;
    protected String tod_estado;

    public VentasD(String tod_descripcion, int nmid_cliente, String tod_n_cliente, String tod_cc_cliente, String tod_vendedor, int tod_cantidad, Double tod_valor_unitario, Double tod_valor_total, String tod_pago, String tod_estado) {
        this.tod_descripcion = tod_descripcion;
        this.nmid_cliente = nmid_cliente;
        this.tod_n_cliente = tod_n_cliente;
        this.tod_cc_cliente = tod_cc_cliente;
        this.tod_vendedor = tod_vendedor;
        this.tod_cantidad = tod_cantidad;
        this.tod_valor_unitario = tod_valor_unitario;
        this.tod_valor_total = tod_valor_total;
        this.tod_pago = tod_pago;
        this.tod_estado = tod_estado;
    }
    
    /*
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
  `dtfechamodificacion`
    
    */

    public VentasD() {
    }

    public String getTod_descripcion() {
        return tod_descripcion;
    }

    public void setTod_descripcion(String tod_descripcion) {
        this.tod_descripcion = tod_descripcion;
    }

    public int getNmid_cliente() {
        return nmid_cliente;
    }

    public void setNmid_cliente(int nmid_cliente) {
        this.nmid_cliente = nmid_cliente;
    }

    public String getTod_n_cliente() {
        return tod_n_cliente;
    }

    public void setTod_n_cliente(String tod_n_cliente) {
        this.tod_n_cliente = tod_n_cliente;
    }

    public String getTod_cc_cliente() {
        return tod_cc_cliente;
    }

    public void setTod_cc_cliente(String tod_cc_cliente) {
        this.tod_cc_cliente = tod_cc_cliente;
    }

    public String getTod_cajero() {
        return tod_cajero;
    }

    public void setTod_cajero(String tod_cajero) {
        this.tod_cajero = tod_cajero;
    }

    public String getTod_vendedor() {
        return tod_vendedor;
    }

    public void setTod_vendedor(String tod_vendedor) {
        this.tod_vendedor = tod_vendedor;
    }

    public int getTod_cantidad() {
        return tod_cantidad;
    }

    public void setTod_cantidad(int tod_cantidad) {
        this.tod_cantidad = tod_cantidad;
    }

    public Double getTod_valor_unitario() {
        return tod_valor_unitario;
    }

    public void setTod_valor_unitario(Double tod_valor_unitario) {
        this.tod_valor_unitario = tod_valor_unitario;
    }

    public Double getTod_valor_total() {
        return tod_valor_total;
    }

    public void setTod_valor_total(Double tod_valor_total) {
        this.tod_valor_total = tod_valor_total;
    }

    public String getTod_pago() {
        return tod_pago;
    }

    public void setTod_pago(String tod_pago) {
        this.tod_pago = tod_pago;
    }

    public String getTod_estado() {
        return tod_estado;
    }

    public void setTod_estado(String tod_estado) {
        this.tod_estado = tod_estado;
    }
    
    
}
