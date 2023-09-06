/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package round2ofexercises;

import java.util.Scanner;

/**
 *
 * @author emanuel.4966
 */
public class IMC {
    
    
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
       
        
        float peso, altura, resultado;
        
        System.out.println("Insira o seu peso " + "kg");
        peso = scanner.nextFloat();
        
        System.out.println("Insira a sua altura em metros: ");
        altura = scanner.nextFloat();
        
        resultado = peso / (altura * altura);
        
        System.out.println("O seu IMC é de:" + resultado);
        
        
    } 
}
