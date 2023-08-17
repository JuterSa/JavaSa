
package holamundojava;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class HolaMundoJava {

    public static void main(String[] args) {
        // TODO code application logic here
        /*System.out.println("Hola mundo Saul");  //sout+tap =produce automaticamente lineas System.out.println("");
        System.out.println("Ciclo 2 Udea"); 
        System.out.println("Saul Julio es el mejor");*/
        //String.
        
        System.out.println ("===============================================================");
        String numc;
        numc = "S";
        while(numc.equals("S") || numc.equals("s")){
        System.out.println ("Ingrese numero a multiplicar:_ numero ");
        int entradaTeclado = 0;
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        entradaTeclado = entradaEscaner.nextInt (); //Invocamos un método sobre un objeto Scanner
        for(int i= 0;i<=10;i++){
                //JOptionPane.showMessageDialog(null,);
                //JOptionPane.showConfirmDialog(null,num+" * "+i+" = " +num*i);
                //JOptionPane.showInternalMessageDialog(null,entradaTeclado+" * "+i+" = " +entradaTeclado*i);
                System.out.println(entradaTeclado+" * "+i+" = " +entradaTeclado*i);
            }
        System.out.println("Desea repetir ejecucion S/N"); //Esta linea la utilizo para preguntar si deseo hacer de nuevo el la ejecucion
        numc = entradaEscaner.next();// Esta linea me evalua la entrada que le di....
        if (numc.equalsIgnoreCase("S")){
            //continue;
        }else{
            break;
        }
       
        }
        System.out.println ("Gracias por ejecutar el nuevo programa"); 
        /*int num,numd,numt=0,numm=0;
        String numc;
        numc = "S";
        while(numc.equals("S") || numc.equals("s")){
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a multiplicar:"));
            JOptionPane.showMessageDialog(null,);
            JOptionPane.showConfirmDialog(null,"");
            System.out.println("Tabla del: "+num);
            for(int i= 0;i<=10;i++){
                //JOptionPane.showMessageDialog(null,);
                //JOptionPane.showConfirmDialog(null,num+" * "+i+" = " +num*i);
                JOptionPane.showInternalMessageDialog(null,num+" * "+i+" = " +num*i);
                //System.out.println(num+" * "+i+" = " +num*i);
            }
        /*while(numc.equals("S") || numc.equals("s")){ //Probando ciclo
            //
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a sumar 1:")); //Sentencia que me acepta un string
            numd = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a sumar 2:"));
            if (num>numd){
              JOptionPane.showMessageDialog(null,"A LA VERGA SAUL: " + num + " Es mayor que:_ "+ numd);
              numt =+ num;
            }else{
              JOptionPane.showMessageDialog(null,"A LA VERGA JUTER: " + numd + " Es mayor que:_ "+ num);
              numm =+numd;
            } 
             numc = JOptionPane.showInputDialog("Desea repetir ejecucion S/N");
       
        }*/
        //numc = JOptionPane.showInputDialog("Desea multiplicar de nuevo S/N"); */
        //JOptionPane.showMessageDialog(null,"LA SUMA DE LOS NUMERO MAYORE ES: "+ numt + " LA SUMA DE LAS CIFRAS MENORES ES: " + numm);  
   
        //}
    }
          
        
        
        
}
    
//Martillo con escoba _sirve para limpiar el archivo.