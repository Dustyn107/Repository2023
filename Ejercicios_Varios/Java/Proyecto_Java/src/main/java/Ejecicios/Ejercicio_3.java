package Ejecicios;

import java.util.Scanner;

public class Ejercicio_3 {

    /*
    Construir un programa que, al recibir como datos N numeros naturales
    determine cuantos de ellos son positivos, negativos o nulos.

    Si el usuario escribe un numero incorrecto, el programa no se ejecuta.
    En cambio, pregunta de nuevo por la informacion hasta que el dato ingresado sea corrrecto.
     */

    public static void main(String[] args) {

        while (true) {

            Scanner input = new Scanner(System.in);
            System.out.println("ingrese la cantidad de datos a analizar: ");
            int numero = input.nextInt();
            int positivo = 0, negativo = 0, cero = 0;

            if (numero > 0) {

                for (int i = 0; i < numero; i++) {
                    System.out.println("Ingrese un numero natural: ");

                    int numero_nat = input.nextInt();

                    if (numero_nat > 0) {

                        positivo++;
                    } else if (numero_nat < 0) { //else if traducuria "por otro lado si.."
                        //System.out.println("Numero negativo: ");
                        negativo++;
                    } else {
                        cero++;
                    }

                }


                System.out.println("la cantidad de numeros positvos es: " + positivo);
                System.out.println("la cantidad de numeros negativos es: " + negativo);
                System.out.println("la cantidad de numeros nulos es: " +     cero);

                {
                    break;
                }


            } else {
                System.out.println("El numero que ingreso no es correcto, vuelva a ingresar un numero");
            }

        }


    }

}
