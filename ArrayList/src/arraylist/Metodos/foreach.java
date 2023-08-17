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
public class foreach {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

// Añadimos elementos
        list.add("Marta");
        list.add("Luis");
        list.add("Francisco");

        list.forEach((nu) -> System.out.println(nu));
    }

}
