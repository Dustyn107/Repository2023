package Bucle_for;

import java.util.Scanner;

public class EjercicioFor1 {
    /*1. Escribir un programa que permita generar la
    tabla de un numero entero positivo N, comenzando desde el 1.
    Si el usuario escribe un numero incorrecto, el programa no se ejecutara
    En cambio , pregunta de nuevo por la informacion hasta que el
    dato sea correcto

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean comprobar = true;

        while (comprobar == true) { // creamos un condicion que mientras el contenido sea correcto se ejecute, sino estara preguntando hasta que sea correcto.

            System.out.println("Ingrese un numero positvo a validar: "); //solicimamos el ingreso de informacion
            int numero1 = input.nextInt(); //guardamos la informacion en la variable numero1.

            if (numero1 > 0) {
                System.out.println("El numero ingresado" + numero1 + " es positivo");

                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero1 + " X " + i + " = " + numero1 * i);
                }
                comprobar = false; // con este boleano lo que se quiere es que cuando se termine el ciclo, no continue preguntado y cierre el programa.


            } else {
                System.out.println(" El numero que se ingreso es negativo vuelva a ingresar a un valor ");
            }
        }

    }

}
