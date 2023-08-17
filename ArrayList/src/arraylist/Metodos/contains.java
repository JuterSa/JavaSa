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
public class contains {

    public static void main(String[] args) {
        ArrayList<Integer> misnumeros = new ArrayList<Integer>(2);
        Scanner reader = new Scanner(System.in);

        for (int x = 0; x < 2; x++) {
            System.out.println("Inserte un número");
            misnumeros.add(reader.nextInt());
        }

        System.out.println("Has cargado los siguientes números");

        for (int x = 0; x < misnumeros.size(); x++) {
            System.out.println(misnumeros.get(x));
        }

        System.out.println("Busca un número, 0 para salir");

        int numeroBuscar = reader.nextInt();

        while (numeroBuscar != 0) {
            if (misnumeros.contains(numeroBuscar)) {
                System.out.println("Contiene el número " + numeroBuscar);
            } else {
                System.out.println("No contiene el número " + numeroBuscar);
            }

            System.out.println("Busca un número, 0 para salir");

            numeroBuscar = reader.nextInt();
        }

        System.out.println("Fin del juego");

        reader.close();
    }

}
