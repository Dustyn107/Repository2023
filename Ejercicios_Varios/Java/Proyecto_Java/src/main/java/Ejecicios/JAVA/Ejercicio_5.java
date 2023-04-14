package Ejecicios.JAVA;

import java.util.Scanner;

public class Ejercicio_5 {
/*
Escribir un programa que pida al usuario dos números y muestre por
pantalla su división. Si el divisor es cero el programa debe mostrar un error.
 */
    public static void main(String[] args) {

        Scanner input1= new Scanner(System.in);
        Scanner input2= new Scanner(System.in);
        System.out.println("ingrese el dividendo valor: ");
        float valor1= input1.nextFloat();
        System.out.println("ingrese el divisor valor: ");
        float valor2= input2.nextFloat();

        float resultado = valor1/valor2;

        if (valor2==0){
            System.out.println("ERROR---> el divisor no puede ser cero");
        }
        else {
            System.out.println("la division es: " +resultado);
        }


    }

}
