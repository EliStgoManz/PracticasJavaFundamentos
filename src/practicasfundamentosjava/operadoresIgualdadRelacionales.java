/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasfundamentosjava;

/**
 *
 * @author  Eli Santiago Manzano
 */
public class operadoresIgualdadRelacionales {
    
    public static void main(String[] args) {
        var a =3;
        var b=2;
        
        var c=(a==b);
        System.out.println("c= "+c);
        
        var d= a!=b;
        System.out.println("d= "+d);
        
        var cadena="Hola";
        var cadena2="Hola";
        var e=cadena==cadena2;//compara referencia de objetos
        System.out.println("e= "+e);
        
        
        var f=cadena.equals(cadena2);//comparamos contenido de cadenas
        System.out.println("f= "+f);
        
        
        var g=a >=b;//operador mayor que > o el mayor o igual >=
        System.out.println("g= "+g);
        
        if(a%2==0){
           System.out.println("Es numero par");
        }else{
            System.out.println("Es un numero impar");
         }
        
         var edad=30;
         var adulto=18;
         if(edad>=adulto){
             System.out.println("Es un adulto");
         }else{
             System.out.println("Es menor de edad");
         }
        
        
        
        
    }
    
}
