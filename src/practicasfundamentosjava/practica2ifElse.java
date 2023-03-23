/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasfundamentosjava;

/**
 *
 * @author Elí Santiago Manzano.
 */
public class practica2ifElse {
    public static void main(String[] args) {
    var numero=4;
    var numeroTexto="Numero desconocido";
        
     if(numero==1){
     numeroTexto="Numero uno";
     System.out.println("imprime el numero uno : "+numeroTexto);
     }else if(numero==2){
      numeroTexto="Numero dos";
      System.out.println("imprime el numero dos: "+ numeroTexto);
     }else if(numero==3){
      numeroTexto="Numero Tres";
      System.out.println("imprime el numero tres: "+numeroTexto);
     }else if(numero==4){
        numeroTexto="Numero cuatro";
        System.out.println("imprime el numero :"+numeroTexto);
     }else{
       numeroTexto="numero no encontrado";
       System.out.append("imprime: "+numeroTexto);
     }
        
        
        
    }
    
}
