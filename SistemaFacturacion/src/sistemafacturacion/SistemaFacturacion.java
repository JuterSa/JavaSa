
package sistemafacturacion;

import clases.*; // Trae todos los archivos que estan en el paquete clase
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
public class SistemaFacturacion {

    public static void main(String[] args) {
        // TODO code application logic here
        //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd"); // Formato para calcular la fecha.
        Scanner capDate = new Scanner(System.in);
        ArrayList<Producto> filtroProducto = new ArrayList<>();
        System.out.println("Probando ingreso de datos al object con Sccaner");   
        System.out.println("____________________________");
        System.out.println("Ingrese identificacion del cliente");
        String identificacion = capDate.nextLine();
        //---------
        System.out.println("Ingrese el nombre del cliente");
        String nombre = capDate.nextLine();
        //---------
        System.out.println("Ingrese el apellido del cliente");
        String apellido = capDate.nextLine();
        //---------
        System.out.println("Ingrese el numero telefonico cliente");
        String telefono = capDate.nextLine();
        //---------
        Cliente cliente = new Cliente(identificacion,nombre,apellido,telefono);
         System.out.println("______________Sajute99@Outlook.com______________");
        String validar = "S";
        while("S".equals(validar) || "s".equals(validar)){
        System.out.println("Ingrese el codigo del producto:");
        String idProducto = capDate.nextLine();
        //---------
        System.out.println("Ingrese el nombre del producto:");
        String nomProducto = capDate.nextLine();
        //---------
        System.out.println("Ingrese el precio");
        int precioProducto = capDate.nextInt();
        //---------
        System.out.println("Ingrese la cantidad de producto:");
        int cantProducto = capDate.nextInt();
         //---------
        Producto proUno = new Producto(idProducto, nomProducto, precioProducto, cantProducto);
        filtroProducto.add(proUno);
        //idProducto = null;
       System.out.println("Desea continuar con la ejecucion S/N");
       validar= capDate.next();
       nomProducto = " ";
       idProducto = null;
       }
          
        //Producto productos[] = {pr1,pr2,pr3,pr4}; //Arreglo normal para determinados datos pero lo cambiare por un list
        Factura fact1 = new Factura("FA-001",LocalDate.now().toString(), cliente);
        //String nombreProducto = productos[3].getNombreProducto();
        fact1.InfoFactura(filtroProducto);
        fact1.FacturaMasiva(filtroProducto);
        
        //System.out.println("El calculo total es :"+fact1.getTotalApagar());
                
        
    }
    
}
