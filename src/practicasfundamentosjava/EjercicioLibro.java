package practicasfundamentosjava;

import java.util.Scanner;


public class EjercicioLibro {
    public static void main(String[] args) {
        System.out.println("Ecribe el titulo de tu libro preferido : ");
        Scanner consola = new Scanner(System.in);
        
        var tituloLibro=consola.nextLine();
        System.out.println("titulo= "+ tituloLibro);
        
        System.out.println("Escribe el autor de tu libro preferido : ");
        var autorLibro=consola.nextLine();
        System.out.println(tituloLibro+" "+"fue escrito por: "+autorLibro);
        
        
    }

}
