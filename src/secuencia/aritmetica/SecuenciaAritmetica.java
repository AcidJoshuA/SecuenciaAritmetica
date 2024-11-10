/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuencia.aritmetica;

import java.util.Scanner;

/**
 *
 * @author jcplo
 */
public class SecuenciaAritmetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String palabras = "", palabra;
    for (int i=0; i < 10; i++) {
    System.out.println("Ingresa una palabra: ");
    palabra = teclado.nextLine();
    palabras = palabras + " " + palabra;
    }
    System.out.println("palabras");
   } 
}
