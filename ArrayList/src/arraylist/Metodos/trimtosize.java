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
public class trimtosize {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

// Añadir elementos a un ArrayList
        al.add("Victor");
        al.add("Luis");
        al.add("Marta");

// Se ajusta el tamaño. Por defecto Java tiene preparado 1,5 la capacidad actual
        al.trimToSize();

        System.out.println(al);
        System.out.println(al.size());
    }

}
