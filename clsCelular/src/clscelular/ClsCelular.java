/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clscelular;
import clases.Celular;
/**
 *
 * @author USER
 */
public class ClsCelular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Celular cel1 = new Celular("Huawei", "Verde Turqui", "P_45678", 2022);
        cel1.llamadas();
        Celular cel2 = new Celular("Nokia", "Verde Marron", "P_45669", 2021);
        cel2.llamadas();
    }
    
}
