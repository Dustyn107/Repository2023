package Ejecicios.JAVA;

import java.util.Scanner;

public class Ejercicio_6 {
  /*
    Para tributar un determinado impuesto se debe ser mayor de
    16 años y tener unos ingresos iguales o superiores a 1000 € mensuales.
    Escribir un programa que pregunte al usuario su edad y sus
    ingresos mensuales y muestre por
    pantalla si el usuario tiene que tributar o no.
   */
  public static void main(String[] args) {

      Scanner input1 = new Scanner(System.in);
      Scanner input2 = new Scanner(System.in);

      System.out.println("Ingrese su edad: ");
      int edad= input1.nextInt();
      System.out.println("cual es su ingreso mensaual: ");
      float ingreso = input2.nextFloat();

      if (edad>16 && ingreso >= 1000){
          System.out.println("usted debe pagar impuestos");
      }
      else {
          System.out.println("usted no debe pagar impuesto");
      }


  }

}
