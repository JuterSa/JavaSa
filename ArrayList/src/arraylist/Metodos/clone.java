/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist.Metodos;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author pc
 */
public class clone {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

// Añadimos elementos
        list.add("Marta");
        list.add("Luis");
        list.add("Francisco");

// Obtenemos un Iterador y recorremos la lista.
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        ArrayList<String> list2 = (ArrayList<String>) list.clone();

// Obtenemos un Iterador y recorremos la lista.
        iter = list2.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

}
