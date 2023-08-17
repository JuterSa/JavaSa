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
public class indexof {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Marta");
        list.add("Luis");
        list.add("Francisco");

        String sElementoaBuscar = "Luis";

        if (list.indexOf(sElementoaBuscar) >= 0) {
            System.out.println("El elemento " + sElementoaBuscar + " está en la lista");
        } else {
            System.out.println("El elemento " + sElementoaBuscar + " NO está en la lista");
        }
    }

}
