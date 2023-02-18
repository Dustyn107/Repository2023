package Ejercicio1.Pages;

public class Pagina1 {
    public Pagina1(){
        System.out.println("Hola!! Soy la pagina1");

    }
    public void mostrarTitulo(){
        System.out.println("Soy el titulo y estoy en online");
    }

    public Pagina2 irAPagina(){
        System.out.println("Quiero ir a la pagina 2");
        Pagina2 nextPage= new Pagina2();
        return nextPage;
    }

}
