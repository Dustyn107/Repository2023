package Ejercicio1.Pages;

public class Pagina2 {

    public Pagina2() {
        System.out.println("Hola!! Soy la pagina2");
    }

    public void mostrarTitulo(){
        System.out.println("Soy el titulo 2 y estoy en online");
    }

    public Pagina3 irAPagina3(){
        System.out.println("Quiero ir a la pagina 2");
        Pagina3 nextPage= new Pagina3();
        return nextPage;
    }

}
