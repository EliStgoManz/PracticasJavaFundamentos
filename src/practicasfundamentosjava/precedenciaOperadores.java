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
public class precedenciaOperadores {
    
    public static void main(String[] args) {
        var x=5;
        var y=10;
        var z= ++x + y--;
        
        System.out.println("X= "+x);
        System.out.println("y= "+y);
        System.out.println("z= "+z);
        
        var resultado= 4+ 5*6/3;
        System.out.println("resultado= "+resultado);
        
        resultado=(4+5)*6/3;
        System.out.println("result2="+resultado);
    }
    
}
