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
public class get {

    public static void main(String[] args) {
        // ArrayList con tamaño
        ArrayList<String> al = new ArrayList<String>();

// Añadir elementos a un ArrayList
        al.add("Victor");
        al.add("Luis");
        al.add("Elena");

// Recorremos el Array
        for (int x = 0; x < al.size(); x++) {
            System.out.println(al.get(x));
        }
        
        System.out.println(al.get(1));
    }

}
