
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
public class EJ_5_DOBLE_TRIPLE_RAIZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        num=leer.nextInt();
        System.out.println("El doble del numero ingresado es: "+(num*num));
        System.out.println("El triple del numero ingresado es: "+(num*num*num));
        System.out.println("La raiz del numero ingresado es: "+Math.sqrt(num));
    }
}
/*Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().*/