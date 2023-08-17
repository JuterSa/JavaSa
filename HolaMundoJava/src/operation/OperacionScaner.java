/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operation;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author USER
 */
public class OperacionScaner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("===================Juter=======SA=========");
        //System.out.println("&&&&&&&");
        
        System.out.println("Ingrese cantidad de estudiantes a evaluar");
        int cantidad = 0;
        float notamayor =0;
        float estudianteUno=0f;
        int es=0;
        System.out.println(cantidad);
        
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        cantidad = entradaEscaner.nextInt (); //Invocamos un método sobre un objeto Scanner
        int [] puesto = new int[cantidad];
        System.out.println(puesto.length);
        for(int i=0;i<cantidad;i++){
            System.out.println("Ingrese nota estudiante (,)"+i);
            estudianteUno = entradaEscaner.nextFloat();
            if(estudianteUno>notamayor){
                notamayor = estudianteUno;
                es = i;
            }else if(estudianteUno==notamayor){
                puesto[i]= i;
                System.out.println(puesto);
            }
        }
        System.out.println("El estudiante "+es+" Cuenta con la nota mas alta que es: "+notamayor+" SYSTEM JUTER");
        System.out.println(puesto[0]);
        System.out.println(puesto[1]);
        System.out.println(puesto[2]);
        
        
        
    }
    
}
