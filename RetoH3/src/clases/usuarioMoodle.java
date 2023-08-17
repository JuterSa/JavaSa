
package clases;

public class usuarioMoodle {
    private String nombreCompleto;
    private String documentoIdentidad;
    private String password;
    private String correo;
    private String descripcion;

    public usuarioMoodle(String nombreCompleto, String documentoIdentidad, String password, String correo, String descripcion) {
        this.nombreCompleto = nombreCompleto;
        this.documentoIdentidad = documentoIdentidad;
        this.password = password;
        this.correo = correo;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    // LOgica
    public void editarPerfil(String nombreCompleto, String documentoIdentidad, String password, String correo, String descripcion){
        this.nombreCompleto = nombreCompleto;
        this.documentoIdentidad = documentoIdentidad;
        this.password = password;
        this.correo = correo;
        this.descripcion = descripcion;
    }
    public void mostrar(){
        System.out.println("Nombre: "+ nombreCompleto+
                           "\nDocumento: " +documentoIdentidad+
                            "\nContraseña: "+ password+
                            "\nCorreo: "+correo+
                            "\nDescripcion: "+descripcion);
    }
    
}
