
package todorepuesto;

import Data.AutogenerarBD;
import Products.Productos;
import java.sql.Connection;
import java.time.Instant;
import java.util.Date;


/**
 *
 * @author Juter Sa
 */
public class TodoRepuesto {

    public static void main(String[] args) {
        AutogenerarBD DataBase = new AutogenerarBD();    
        DataBase.Autogenerate();
       // DataBase.Conexion();
       
 
    }
    
}
