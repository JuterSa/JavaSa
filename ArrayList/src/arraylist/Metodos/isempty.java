/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist.Metodos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class isempty {

    public static void main(String[] args) {
        // Definimos una ArrayList
        ArrayList<String> list = new ArrayList<String>();

// Lectura por consola
        Scanner reader = new Scanner(System.in);
        String sTexto = "";

// Añadimos elementos
        list.add("Elemento");
        list.add("Elemento");
        list.add("Elemento");

        System.out.println("Escriba ADD para añadir un elemento o DEL para borrarlo. FIN para terminar");

        do {
            sTexto = reader.next();

            if (sTexto.equals("ADD")) {
                list.add("Elemento");
            } else if (sTexto.equals("DEL")) {
                if (!list.isEmpty()) {
                    list.remove(list.size() - 1);
                } else {
                    System.out.println("La lista está vacía. No puedes borrar más elementos.");
                }
            }

            System.out.println("Hay " + list.size() + " elementos en la lista");

        } while (!sTexto.equals("FIN"));

        reader.close();
    }

}
