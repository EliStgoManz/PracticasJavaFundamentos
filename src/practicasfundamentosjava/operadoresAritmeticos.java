/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasfundamentosjava;

/**
 *
 * @author Elí Santiago
 */
public class operadoresAritmeticos {
    
    public static void main(String[] args) {
        int a=3, b=2;
        var resultado=a+b;
        System.out.println("resultado de la suma = " +resultado);
        
        resultado=a-b;
        System.out.println("resultado resta= "+ resultado);
        
        resultado=a*b;
        System.out.println("resultado de la multiplicacion= "+resultado);
        
        resultado= a/b;
        System.out.println("resultado division= "+resultado);
        
        var resultado2= 3d/b;
        System.out.println("resultado de división 2="+ resultado2);
        
        resultado= a%b;
        System.out.println("resultado de la operacion de modulo= "+ resultado);
        
        
        if(b%2==0)
           System.out.println("Es numero par");
        else
            System.out.println("Es numero impar");
        
    }
    
}
