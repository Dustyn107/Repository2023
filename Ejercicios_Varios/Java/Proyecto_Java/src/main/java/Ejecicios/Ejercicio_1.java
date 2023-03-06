package Ejecicios;

import java.util.Scanner;

public class Ejercicio_1 {
    /*
    Escribe un programa que permita generar la tabla de un numero entero
    positivo N, comenzando desde 1.

    Si el usuario escribe un numero incorrecto el programa no se ejecuta , en cambio preguntara de nuevo por la informacion
    hasta que el dato ingresado sea correcto
     */

    public static void main(String[] args){

        boolean comprobar = true;

        while (comprobar==true) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un valor que sea entero positivo:  ");
        int numero1 = input.nextInt();


        if (numero1>0){
            System.out.println("el numero ingresado es correcto!!");
            for (int i=1; i<=10; i++){
                System.out.println(numero1+" X "+i+ " = "+ (numero1*i));
            }

            comprobar = false;

        }
        else {
            System.out.println("el numero es negativo, "+ " intenelo nuevamente");
        }

        }


    }
}
