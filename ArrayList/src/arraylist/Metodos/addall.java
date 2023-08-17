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
public class addall {

    public static void main(String[] args) {
        // ArrayList con tamaño
        ArrayList<String> al = new ArrayList<String>();

// Añadir elementos a un ArrayList
        al.add("Victor");
        al.add("Luis");
        al.add("Elena");
        System.out.println(al);

        ArrayList<String> vector = new ArrayList<String>();
        vector.add("Irene");
        vector.add("María");

// Añadir elementos al final del ArrayList
// Es una colección
        al.addAll(vector);
        System.out.println(al);
                

    }

}
