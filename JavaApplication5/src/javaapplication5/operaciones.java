/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author lmmor
 */
public class operaciones{
    int suma;
    int resta;
    int multiplicacion;
    int num1;
    int num2;
    
    public operaciones(){
    }
    
    public void numeros(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    }
    
    public void suma(){
        suma=num1+num2;
        
    }
    public void resta(){
        resta=num1-num2;
    }
    public void multiplicacion(){
        multiplicacion=num1*num2;
    }
    
    
    

}
