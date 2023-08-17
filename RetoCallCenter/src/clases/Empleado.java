
package clases;

public class Empleado {
    private int id;
    private String nombre;
    private String apellido;       
    private int horasExtra;
    private boolean auxilioTransporte;
    private int salario;
    private String cedula;
    
    //Constructor:

 

    public Empleado(int id, String nombre, String apellido, boolean auxilioTransporte, int salario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.auxilioTransporte = auxilioTransporte;
        this.salario = salario;
    }

    public Empleado(int id, String nombre, String apellido, int horasExtra, boolean auxilioTransporte, int salario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.horasExtra = horasExtra;
        this.auxilioTransporte = auxilioTransporte;
        this.salario = salario;
    }

    public Empleado(int id, String nombre, String apellido, int horasExtra, boolean auxilioTransporte, int salario, String cedula) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.horasExtra = horasExtra;
        this.auxilioTransporte = auxilioTransporte;
        this.salario = salario;
        this.cedula = cedula;
    }
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    
    public Empleado(){
        
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public boolean isAuxilioTransporte() {
        return auxilioTransporte;
    }

    public void setAuxilioTransporte(boolean auxilioTransporte) {
        this.auxilioTransporte = auxilioTransporte;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    
    
}
