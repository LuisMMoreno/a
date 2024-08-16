/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author lmmor
 */
import java.util.Scanner;
public class search_result {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in); //Iniciamos el objeto de Scanner llamandolo a
        operaciones xd=new operaciones();
	
	      
        System.out.println("--Calculos--");
        System.out.println("");
        System.out.print("Escriba dos numeros: ");
        int num1=a.nextInt();
        int num2=a.nextInt();
        
        xd.numeros(num1, num2);
        xd.suma();
        xd.resta();
        xd.multiplicacion();
        System.out.println("La suma de los numeros es de "+xd.suma);
        System.out.println("La resta de los numeros es de "+xd.resta);
        System.out.println("La multiplicacion de los numeros es de "+xd.multiplicacion);
        
        
    }
    
}
