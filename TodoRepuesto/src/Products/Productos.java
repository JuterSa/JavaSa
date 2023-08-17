package Products;

import java.util.Date;

/**
 *
 * @author Juter Sa
 */
public class Productos {
    protected int nmid;
    protected String tod_nombre;
    protected int tod_codigo_barra;
    protected Double tod_valor_unitario; 
    protected Double tod_valor_descuento; 
    protected int tod_stock;
    protected int nmid_proveedor;


       public Productos() {
     }

    public Productos(String tod_nombre, int tod_codigo_barra, Double tod_valor_descuento, int tod_stock, int nmid_proveedor) {
        this.tod_nombre = tod_nombre;
        this.tod_codigo_barra = tod_codigo_barra;
        this.tod_valor_descuento = tod_valor_descuento;
        this.tod_stock = tod_stock;
        this.nmid_proveedor = nmid_proveedor;
    }
       
       

    public int getNmid() {
        return nmid;
    }

    public void setNmid(int nmid) {
        this.nmid = nmid;
    }

    public String getTod_nombre() {
        return tod_nombre;
    }

    public void setTod_nombre(String tod_nombre) {
        this.tod_nombre = tod_nombre;
    }

    public int getTod_codigo_barra() {
        return tod_codigo_barra;
    }

    public void setTod_codigo_barra(int tod_codigo_barra) {
        this.tod_codigo_barra = tod_codigo_barra;
    }

    public Double getTod_valor_unitario() {
        return tod_valor_unitario;
    }

    public void setTod_valor_unitario(Double tod_valor_unitario) {
        this.tod_valor_unitario = tod_valor_unitario;
    }

    public Double getTod_valor_descuento() {
        return tod_valor_descuento;
    }

    public void setTod_valor_descuento(Double tod_valor_descuento) {
        this.tod_valor_descuento = tod_valor_descuento;
    }

    public int getTod_stock() {
        return tod_stock;
    }

    public void setTod_stock(int tod_stock) {
        this.tod_stock = tod_stock;
    }

    public int getNmid_proveedor() {
        return nmid_proveedor;
    }

    public void setNmid_proveedor(int nmid_proveedor) {
        this.nmid_proveedor = nmid_proveedor;
    }


    

}
