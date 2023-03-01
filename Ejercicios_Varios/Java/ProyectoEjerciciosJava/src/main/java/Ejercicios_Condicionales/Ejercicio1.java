package Ejercicios_Condicionales;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main (String args[]) {
//Pedir el ingreso del nombre y el año de nacimiento. Mostrar el nombre y la edad de la persona.

        //Se crea una variable para el año y el nombre
        int year = 0;
        String name = "";
        //Captura de por teclado de la infomacion
        Scanner input = new Scanner(System.in);

        //mensaje que va a ver el usuario
        System.out.println("Ingresee su nombre: ");

        //donde va a quedar guardada el dato que se ingrese
        String nombre = input.next();

        //mensaje que va a ver el usuario
        System.out.println("Ingrese la fecha de su nacimiento: ");
        int Yearnaciment = input.nextInt();
        //Calcular edad
        int edad_Actual =2023 - Yearnaciment;

        System.out.println("Su nombre es: "+ nombre +" y su edad es: "+edad_Actual);


    }

}
