
package clases;
//Arreglo = new Tipodato[Tamañao];
public class Producto {
    private String idProducto;
    private String nombreProducto;
    private int valorProducto;
    private int cantidad;
    // Constructor..
    public Producto(String idProducto, String nombreProducto, int valorProducto, int cantidad) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.valorProducto = valorProducto;
        this.cantidad = cantidad;
    }

    public Producto(String nombreProducto, int valorProducto, int cantidad) {
        this.nombreProducto = nombreProducto;
        this.valorProducto = valorProducto;
        this.cantidad = cantidad;
    }
    
    // Metodos set and getter ()

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getValorProducto() {
        return valorProducto;
    }

    public void setValorProducto(int valorProducto) {
        this.valorProducto = valorProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public int total(){
       return this.cantidad * this.valorProducto;
    }
   
    
    
}
