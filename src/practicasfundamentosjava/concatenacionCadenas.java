package practicasfundamentosjava;

public class concatenacionCadenas {

    public static void main(String args[]) {
        var usuario = "Elí";
        var titulo = "ingeniero";

        var union = titulo + " " + usuario;

        System.out.println("union= " + union);

        var i = 3;
        var j = 4;

        System.out.println(i + j);//se realiza la suma de numeros
        System.out.println(i + j + usuario);//evaluacion de izq a der, realiza suma
        System.out.println(usuario + i + j);//conteto cadena, todo es una cadena
        System.out.println(usuario + (i + j));//uso de parentesis que modifican la prioridad

    }

}
