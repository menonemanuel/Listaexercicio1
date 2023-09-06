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
public class médiadenotas {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        
        float num1, num2, num3, num4,média;
        
        System.out.println("Insira as notas do aluno: ");
        
        System.out.println("Primeira nota: ");
        num1 = scanner.nextFloat();
    
        System.out.println("Segunda nota: ");
        num2 = scanner.nextFloat();
        
        System.out.println("Terceira nota: ");
        num3 = scanner.nextFloat();
        
        System.out.println("Quarta nota: ");
        num4 = scanner.nextFloat();
        
        média = (num1 + num2 + num3 +num4) / 4;
        
       
        if (média >= 7){
            System.out.println("A média é: " + média);        
            System.out.println("Aluno aprovado!");

        }else{ 
            System.out.println("A média é: " + média);
            System.out.println("Aluno reprovado!");
        }
    }
}
    
