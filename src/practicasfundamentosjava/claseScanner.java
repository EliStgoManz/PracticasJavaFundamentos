package practicasfundamentosjava;

import java.util.Scanner;

public class claseScanner {

    public static void main(String[] args) {
        System.out.println("Ecribe tu nombre: ");
        Scanner consola = new Scanner(System.in);
        
        var usuario=consola.nextLine();
        System.out.println("usuario= "+usuario);
        
        System.out.println("Escribe el titulo: ");
        var titulo=consola.nextLine();
        System.out.println("Resultado: "+titulo+" "+usuario);
    }

}
