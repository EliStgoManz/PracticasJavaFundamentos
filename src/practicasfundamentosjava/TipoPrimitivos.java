package practicasfundamentosjava;

public class TipoPrimitivos {

    /*
    tipo primitivos enteros: byte,short,char,int, long
    
     */
    public static void main(String[] args) {
        byte numeroByte = (byte)129;
        System.out.println("Valor Byte: "+numeroByte);
        System.out.println("valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("valor maximo byte:" + Byte.MAX_VALUE);
        
        short numeroShort=(short)32768;
        System.out.println("numeroShort= "+numeroShort);
        System.out.println("valor minimo short: "+Short.MIN_VALUE);
        System.out.println("valor maximo short: "+Short.MAX_VALUE);
        
        int numeroInt=10;
        System.out.println("numero Int"+numeroInt);
        System.out.println("Valor minimo int:  "+ Integer.MIN_VALUE);
        System.out.println("valor maximo int: "+ Integer.MAX_VALUE);
        
        long numeroLong=10;
        System.out.println("numero long= "+numeroLong);
        System.out.println("valor minimo long: "+Long.MIN_VALUE);
        System.out.println("numero maximo long: "+ Long.MAX_VALUE);
        
        
        
                
    }

}
