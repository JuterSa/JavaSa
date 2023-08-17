/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist;

/**
 *
 * @author pc
 */
public class Triangulo {
    int base=0;
    int altura=0;
    String estilo;

    double area() {
        return base * altura / 2;
    }

    void mostrarEstilo() {
        System.out.println("Triangulo es: " + estilo);
    }
    
}
