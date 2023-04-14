package Ejecicios.JAVA;

import java.util.Scanner;

public class Ejercicio_Bucle1 {

    public static void main(String[] args) {
        /*
        Escribir un programa que pida al usuario una palabra y la muestre por pantalla 10 veces.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la palabra a repetir: ");
        String word = input.nextLine();

        for ( int i=0; i <10 ; i++) {
            System.out.println(word);

        }

    }
}
