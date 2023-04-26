
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
public class EJ_3_MAYUSCULA_MINUSCULA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        frase=leer.next();
        System.out.println("Para la frase ingresa se obtiene lo siguiente en mayuscula es: "+frase.toUpperCase());
        System.out.println("Para la frase ingresa se obtiene lo siguiente en mayuscula es: "+frase.toLowerCase());
    }
   
}
/*Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java.*/