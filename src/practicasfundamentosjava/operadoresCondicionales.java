
package practicasfundamentosjava;

/**
 *
 * @author Elí Santiago Manzano
 */
public class operadoresCondicionales {
    public static void main(String[] args) {
        var a=10;
        var valorMinimo=0;
        var valorMaximo=10;
        
        //operador and(si ambas condiciones son verdaderas, devuelve verdadero)
        var resultado=a>=0 && a<=10;
        if(resultado){
            System.out.println("dentro de rango");
        }else{
            System.out.println("fuera de rango");
        }
        
        
        var vacaciones=true;
        var diaDescanso=false;
        
        if(vacaciones || diaDescanso){
          System.out.println("Padre puede asistir al juego del hijo");
        }else{
           System.out.println("El padre esta ocupado");
        }
        
    }
    
   
    
    
}
