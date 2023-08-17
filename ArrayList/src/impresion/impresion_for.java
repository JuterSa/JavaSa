/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impresion;

import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class impresion_for {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();

        lista.add("hola");
        lista.add("que");
        lista.add("tal");
        lista.add("estas");
        lista.add("hoy");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

}
