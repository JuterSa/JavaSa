/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist;

import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class Creacion {

    public static void main(String[] args) {
        // Array lit generico
        ArrayList arr = new ArrayList();

        // Array list por Tipo de objetos 
        //No se pueden usar tipos primitivos. Para un tipo primitivo se debe utilizar su clase envolvente.
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<String> arr3 = new ArrayList<>();
        ArrayList<Double> arr4 = new ArrayList<>();
        ArrayList<Float> arr5 = new ArrayList<>();
        ArrayList<Boolean> arr6 = new ArrayList<>();
//        ArrayList<int> arr8= new ArrayList<int>();
//        arr8.add(8)
        // Array list por Objetos
        ArrayList<Triangulo> arr7 = new ArrayList<>();
        Triangulo tr1 = new Triangulo();
        arr7.add(tr1);
        
        //object
         ArrayList<Object> arrayOfDifferentObject = new ArrayList<>();

        arrayOfDifferentObject.add("John Doe");
        arrayOfDifferentObject.add(10.00D);
        arrayOfDifferentObject.add(10);
        arrayOfDifferentObject.add(10.11F);

        //Clase 
        //Declaración de String de diferentes maneras
        String str1 = new String("En Java, los String son objetos");
        String str2 = new String("Se construyen de varias maneras");
        String str3 = new String(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        String saludo = "¡Hola Mundo!";
        System.out.println(saludo);
    }

}
