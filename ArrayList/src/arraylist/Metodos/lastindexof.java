/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist.Metodos;

import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class lastindexof {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

// Añadimos elementos
        list.add("Marta");
        list.add("Luis");
        list.add("Francisco");
        list.add("Luis");
        list.add("Sonsoles");
        list.add("José");

        String sElementoaBuscar = "Luis";

        int posicion = list.lastIndexOf(sElementoaBuscar);

        if (posicion > 0) {
            System.out.println("El último elemento " + sElementoaBuscar + " está en la lista en la posición " + (posicion + 1));
        } else {
            System.out.println("El elemento " + sElementoaBuscar + " NO está en la lista");
        }
    }

}
