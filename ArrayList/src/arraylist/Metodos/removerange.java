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
public class removerange extends ArrayList<Integer> {
    public static void main(String[] args) {
        // ArrayList con tamaño
		removerange numeros = new removerange();
				
		// Añadir elementos a un ArrayList
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		numeros.add(7);
		numeros.add(8);
		numeros.add(9);
			    			
		numeros.removeRange(3,6);

		// Recorrer un ArrayList con un Iterador
		Iterator<Integer> it = numeros.iterator();
		while(it.hasNext())
			System.out.println(it.next());
        
    }
    
}
