
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
public class Ej_1_SUMA_DE_ENTEROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1,num2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero entero");
        num1=leer.nextInt();
        System.out.println("Ingrese el segundo numero entero");
        num2=leer.nextInt();  
        System.out.println("La suma de los numeros ingresados es: "+(num1+num2));
    }
    
}
/*Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma*/