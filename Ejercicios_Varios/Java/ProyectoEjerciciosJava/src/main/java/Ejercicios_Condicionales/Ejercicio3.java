package Ejercicios_Condicionales;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        // 3) Declara 2 variables numéricas (con el valor que desees),
        // he indica cual es mayor de los dos. Si son iguales indicarlo también.
        // Ves cambiando los valores para comprobar que funciona.

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un primer valor: ");
        System.out.println("Ingrese un primer numero: ");
        int numero1 = input.nextInt();
        System.out.println("Ingrese un segundo numero: ");
        int numero2 = input.nextInt();

        if (numero1 > numero2) {
            System.out.println(numero1 + " es mayor que " + numero2);
        } else if (numero2 > numero1) {
            System.out.println(numero2 + " es mayor que " + numero1);
        } else {
            System.out.println(numero1 + " y " + numero2 + " son iguales");
        }
    }


}