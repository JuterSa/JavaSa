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
public class remove {

    public static void main(String[] args) {
        // ArrayList con tamaño
        ArrayList<String> al = new ArrayList<String>();

// Añadir elementos a un ArrayList
        al.add("Victor");
        al.add("Luis");
        al.add("Elena");

// Recorrer un ArrayList con un Iterador
        Iterator<String> it = al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

// Eliminamos el segundo elemento
        al.remove(1);

        it = al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
    
        }
    }

}
