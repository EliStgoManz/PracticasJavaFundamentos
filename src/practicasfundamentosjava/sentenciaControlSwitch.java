/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasfundamentosjava;

/**
 *
 * @author Elí Santiago Manzano
 */
public class sentenciaControlSwitch {
    public static void main(String[] args) {
     var numero=2;
     var numeroTexto="valor desonocido";  
     
     switch(numero){
         case 1:
            numeroTexto="Numero uno";
            break;
            
         case 2:
             numeroTexto="Numero dos";
             break;
             
         case 3:
             numeroTexto="Numero tres";
             break;
         case 4:
             numeroTexto="Numero cuatro";
             break;
             
         default:
             numeroTexto="caso no encontrado";
     }
     System.out.println(numeroTexto);
    }
    
}
