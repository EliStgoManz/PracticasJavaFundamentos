/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasfundamentosjava;

/**
 *
 * @author Eli Santiago Manzano.
 */
public class operadoresUnarios {
      
    public static void main(String[] args) {
        var a=3;
        var b= -a;
        
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        
        var c=true;
        var d=!c;
        
        System.out.println("c= "+c);
        System.out.println("d= "+d);
        
        //incremento
        //1.preincremento(simbolo antes de la variable)
        
        var e=3;
        var f=++e;
        
        System.out.println("e= "+e);
        System.out.println("f= "+f);
       
        
        //2.-postincremento(simnolo despues de lla variable)
        var g=5;
        var h=g++;//primero se utiliza l valor y despues de incrementa
        System.out.println("g= "+g);
        System.out.println("h= "+h);
        
        //decremento(disminuir en uno nuestra variable)
        var i=2;
        var j =--i;
        
        System.out.println("i= "+i);
        System.out.println("j="+j);
        
        //2.-postincremento
        var k=4;
        var l=k--;//primero se usa el valor de la variable y queda pendiente decrementar
        
        System.out.println("k= "+k);
        System.out.println("l= "+k);
        
        
        
    }
    
}
