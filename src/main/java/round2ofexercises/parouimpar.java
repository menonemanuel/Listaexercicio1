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
public class parouimpar {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        
        float num1;
        
        System.out.println("PAR_OU_ÍMPAR");
        
        System.out.println("Informe um número: ");
        num1= scanner.nextFloat();
       
        
        if(num1 % 2 == 0){
            System.out.println("O numéro par!");
            
        }else{
            System.out.println("O numéro ímpar!");
        }
    }
}
