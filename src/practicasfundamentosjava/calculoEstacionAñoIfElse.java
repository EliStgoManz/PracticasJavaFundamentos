/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasfundamentosjava;

/**
 *
 * @author Elí Snatiago Manzano Elí 
 */
public class calculoEstacionAñoIfElse {
    public static void main(String[] args) {
        var mes=13;
        var estacion="Estacion desconocida";
        
        if(mes==1 ||mes==2||mes==12){
           estacion="invierno"; 
           //System.out.println(estacion); 
        }else if(mes==3||mes==4||mes==5){
            estacion="primavera";
            //System.out.println(estacion);
        }else if(mes==6||mes==7||mes==8){
            estacion="verano";
            //System.out.println(estacion);
        }else if(mes==9||mes==10||mes==11){
            estacion="otoño";
            //System.out.println(estacion);
        }
        
        System.out.println("La estacion es: "+estacion);
    }
}
