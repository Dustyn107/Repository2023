package Ejercicios_Condicionales;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String args[]) {

        //4. Escribir un programa que pida al usuario un
        // número entero y muestre por pantalla si es par o impar.

        Scanner input = new Scanner(System.in);  //----->capturo la informacion
        System.out.println("Ingrese un valor: "); //------> mensaje de pantalla
        int numero1 = input.nextInt(); //-------> variable donde almaceno la informacion


        if (numero1 % 2 == 0) {
            System.out.println("el numero que se ingreso es par");
        } else {
            System.out.println("el numero que ingreso es impar");
        }
    }
}
