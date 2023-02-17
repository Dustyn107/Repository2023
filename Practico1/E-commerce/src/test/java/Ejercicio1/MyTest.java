package Ejercicio1;

import Ejercicio1.Pages.Pagina1;
import Ejercicio1.Pages.Pagina2;
import Ejercicio1.Pages.Pagina3;
import org.testng.annotations.Test;

public class MyTest {

    @Test

    public void testing(){

       /* System.out.println("Hola!! Soy la pagina 1");
        System.out.println("Soy el titulo de la pagina 1 y estoy online");
        System.out.println("Quiero ir a la pagina 2");

        System.out.println("Hola!! Soy la pagina 2");
        System.out.println("Soy el titulo de la pagina 2 y estoy online");
        System.out.println("Quiero ir a la pagina 3");

        System.out.println("Hola!! Soy la pagina 3");
        System.out.println("Soy el titulo de la pagina 3 y estoy online");*/

        Pagina1 page1 = new Pagina1();
        page1.mostrarTitulo();
        page1.irAPagina();

        Pagina2 page2 =new Pagina2();
        page2.mostrarTitulo();
        page2.irAPagina3();

        Pagina3 page3 = new Pagina3();
        page3.mostrarTitulo();




    }
}
