/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author USER
 */
public class Solution {
    public static int[] reporte(int[] codigos, int[] cantidades, int[] cantidadesMinimas){
        int resultadoCodigo[]={};
        for (int i = 0; i < codigos.length; i++) {
           if(cantidades[i] <= cantidadesMinimas[i]){
               System.out.println(codigos[i]);       
           }
        }
     return resultadoCodigo;
    }
    
}
