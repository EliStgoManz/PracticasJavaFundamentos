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
public class breakContinue {
    
    public static void main(String[] args) {
      
   for(var contador=0;contador<3;contador++){
      if(contador%2 !=0){
          continue;//ir a la siguiente iteración
          }
    System.out.println("contador= "+contador);
    }
   
   /*uso de la palabra break, en este ejemplo
   va imprimir lo numeros pares que se encuentren dentro del rango
   del 0 al 3*/
    /*for(var contador=0;contador<3;contador++){
      if(contador%2==0){
          System.out.println("contador= "+contador);
          break;
      }
    
    }*/
   
   
   
    }

    
}
