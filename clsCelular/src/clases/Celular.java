
package clases;

public class Celular {
    //Atributos de la clase....
    String marca;
    String color;
    String imei;
    int modelo;
    
    //Constructor nos intancoia la clase..
    public Celular(String marca, String color, String imei, int modelo) {
        this.marca = marca;
        this.color = color;
        this.imei = imei;
        this.modelo = modelo;
    }
    
    //Metodos set y get

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
    
    
    //Metodos...
    //Metodo void no retorna ningun valor.
    public void llamadas(){
        System.out.println("El imei del equipo es: "+imei+ " Marca : "+marca+" Modelo: "+modelo);
    }
    
    // String- int-booleano_estructura de datos
    public String mensajeTexto(){
        return "Tiene un mensaje de texto del 3125069656";
    }
    
}
