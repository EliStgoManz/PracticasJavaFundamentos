/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYObjetosJava;

/**
 *
 * @author Elí Santiago Manzano
 */
public class PruebaPersona {
    
    public static void main(String[] args) {
     
     
      //Creación de un objeto
      Persona persona1=new Persona();
      persona1.nombre="Elí Santiago";
      persona1.apellido="manzano";
      persona1.desplegarInformacion();
      
      Persona persona2=new Persona();
      
      System.out.println("persona1= "+persona1);
      System.out.println("persona2= "+persona2);
              
      persona2.desplegarInformacion();
      persona2.nombre="freddy";
      persona2.apellido="Krugger";
      persona2.desplegarInformacion();
    }
    
}
