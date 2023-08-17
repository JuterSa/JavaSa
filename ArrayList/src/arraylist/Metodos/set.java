/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist.Metodos;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author pc
 */
public class set {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Victor");
        al.add("Luis");
        al.add("Elena");

        Iterator<String> it = al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

// Eliminamos el primer elemento
        al.set(2, "Teresa");

        it = al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
