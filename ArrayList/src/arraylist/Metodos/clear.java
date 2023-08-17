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
public class clear {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Victor");
        al.add("Luis");
        al.add("Elena");

        System.out.println("La lista contiene " + al.size() + " elementos");

// Eliminamos todos los elementos
        al.clear();

        System.out.println("La lista contiene " + al.size() + " elementos");
    }

}
