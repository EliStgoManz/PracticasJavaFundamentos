/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasfundamentosjava;

/**
 *
 * @author jose
 */
public class PracticesFundamentosJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);

        //Modificamos el valor de la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);

        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);

        miVariableCadena = "adios";
        System.out.println(miVariableCadena);

        //var- inferencia de tipos en java
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);

        var miVariableCadena2 = "nueva cadena";
        System.out.println("miVariable2= " + miVariableCadena2);

    }

}
