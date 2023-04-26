
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sergio
 */
public class EJ_4_CONVERSION_DE_GRADO_FARA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double C;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese cantidad de grados centrigados: ");
        C=leer.nextDouble();
        System.out.println("Los grados ingresados son: "+(32+(9*(C/5)))+" Fahrenheit");
    }
    
}
/*Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).*/