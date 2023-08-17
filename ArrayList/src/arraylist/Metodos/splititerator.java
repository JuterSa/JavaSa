/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist.Metodos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Spliterator;

/**
 *
 * @author pc
 */
public class splititerator {

    public static void main(String[] args) {
        // ArrayList con tamaño
        ArrayList<Integer> lista = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Spliterator<Integer> si = lista.spliterator();
        si.forEachRemaining(n -> System.out.println(n));
    }

}
