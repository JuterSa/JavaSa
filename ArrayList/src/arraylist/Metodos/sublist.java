/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist.Metodos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author pc
 */
public class sublist {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        List<Integer> sublista = lista.subList(5, lista.size());

        Iterator<Integer> it = sublista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
