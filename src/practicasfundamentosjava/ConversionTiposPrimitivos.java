
package practicasfundamentosjava;

import java.util.Scanner;

public class ConversionTiposPrimitivos {
   
    public static void main(String[] args) {
      //convertir tipo String a un tipo int
        var edad=Integer.parseInt("20");
        System.out.println("edad= "+(edad+1));
        
     //convertir tipo double
     var valorPI= Double.parseDouble("3.1416");
        System.out.println("ValorPI= "+valorPI);
        
        
        var consola=new Scanner(System.in);
        System.out.println("Proporciona tu edad: ");
        //pedirems un valor
        edad=Integer.parseInt(consola.nextLine() );
        System.out.println("edad = "+edad);
        
        
        //convertir un tipo int  a un tipo string
        var edadTexto=String.valueOf(10);
        System.out.println("Edad texto= " + edadTexto);
        
        //como recuperar un carácter d una cadena
        var caracter="hola".charAt(0);
        System.out.println("caracter= "+caracter);
        
        caracter=consola.nextLine().charAt(0);
        System.out.println("proporciona el caracter: "+ caracter);
        
        
     
        
      
      
    }
}
