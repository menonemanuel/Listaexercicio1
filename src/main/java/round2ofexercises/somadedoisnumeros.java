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
public class somadedoisnumeros {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        
        float num1, num2, resultado;
                
        System.out.println("ADIÇÃO");
        
        System.out.println("Informe o primeiro número: ");
        num1 = scanner.nextFloat();
                
        System.out.println("Informe o segundo número: ");   
        num2 = scanner.nextFloat();
    
        resultado = num1 + num2;
        
        System.out.println("O seu resultado é: " + resultado);
        
    }
      }

