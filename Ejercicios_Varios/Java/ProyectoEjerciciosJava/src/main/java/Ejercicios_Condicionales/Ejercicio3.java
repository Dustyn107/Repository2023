package Ejercicios_Condicionales;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String args[]) {

        // 2) Declara 2 variables numéricas (con el valor que desees),
        // he indica cual es mayor de los dos. Si son iguales indicarlo también.
        // Ves cambiando los valores para comprobar que funciona.

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un primer valor: ");
        System.out.println("Ingrese un primer numero: ");
        int numero1 = input.nextInt();
        System.out.println("Ingrese un segundo numero: ");
        int numero2 = input.nextInt();

        if (numero1 >= numero2) {
            if (numero1 == numero2) {
                System.out.println("los numeros ingresados " + numero1 + " son iguales y el " + numero2 + "son iguales");
            } else {
                System.out.println(" los numeros ingresados " + numero1 + "es mayor al segundo numero ingresado" + numero2);
            }
            else{
                System.out.println("El segundo numero" + numero2 + "es mayoer que el primer numero " + numero1;
            }

        }

    }
