/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Factura {
    private String numeroFactura;
    private String fechaFactura;
    private int totalApagar;
    private Cliente cliente;
    private Producto productos[];

    public Factura(String numeroFactura, String fechaFactura, Cliente cliente, Producto[] productos) {
        this.numeroFactura = numeroFactura;
        this.fechaFactura = fechaFactura;
        //this.totalApagar = totalApagar;
        this.cliente = cliente;
        this.productos = productos;
    }

    public Factura(String numeroFactura, String fechaFactura, int totalApagar, Cliente cliente) {
        this.numeroFactura = numeroFactura;
        this.fechaFactura = fechaFactura;
        this.totalApagar = totalApagar;
        this.cliente = cliente;
    }

    public Factura(String numeroFactura, String fechaFactura, Cliente cliente) {
        this.numeroFactura = numeroFactura;
        this.fechaFactura = fechaFactura;
        this.cliente = cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public int getTotalApagar() {
        return totalApagar;
    }

    public void setTotalApagar(int totalApagar) {
        this.totalApagar = totalApagar;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void detalleFactura(Producto prod, int total) {
        System.out.println("Cant: " +prod.getCantidad()+
                "\tReferencia:\t " + prod.getNombreProducto()
                +"\tVlr_Unico:\t " + prod.getValorProducto()
                +"\tVlr_Total:\t " +"$"+total);

    }

    //Metodos logica de negocio.
    public void totalFactura(Producto[] productos) {
        int totalPagar = 0;
        System.out.println("Factura Numero: " + numeroFactura
                + "\nFecha Factura: " + getFechaFactura()
                + "\nId Cliente: " + cliente.getIdCliente()
                + "\nNombre: " + cliente.getNombreCliente() + " " + cliente.getApellidoCliente()
                + "\nTelefono: " + cliente.getTelefono()
                + "\n----------------------------------Juter System---------------------------------------"
        );
        for (Producto prod : productos) {  //Ciclo for loop java.
            int valor = prod.getValorProducto();
            int cantidad = prod.getCantidad();
            int total = valor * cantidad;
            detalleFactura(prod, total);
            totalPagar += total;

        }
        setTotalApagar(totalPagar);
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("El total de la factura es: " +"$"+getTotalApagar());
    }

    public void FacturaMasiva(ArrayList<Producto> producto) {
        ArrayList<Object> infoClienteFactura = new ArrayList<>();
       int totalPagar =0;
           for(Producto prod : producto) {  //Ciclo for loop java.
            int valor = prod.getValorProducto();
            int cantidad = prod.getCantidad();
            int total = valor * cantidad;   
            //detalleFactura(prod, total);
            totalPagar += total;

            }
        setTotalApagar(totalPagar);
        
        System.out.println("Efectivo: " +"$"+getTotalApagar());
        infoClienteFactura.add(totalPagar);
        //System.out.println("El total de la factura es "+infoClienteFactura);
        System.out.println("----------Juter System-------------");
        System.out.println("Le Atendio : VENTAS MOSTRADOR");
        System.out.println("CAJA #99");
       // return infoClienteFactura.toString();
    }
public void InfoFactura(ArrayList<Producto> producto){
     int totalPagar = 0;
        System.out.println("Factura Numero: " + numeroFactura
                + "\nFecha Factura: " + getFechaFactura()
                + "\nId Cliente: " + cliente.getIdCliente()
                + "\nNombre: " + cliente.getNombreCliente() + " " + cliente.getApellidoCliente()
                + "\nTelefono: " + cliente.getTelefono()
                + "\n-------------------------------------------------------------------------"
        );
        for (Producto prod : producto) {  //Ciclo for loop java.
            int valor = prod.getValorProducto();
            int cantidad = prod.getCantidad();
            int total = valor * cantidad;
            detalleFactura(prod, total);
            totalPagar += total;

        }
        setTotalApagar(totalPagar);
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Total a pagar: " +"$"+getTotalApagar());
}
    
    //return null;
}


