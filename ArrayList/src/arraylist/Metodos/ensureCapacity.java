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
public class ensureCapacity {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

// Aseguramos la capacidad para 3 elementos
        list.ensureCapacity(3);

        System.out.println("El tamaño del ArrayList es " + list.size());

// Añadimos elementos
        list.add("Marta");
        list.add("Luis");
        list.add("Francisco");

        System.out.println("El tamaño del ArrayList es " + list.size());
    }

}
