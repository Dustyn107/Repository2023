package Ejercicios_Condicionales;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String args[]) {
//Declara dos variables numéricas (con el valor que desees),
// muestra por consola la suma, resta, multiplicación,
// división y módulo (resto de la división).


        //Vamos a solicitar que se ingrese y se los valores por pantalla

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un primer numero: ");
        int numero1 = input.nextInt();
        System.out.println("Ingrese un segundo numero: ");
        int numero2 = input.nextInt();

        if (numero1 == 0 && numero2 == 0) {
            System.out.println("No se admiten valor cero, vuelva a ingresar valores");
            }
        else {
            System.out.println("La suma de los valores ingresados es: " + (numero1 + numero2));
            System.out.println("La resta de los valores ingresados es: " + (numero1 - numero2));
            System.out.println("La multiplicacion de los valores ingresados es: " + (numero1 * numero2));
            System.out.println("La division de los valores ingresados es: " + (numero1 / numero2));
        }


    }
}
