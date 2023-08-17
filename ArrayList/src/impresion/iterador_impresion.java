/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impresion;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author pc
 */
//Una alternativa a esta situación es usar un Iterador .Un Iterador es un 
//        interface que dispone de los métodos hasNext() y next() y 
//        nos permite recorrer una colección de elementos.
public class iterador_impresion {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();

        lista.add("hola");
        lista.add("que");
        lista.add("tal");
        lista.add("estas");
        lista.add("hoy");

        Iterator<String> it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
