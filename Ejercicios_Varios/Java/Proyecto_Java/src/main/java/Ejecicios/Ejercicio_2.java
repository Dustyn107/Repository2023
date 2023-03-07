package Ejecicios;

import java.util.Scanner;

public class Ejercicio_2 {
    /*Escribir un programa  que al escribir como dato un numero
    entero positivo N, Calcule el resultado de las siguientes series:
    1 + (1/2) + (1/3) +(1/4) ... (1/N)
    Si el usuario escribe un numero incorrecto, el programa no se ejecuta
    En cambio, pregunta de nuevo spor la informacion hasta que el dato sea correcto

     */
    public static void main(String[] args) {

        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese un numero entero positivo: ");
            int numero = input.nextInt();
            float resultado= 0;

            if (numero > 0) {
                System.out.println("el valor que se ingreso es correcto");
                for (int i=1;i<=numero; i++ ){

                    resultado = resultado +(1/(float)i);
                    System.out.println(" el resultado de es: "+ resultado);
                    {break;} // cierra el buvle infinito del while

                }


            } else {
                System.out.println("Error---> el numero (" + numero + ") no es entero");
            }
        }
    }

}
