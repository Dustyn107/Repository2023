package Ejecicios.JAVA;

import java.util.Scanner;

public class Ejercicio_4 {
    /*
     * Escribir un programa que almacene la cadena de caracteres contraseña en una variable,
     * pregunte al usuario por la contraseña e imprima por pantalla si la contraseña introducida
     * por el usuario coincide con la guardada en la variable sin tener en cuenta mayúsculas y
     * minúsculas.
     */
    public static void main(String[] args) {

        String savePass= "Contraseña";
        Scanner input= new Scanner(System.in);
        System.out.println("Ingrese su password: ");
        String passw = input.nextLine();

        if (passw.equalsIgnoreCase(savePass)) {

            System.out.println("las contraseñas coinciden...");
        }
        else{
            System.out.println("las contraseñas no son iguales");
        }


    }


}
