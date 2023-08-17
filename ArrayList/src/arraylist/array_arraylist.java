/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author pc
 */
//Declarar tamaño
public class array_arraylist {

    public static void main(String[] args) {

        //Declaración de array
        Scanner scan = new Scanner(System.in);
        int[] arrayOfSales = new int[100];
        arrayOfSales[0] = 12;
        arrayOfSales[1] = 25;
        for (int i = 0; i < 2; i++) {
            arrayOfSales[i] = scan.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(arrayOfSales[i]);
        }
        System.out.println(Arrays.toString(arrayOfSales));

        //Declaración de array List
        ArrayList<Integer> listOfSales = new ArrayList<>();
        listOfSales.add(12);
        listOfSales.add(25);

        for (int i = 0; i < listOfSales.size(); i++) {
            System.out.print(listOfSales.get(i));
        }

    }

}
