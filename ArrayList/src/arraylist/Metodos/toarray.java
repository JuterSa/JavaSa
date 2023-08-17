/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist.Metodos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class toarray {

    public static void main(String[] args) {
        ArrayList<String> milista = new ArrayList<String>();
        milista.add("Elemento 1");
        milista.add("Elemento 2");

        String[] miarray = new String[milista.size()];
        miarray = milista.toArray(miarray);

        for (String s : miarray) {
            System.out.println(s);
        }
    }

}
