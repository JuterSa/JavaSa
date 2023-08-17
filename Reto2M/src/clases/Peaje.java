
package clases;

public class Peaje {
     
    //EN ESTE ESPACIO SE ESCRIBEN LOS ATRIBUTOS DE LA CLASE Peaje
    String filaCoches[]; //Contiene las placas de los coches en la fila de espera para cruzar el peaje. __ Metodo constructor
    String cochesFlyPass[]={}; // Contiene las placas de los coches que estan agregados al programa Fly Pass
    boolean estadoPeaje = true;
    int cantidadCochesAtendidos = 1;
    int cocheEnAtencion = 0;
    
    //A CONTINUACIÓN, BAJO LOS ATRIBUTOS, SE ESCRIBEN LOS MÉTODOS DEFINIDOS
    //EN EL ENUNCIADO DEL PROBLEMA:
    public Peaje(String[] filaCoches) {
        //COMPLETE AQUÍ LA LÓGICA DEL CONSTRUCTOR SEGÚN EL ENUNCIADO DEL PROBLEMA
        this.filaCoches = filaCoches;
        String [] coches= new String [filaCoches.length];
        //this.cochesFlyPass = cochesFlyPass;
        for(int i=0;i<filaCoches.length;i++){
            coches[i]=" ";
        }
        this.cochesFlyPass = coches;
    }
    
    public void proximoCoche(){
        //COMPLETE AQUÍ LA LÓGICA DE ESTE MÉTODO SEGÚN EL ENUNCIADO DEL PROBLEMA
        if(estadoPeaje == true){   // Actualiza coche en atencion y actualiza coches atendidos.
            cantidadCochesAtendidos++;
            cocheEnAtencion++;
        }
        
    }
    
    //NO SE DEBE PREOCUPAR POR DESARROLLAR ESTE MÉTODO. ¡NO ELIMINARLO NI MODIFICARLO!
    public void agregarCocheFlyPass(){
        String cocheABuscar = filaCoches[cocheEnAtencion];
        for(String coche:cochesFlyPass){
            if(coche.equals(cocheABuscar)){
                break;
            }
            if(" ".equals(coche)){
                coche = cocheABuscar;
            }
        }
    }
    
    public void cambiarEstadoPeaje(){
        //COMPLETE AQUÍ LA LÓGICA DE ESTE MÉTODO SEGÚN EL ENUNCIADO DEL PROBLEMA
        if(estadoPeaje == true){
           estadoPeaje = false;
        }else if(estadoPeaje == false){
            estadoPeaje = true;
        }
        
    }
    
    //INSERTE LOS GETTERS Y SETTERS A PARTIR DE ACÁ:

    public String[] getFilaCoches() {
        return filaCoches;
    }

    public void setFilaCoches(String[] filaCoches) {
        this.filaCoches = filaCoches;
    }

    public String[] getCochesFlyPass() {
        return cochesFlyPass;
    }

    public void setCochesFlyPass(String[] cochesFlyPass) {
        this.cochesFlyPass = cochesFlyPass;
    }

    public boolean isEstadoPeaje() {
        return estadoPeaje;
    }

    public void setEstadoPeaje(boolean estadoPeaje) {
        this.estadoPeaje = estadoPeaje;
    }

    public int getCantidadCochesAtendidos() {
        return cantidadCochesAtendidos;
    }

    public void setCantidadCochesAtendidos(int cantidadCochesAtendidos) {
        this.cantidadCochesAtendidos = cantidadCochesAtendidos;
    }

    public int getCocheEnAtencion() {
        return cocheEnAtencion;
    }

    public void setCocheEnAtencion(int cocheEnAtencion) {
        this.cocheEnAtencion = cocheEnAtencion;
    }
    
    
    
    
}
