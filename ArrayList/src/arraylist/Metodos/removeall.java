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
public class removeall {

    public static void main(String[] args) {
        // ArrayList con tamaño
        ArrayList<String> al = new ArrayList<String>();

// Añadir elementos a un ArrayList
        al.add("1");
        al.add("2");
        al.add("3");
        al.add("1");
        al.add("4");
        al.add("5");
        al.add("1");
        al.add("6");
        al.add("7");
        
        System.out.println(al);

// Eliminamos todas las ocurrencias del 1
// while(al.remove("1"));
        ArrayList<String> eliminar = new ArrayList<String>();
        eliminar.add("1");
        eliminar.add("2");
        eliminar.add("210");
        al.removeAll(eliminar);

// Recorrer un ArrayList con un Iterador
        Iterator<String> it = al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
